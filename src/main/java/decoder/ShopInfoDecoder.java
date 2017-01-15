package decoder;

import org.apache.commons.lang3.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class ShopInfoDecoder {
	private Document doc;
	public  ShopInfoDecoder(String orgText)
	{
		this.doc = Jsoup.parse(orgText);
	}
	public String getAddress()
	{
		Elements addr = doc.select(".icon-address");
		Node n = addr.first().nextSibling();
		return StringEscapeUtils.unescapeHtml4(n.toString());
	}
	public String getPhone()
	{
		Elements phone = doc.select(".icon-call");
		Node n = phone.first().nextSibling();
		return StringEscapeUtils.unescapeHtml4(n.toString());
	}
	

}
