//assignment4.java
//this program will get a month and day as int(s) from user and then output the appropriate season

//import Scanner
import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the month(#): ");
        int month = input.nextInt();
        System.out.print("Enter the day(#): ");
        int day = input.nextInt();
        System.out.println(season(month,day));
		
	}
	public static String season(int month, int day) {
		if((month < 3) || (month == 3 && day <= 15) || (month == 12 && day >= 16)) {
	        return "Winter";
	    } else if((3 < month && month < 6) || (month == 3 && day >= 16) || (month == 6 && day <= 15)) {
	        return "Spring";
	    } else if((6 < month && month < 9) || (month == 6 && day >= 16) || (month == 9 && day <= 15)) {
	        return "Summer";
	    } else {
	        return "Fall";
	    }
	}
		
}

