//package week8;
// Create a class to use to create objects with. use get and set methods and define the toString method.

import java.text.NumberFormat;

public class Product {
	
	
	private String code;
	private String description;
	private double price;
	private static int count = 0;
	
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
		count++;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}
	public String getPriceFormatted() {
	    String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
	    return formattedPrice;
	    }
	
	public String toString() {
		return("code: " + code + " description: " + description + " price: " + price);
		
	}
}
