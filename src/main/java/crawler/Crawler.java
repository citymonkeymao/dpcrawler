package crawler;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import decoder.ShopDecoder;
import decoder.ShopInfoDecoder;

import ajax_util.AjaxRequest;
import bean.Shop;

public class Crawler {
	public List<Shop> craw(String cityid, int maxItem) {
		List<Shop> shopList = new ArrayList<Shop>();
		int ShopNumber = 0;
		while (ShopNumber < maxItem) {
			try {
				AjaxRequest aq = new AjaxRequest(
						"http://mapi.dianping.com/searchshop.json");
				aq.addParam("start", String.valueOf(ShopNumber));
				aq.addParam("regionid", "0");
				aq.addParam("categoryid", "10");
				aq.addParam("sortid", "0");
				aq.addParam("locatecityid", cityid);
				aq.addParam("cityid", cityid);
				aq.addParam("_", String.valueOf(System.currentTimeMillis()));
				aq.send();
				String shopString = aq.get();
				JSONObject jObj = (JSONObject) JSON.parse(shopString);
				List<Shop> shopOnPage = ShopDecoder.decode(shopString);
				System.out.println(shopOnPage.size() + " shops on this page");
				shopList.addAll(shopOnPage);
				ShopNumber += shopOnPage.size();
				if (jObj.getBooleanValue("isEnd")) {
					System.out.println("crawler stoped, reason: end of shop");
					break;
				}
			} catch (Exception e) {
				System.out.println("crawler exception, reason: "
						+ e.getMessage());
				e.printStackTrace();
				continue;
			}
			System.out.println(ShopNumber + " shops found in total");
		}
		System.out.println("retriving details of shops");
		getDetail(shopList);
		return shopList;
	}

	private void getDetail(List<Shop> shops) {
		AjaxRequest[] requests = new AjaxRequest[shops.size()];
		for (int i = 0; i < shops.size(); i++) {
			requests[i] = new AjaxRequest("http://m.dianping.com/shop/"
					+ shops.get(i).getShopId());
			try {
				System.out.print("*");
				requests[i].send();
			} catch (Exception e) {
				System.out.println("get detail failed, reason: "
						+ e.getClass().getName() + " " + e.getMessage());
			}
		}
		for (int i = 0; i < shops.size(); i++) {
			try {
				// System.out.println("trying to get detail");
				String html = requests[i].get();
				ShopInfoDecoder sid = new ShopInfoDecoder(html);
				shops.get(i).setAddress(sid.getAddress());
				shops.get(i).setPhone(sid.getPhone());
			} catch (Exception e) {
				System.out.println("\nget detail failed, shopid = "
						+ shops.get(i).getShopId() + ". reason: "
						+ e.getMessage() + ". ignored");
			}
		}
	}

}
