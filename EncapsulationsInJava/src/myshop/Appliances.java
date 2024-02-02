package myshop;

public class Appliances {
	private int Productid;
	private String Productname;
	private double price;
	private double GST;
	private double TotalPrice;
	
	public int getProductid() {
		return Productid;
	}
	public void setProductid(int productid) {
		this.Productid = productid;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		this.Productname = productname;
	}
	
	public double getGST() {
		GST=(price*GST)/100;
		return GST;
	}
	public void setGST(double gST) {
		GST = gST;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
		TotalPrice=price+GST;
		return TotalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.TotalPrice = totalPrice;
	}
	

}
