package ch01.verify;

public class GoodsInfo {
	int code;
	String name;
	String maker;
	int price;
	double discountRate;
	
	public GoodsInfo(int code, String name, String maker, int price, double discountRate) {
		this.code=code;
		this.name=name;
		this.maker=maker;
		this.price=price;
		this.discountRate=discountRate;
	}
	
	public GoodsInfo(int code, String name, String maker, int price) {
		this.code=code;
		this.name=name;
		this.maker=maker;
		this.price=price;
	}
	
	void updateDiscountRate(int discountRate) {
		this.discountRate=discountRate;
	}
	
	int getSelingPrice() {
		int sellPrice=(int)(this.price*(1-this.discountRate));
		return sellPrice;
	}

}
