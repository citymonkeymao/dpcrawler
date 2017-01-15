package bean;

public class Shop {
	private String name;
	private String category;
	private String price;
	private String photo;
	private String shopId;
	private String address;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String toString()
	{
		return "\nshop name: " + name + "\ncategory: " + category + "\nprice: " + price + "\nphoto: " + photo + "\nshop id:" + this.shopId + "\naddress: " + this.address + "\nphone: " + this.phone;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String queryId) {
		this.shopId = queryId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
