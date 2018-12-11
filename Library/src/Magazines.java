
public class Magazines extends LibraryItems {

	public Magazines(int ItemNumber, String Title) {
		super(ItemNumber, Title);
	}

	
	public void request() {
		System.out.println("Patron requests " + getTitle());
		System.out.println("");
	}
	
	public void currentMagazine() {
		System.out.println("Place current" + " (" + getItemNumber() + ") " + getTitle() + " on the magazine racks.");
		System.out.println("");
	}
}
