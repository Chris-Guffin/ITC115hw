
public class Books extends LibraryItems {
	private String Author;

	public Books(int ItemNumber, String Title, String Author) {
		super(ItemNumber, Title);
		this.Author = Author;
		// TODO Auto-generated constructor stub
	}
	
	public void whoIsAuthor() {
		System.out.println("The author of " + getTitle() + " is " + Author + ".");
		System.out.println("");
	}
	
	@Override
	public void printSummary() {
		System.out.println("Item number: " + getItemNumber());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + Author);
		System.out.println("");
	}
	

}
