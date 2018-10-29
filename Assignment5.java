//Assignment5.java
//This program will guess a number between 1 and 50 until a number higher than
//48 is guessed

//import the Random class to randomly generate numbers
import java.util.Random;
public class Assignment5 {

	public static void main(String[] args) {
		makeGuesses();

	}

	public static void makeGuesses() {
		//declare variables
	    int count = 0;
	    //use imported Random class
	    Random num = new Random();
	    int guess;
	    
	    //keep generating and printing numbers until larger than 48 is guessed.
	    //start guess range at 1 not 0!
	    do {
	        guess = 1 + num.nextInt(50);
	        count++;
	        System.out.println("guess = " + guess);
	    } while(guess < 48);
	    
	    //print the amount of guesses using the count variable.
	    System.out.println("total guesses = " + count);
	}
}
