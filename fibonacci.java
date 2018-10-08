//fibonacci.java
//this program will print the first 12 fibonacci numbers

public class fibonacci {

	public static void main(String[] args) {
		
		//declare variables. we need 3 for fibonacci formula to work.
		int x1=0, x2=1, x3;
		
		//current formula doesnt work w/ 1st two numbers. 
			System.out.println("0");
			System.out.println("1"); 
		
		//start loop at two, first two numbers are hardcoded.
		for(int i = 2; i <= 11; i++) {
			
		//formula
			x3=x1+x2;
			System.out.println(""+x3);
			x1=x2;
			x2=x3;
		}
	}

}
