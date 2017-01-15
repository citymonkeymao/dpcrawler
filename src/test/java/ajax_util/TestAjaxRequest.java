package ajax_util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestAjaxRequest {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		AjaxRequest aq = new AjaxRequest(
				"http://mapi.dianping.com/searchshop.json");
		aq.addParam("start", "75");
		aq.addParam("regionid", "0");
		aq.addParam("categoryid", "10");
		aq.addParam("sortid", "0");
		aq.addParam("locatecityid", "2379");
		aq.addParam("cityid", "2379");
		aq.addParam("_", String.valueOf( System.currentTimeMillis()));
		aq.send();
		System.out.println(aq.get());
	}

}
