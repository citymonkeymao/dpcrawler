package ajax_util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AjaxRequest {
	private String url;
	private Map<String, String> params;
	private InputStream resultStream;
	private static ExecutorService executor;
	private boolean sendFailed = false;

	public AjaxRequest(String url) {
		this.url = url;
		this.params = new HashMap<String, String>();
		if (executor == null) {
			executor = Executors.newFixedThreadPool(10);
		}
	}

	public void addParam(String key, String value) {
		params.put(key, value);
	}

	// send HTTP GET request
	public void send() throws IOException {
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append(url);
		Set<String> paramNames = params.keySet();
		if (paramNames.size() > 0) {
			urlBuilder.append("?");
			for (String param : paramNames) {
				urlBuilder.append(param);
				urlBuilder.append("=");
				urlBuilder.append(params.get(param));
				urlBuilder.append("&");
			}
			urlBuilder.deleteCharAt(urlBuilder.length() - 1);
		}
		String requestUrl = urlBuilder.toString();
		URL urlObj = new URL(requestUrl);
		URLConnection connection = urlObj.openConnection();
		connection
				.setRequestProperty(
						"User-Agent",
						"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
		// connection.connect();
		executor.execute(new Runnable() {
			private URLConnection connection;
			public Runnable setConnection(URLConnection con)
			{
				this.connection = con;
				return this;
			}
			@Override
			public void run() {
				try {
					resultStream = this.connection.getInputStream();
				} catch (IOException e) {
					System.out
							.println("error on sending query request, reason: "
									+ e.getMessage());
					sendFailed = true;
				}
				
			}

		}.setConnection(connection));
		
	}

	public String get() throws IOException {
		while(resultStream == null && sendFailed == false)
		{
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			  continue;	
			}
		}
		if(sendFailed)
		{
			return "";
		}
		//System.out.println("got");
		BufferedReader in = new BufferedReader(new InputStreamReader(
				resultStream));
		StringBuilder retBuilder = new StringBuilder();
		String line;
		while ((line = in.readLine()) != null) {
			retBuilder.append(line);
		}
		return retBuilder.toString();
	}
}
