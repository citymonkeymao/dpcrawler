package decoder;

import java.util.List;

import bean.Shop;

public class TestShopDecoder {
	public static void main(String[] args)
	{
		List<Shop> ret = ShopDecoder.decode("{\"brandKeyword\":false,\"isEnd\":false,\"list\":[{\"adShop\":false,\"altName\":\"休闲小站\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"Chinatown\",\"categoryId\":210,\"categoryName\":\"快餐\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/7Klw8QImwJEXxZESUbUj2igqVcTpg1V0-1MYWV3cyYIVnBGjkhpKEC5GfeK-Ez0-_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":2500798,\"matchText\":\"唐人街  快餐\",\"memberCardId\":0,\"name\":\"Easy Way Tea\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"41d3920947709ae8159ca3ce08ce035e\",\"priceText\":\"￥27/AUD 5\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"唐人街\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":117,\"categoryName\":\"面包甜点\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/o9tiayNbuZ773nEHtLT2l-0bWrwkFzZKJO4X-qj1WissZlxvEhjgdNXYWzeu-SYp_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":18729927,\"matchText\":\"TheRocks  面包甜点\",\"memberCardId\":0,\"name\":\"Ladurée\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"90024b774078406980edd143bbcb5546\",\"priceText\":\"￥110/AUD 21\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"TheRocks\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":469,\"categoryName\":\"日韩料理\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/A9FwHU7V-qd2ZdOLP7N_cL7mL7A4Mg_QJWha3Ahir7d-RM1DpXZt13NUAK0r0kjC_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":3276346,\"matchText\":\"悉尼歌剧院  日韩料理\",\"memberCardId\":0,\"name\":\"一番星\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"951af33cf175fafe5a6086e67bf4f405\",\"priceText\":\"￥72/AUD 14\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"悉尼歌剧院\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabel\":\"当地老字号\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"Woolloomoo\",\"categoryId\":210,\"categoryName\":\"快餐\",\"cityId\":2379,\"defaultPic\":\"https://p0.meituan.net/ugcpic/ff233e02b2e58d432297c65f25f3b2b8%40120w_120h_1e_1c_1l%7Cwatermark%3D1%26%26r%3D1%26p%3D9%26x%3D2%26y%3D2%26relative%3D1%26o%3D20\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":18725309,\"matchText\":\"Woolloomooloo  快餐\",\"memberCardId\":0,\"name\":\"Harry's Cafe de Wheels\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"http://p0.meituan.net/ugcpic/ff233e02b2e58d432297c65f25f3b2b8\",\"priceText\":\"￥40/AUD 8\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"Woolloomooloo\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"city\",\"categoryId\":24889,\"categoryName\":\"中餐厅\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/zCw4uHGs822pGLBM50GGBlgp-Hnp6Hg0MIu-YkF9E6KnaWB5pQE-0MENC6SaYjHl_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":22458438,\"matchText\":\"唐人街  中餐厅\",\"memberCardId\":0,\"name\":\"黄记煌\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"21e4b046ce3a404c49d6d61919a8db57\",\"priceText\":\"\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"唐人街\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":251,\"categoryName\":\"海鲜\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/uvFAyCAnmHb79QPt9_sTsYt5-DZcXHhyMcnV7mo3XaYiWckIbiCo3OTQ4xPEhrct_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":15131295,\"matchText\":\"北区  海鲜\",\"memberCardId\":0,\"name\":\"星城海鲜酒家\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"01ef7dc327b373e2039a5f4720df6ddf\",\"priceText\":\"￥217/AUD 42\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"北区\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"Pyrmont\",\"categoryId\":24889,\"categoryName\":\"中餐厅\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/SKGeBdpu8TSLov_8e95-laixdQZ66QsWAFpKT8qjDgvR7Vgtxuf-v_GOtsJd4pCA_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":20890501,\"matchText\":\"达令港  中餐厅\",\"memberCardId\":0,\"name\":\"北方拉面馆\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"592e51962722739e7e9483fb72123833\",\"priceText\":\"￥24/AUD 5\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"达令港\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"Golden Century\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":103,\"categoryName\":\"粤菜\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/3xzKgKwz2HLQ4or9ZVW_V3miktIrJQmbbtmsKJ2aoF9fIrBx1qjFI1IJwOwyeAgb_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":8387072,\"matchText\":\"悉尼歌剧院  粤菜\",\"memberCardId\":0,\"name\":\"金唐荟\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"4b8c65cdef7ce512df1d7f9af25ac4d6\",\"priceText\":\"￥864/AUD 167\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"悉尼歌剧院\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":45,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"邦迪海滩\",\"categoryId\":133,\"categoryName\":\"酒吧\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/YdGPH3aNGO15th3jKN4hDiONAlbX5uoUOJcyj6gVbersyAGNfJ1pc9w7eCaXoMGn_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":8382920,\"matchText\":\"BondiBeach  酒吧\",\"memberCardId\":0,\"name\":\"Hurricane's Grill\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"481266126a7dc516a27a593cab9977cd\",\"priceText\":\"￥171/AUD 33\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"BondiBeach\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":117,\"categoryName\":\"面包甜点\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/bTT3wFeNU_mJUN_WvGnEJ9p6q2qARWOrqVFjwcvx5HANdtNylZX1pkGuwDqPCzmh_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":22216370,\"matchText\":\"CBD  面包甜点\",\"memberCardId\":0,\"name\":\"Aqua S（Regent Place Arcade ）\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"49e30172eabd4717a3028d2834381992\",\"priceText\":\"￥31/AUD 6\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"CBD\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"The Rocks\",\"categoryId\":132,\"categoryName\":\"咖啡厅\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/RpP9BSXejHEBzhIXwGPUZdDgNt9Mq2_BLgBdyb7SXIpXOxlrP9OrbeXc-9wcX0t4_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":5377342,\"matchText\":\"TheRocks  咖啡厅\",\"memberCardId\":0,\"name\":\"The Rocks Cafe\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"ba5a5d38fbd413c352498d555f997324\",\"priceText\":\"\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"TheRocks\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":32737,\"categoryName\":\"更多美食\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/Czqv13YyEcROxhqwdOY5d0WsMgQIcSuwH9iTHPgihQ0s4zkFWsiNVa9utiDliPcG_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":23741723,\"matchText\":\"悉尼  更多美食\",\"memberCardId\":0,\"name\":\"Devon\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"14e6603479f40ac65f85f9b8b6541f1b\",\"priceText\":\"￥159/AUD 31\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"悉尼\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":50,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"Two Sticks   Yunnan China 醉云南\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":24889,\"categoryName\":\"中餐厅\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/SBCKgRrarvmEub2L1YT-EN_q6WFi3XJN0nU9LcmsRHFCPkWLDk0eI9B8Xgm4UCmm_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":22454950,\"matchText\":\"唐人街  中餐厅\",\"memberCardId\":0,\"name\":\"金汤玉线\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"3bb9a0889467d007c8ca7bd14461e3ce\",\"priceText\":\"￥75/AUD 15\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"唐人街\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":251,\"categoryName\":\"海鲜\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/ayOogNcudv9szB1EPfu9csW5glTyG2moCZV3tQ29Jsm8QDOfHvr0HFPbgU8uhSeb_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":8013875,\"matchText\":\"CBD  海鲜\",\"memberCardId\":0,\"name\":\"Blue Angel\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"67ffb0827352f227ee8f4346df38cd5b\",\"priceText\":\"￥819/AUD 158\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"CBD\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":469,\"categoryName\":\"日韩料理\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/H4lZiiB6ITP4uNGQYKzRElHHED8VoTOEOwlvBTmQAsRCyxN4xcyDFLCcE13F4Vve_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":2498968,\"matchText\":\"市中心  日韩料理\",\"memberCardId\":0,\"name\":\"Seoul-Ria\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"7c59404b759a3b697642f34327a95d9f\",\"priceText\":\"￥203/AUD 39\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"市中心\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":210,\"categoryName\":\"快餐\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/hsUkdevcNvkiwmPDaryp50b_-ysZ0fel2iX-g-aG8D3sBtuBJfhzJ8C_Iz-VgaBU_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":8175658,\"matchText\":\"TheRocks  快餐\",\"memberCardId\":0,\"name\":\"Guylian Belgian Chocolate Cafe\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"c8b0aee4039d11a8ef51f45f189ba267\",\"priceText\":\"￥89/AUD 17\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"TheRocks\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":116,\"categoryName\":\"悉尼西餐\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/mmMjykn78bl2D-YVg-1JapI1Q3GdtHbLjxWsFCVk_JT-U8Qa0LzrmFRWfoGU7bVc_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":8400627,\"matchText\":\"唐人街  悉尼西餐\",\"memberCardId\":0,\"name\":\"Macchiato Restaurant\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"fea84ae36a1c650cbf51bbacb43d77cf\",\"priceText\":\"￥82/AUD 16\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"唐人街\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":32737,\"categoryName\":\"更多美食\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/kwVRIX-CdwDqHPXuehy3yG4hOSPSa3Lc-JeuuocYNvtJoo_7dd2d2B-FeUrGKsei_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":8386688,\"matchText\":\"悉尼歌剧院  更多美食\",\"memberCardId\":0,\"name\":\"Sokyo\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"820bb5e0b75edba7c20dab427592a702\",\"priceText\":\"\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"悉尼歌剧院\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"Chilli   Spicy Restaurant\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":24889,\"categoryName\":\"中餐厅\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/Jzyzo7IWJ53B4GStkQp6P4GnTGkaG7jfWPEZjXlTAQ_lMWQKcFZlJoYswg4v_lYj_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":18583560,\"matchText\":\"CBD  中餐厅\",\"memberCardId\":0,\"name\":\"湘聚緣\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"ab4f9893e9d59e7ab3f923eb4a594a3d\",\"priceText\":\"￥64/AUD 12\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"CBD\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":30,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"阿里山\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":469,\"categoryName\":\"日韩料理\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/aTpQVTLzB4uQFPpjJaKsDclstmX8PepOL3FVaAugzt2x-vxa7-jRdMqvX-dxFsWz_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":8402931,\"matchText\":\"唐人街  日韩料理\",\"memberCardId\":0,\"name\":\"Arisun\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"43770abc27165cc6e91c00beba0ee2a8\",\"priceText\":\"￥159/AUD 31\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"唐人街\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":32737,\"categoryName\":\"更多美食\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/2ninmONdzBKkqXehvBhdLfgWei-bfMYN47ePZFJyGG4f-C60XS1ZLhaJmRN2Hng__Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":27114154,\"matchText\":\"CBD  更多美食\",\"memberCardId\":0,\"name\":\"The Meat & Wine Co Circular Quay\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"721d876165232622f2d5ec8a36191eba\",\"priceText\":\"\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"CBD\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":45,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":133,\"categoryName\":\"酒吧\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/dAc-Emj7FHUTsHhX_qWzTe-RhQvGXsPoia2yWejlm9QNdtNylZX1pkGuwDqPCzmh_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":13908419,\"matchText\":\"CBD  酒吧\",\"memberCardId\":0,\"name\":\"Sydney Cove Oyster Bar\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"b1392a1a8fff494b1154705e2cd7ba92\",\"priceText\":\"\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"CBD\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"上海年华 1938\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"chatswood\",\"categoryId\":24889,\"categoryName\":\"中餐厅\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/qgvZKeHVxWJPVbD2s81hT2uDbNH0_1dlB4-hFkdFCQUeXNncvMiXbuED7x1tXqN4_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":18362770,\"matchText\":\"Chatswood  中餐厅\",\"memberCardId\":0,\"name\":\"上海天同 Taste of shanghai\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"2bff1048b3bc1e1a57c301f59d9ccfaa\",\"priceText\":\"\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"Chatswood\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"Sichuan Hot Pot House\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":110,\"categoryName\":\"火锅\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/-gsAaDhEniTRupsGuCnuo8w02ubZfLKxzS7I0Vpu1_4e2PniMAJK4tejDqonl8XN_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":15870826,\"matchText\":\"唐人街  火锅\",\"memberCardId\":0,\"name\":\"蓉城火锅\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"5f5ba0567157639e9ab9494a2500a8f7\",\"priceText\":\"￥71/AUD 14\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"唐人街\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":35,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]},{\"adShop\":false,\"altName\":\"\",\"authorityLabelType\":6,\"bookable\":false,\"branchName\":\"\",\"categoryId\":210,\"categoryName\":\"快餐\",\"cityId\":2379,\"defaultPic\":\"https://qcloud.dpfile.com/pc/sRVxQT4UYntpEVoO-fr1EudIKoIyY3qoP246MLs4veqozkitQKqHlrJgLKwbanFc_Es9AvUr0sesLal2G0zjJA.jpg\",\"extraJson\":\"{}\",\"hasDeals\":false,\"hasMoPay\":false,\"hasPromo\":false,\"hasTakeaway\":false,\"hotelBookable\":false,\"id\":8148326,\"matchText\":\"CBD  快餐\",\"memberCardId\":0,\"name\":\"Cafe Sydney\",\"newShop\":false,\"orderDish\":false,\"originalUrlKey\":\"302904288b433dae4c46d8dcf3d214c0\",\"priceText\":\"\",\"queueable\":false,\"recommendReason\":{\"type\":0},\"recommendReasonData\":{\"iconHeight\":0,\"iconWidth\":0,\"infoPrior\":0},\"regionName\":\"CBD\",\"shopPositionInfo\":{\"icon\":\"\",\"text\":\"\",\"type\":0},\"shopPower\":40,\"shopStateInformation\":[],\"shopType\":10,\"status\":0,\"tagList\":[]}],\"nextStartIndex\":100,\"queryId\":\"f5ed99aa-2bfe-4135-8cc2-3e7023950bf4\",\"recordCount\":9267,\"startIndex\":75}");
	   System.out.println(ret);
	}

}