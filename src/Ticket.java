
public abstract class Ticket {
	
	public int number;
	
	public double price; 
	
	public Ticket(int number) {
		this.number = number;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return ("ticket #" + this.number + " Price: " + this.getPrice());
	}
}
