package fuckingAround;

import java.text.DecimalFormat;

public class Television {
	static String brand;
	static Double price;
	
	public Television() {
		
		brand = "";
		price = 0.0;
		
	}
	
	public Television(String startBrand, Double startPrice) {
		setBrand ( startBrand );
		setPrice ( startPrice );
	}
	
	private void setBrand(String newBrand) {
		brand = newBrand;
	}
	
	private void setPrice(Double newPrice) {
		price = newPrice;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String toString() {
		DecimalFormat priceFormat = new DecimalFormat ("#0.00");
		return ("Brand: " + brand + ";\nPrice " + priceFormat.format(price));
	}
	
	public boolean equals(Object o) {
		if ( ! ( o instanceof Television )) {
			return false;
		} else {
			Television objTV = (Television) o;
			if (brand == objTV.brand && Math.abs(price - objTV.price) < .001) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public String tvSiteName() {
		return "wwww." + brand.toLowerCase() + ".com";
	}
	
}
