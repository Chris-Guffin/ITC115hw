
public class LibraryMain {

	public static void main(String[] args) {
		Books book1 = new Books(1, "Harry Potter", "JK Rowling");
		Books book2 = new Books(2, "Dune", "Frank Herbert");
		Dvds dvd1 = new Dvds(3, "Star Wars");
		Cds cd1 = new Cds(4, "Star Wars Soundtrack", "John Williams");
		Magazines magazine1 = new Magazines(5, "The Economist");
		
		book1.reserve();
		dvd1.reserve();
		cd1.checkOut();
		cd1.checkIn();
		cd1.payFines();
		magazine1.request();
		magazine1.currentMagazine();
		book1.whoIsAuthor();
		cd1.nameMusician();
		cd1.printSummary();
		book1.printSummary();
		magazine1.printSummary();

	}

}
