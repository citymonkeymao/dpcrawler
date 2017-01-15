package decoder;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import bean.Shop;

public class ShopDecoder {
	public static List<Shop> decode(String orgText)
	{
		List<Shop> ret = new ArrayList<Shop>();
		JSONObject jObj = JSON.parseObject(orgText);
		JSONArray shopList = jObj.getJSONArray("list");
		for(Object item : shopList)
		{
			JSONObject shopJson = (JSONObject)item;
			Shop s = new Shop();
			s.setCategory(shopJson.getString("categoryName"));
			s.setName(shopJson.getString("name"));
			s.setPrice(shopJson.getString("priceText"));
			s.setPhoto(shopJson.getString("defaultPic"));
			s.setShopId(shopJson.getString("id"));
			ret.add(s);
		}
		return ret;
	}

}
