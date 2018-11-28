//package week8;

//client program 
//use the Product class to create 3 new products, then use the toString method to print out the info of each object
public class useProduct {

	public static void main(String[] args) {
		Product p1 = new Product("YYY", "Book", 14.99);
		Product p2 = new Product("ZZZ", "Milk", 3.99);
		Product p3 = new Product("WWW", "Wine", 9.99);

		//print Product info
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
