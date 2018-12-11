
public abstract class LibraryItems {
	//fields
	private int ItemNumber;
	private String Title;

	//constructor
	public LibraryItems(int ItemNumber, String Title) {
		this.ItemNumber = ItemNumber;
		this.Title = Title;
	}
	
	public void reserve() {
		System.out.println("Put on reserve " + "(" + ItemNumber + ") "  + Title);
		System.out.println("");
	}

	public void checkIn() {
		System.out.println("Remove " + "(" + ItemNumber + ") "  + Title + " from library account.");
		System.out.println("Add " + "(" + ItemNumber + ") "  + Title + " back into inventory.");
		System.out.println("");
	}
	
	public void checkOut() {
		System.out.println("Add " + "(" + ItemNumber + ") "  + Title + " to library account.");
		System.out.println("Put due date on library item.");
		System.out.println("");
	}
	
	public void payFines() {
		System.out.println("Check the due date of" + " (" + ItemNumber + ") " + Title + ".");
		System.out.println("Multiply .25 * amount of days overdue.");
		System.out.println("Add fines to library account.");
		System.out.println("");
	}
	
	public String getTitle() {
		return Title;
	}
	
	public int getItemNumber() {
		return ItemNumber;
	}
	
	public void printSummary() {
		System.out.println("Item number: " + ItemNumber);
		System.out.println("Title: " + Title);
		System.out.println("");
	}
}
