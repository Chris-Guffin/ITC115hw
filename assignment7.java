package week7;

import java.util.Arrays;

public class assignment7 {

	public static boolean main(String[] args) {
		
		double [] list1 = {16.1, 12.3, 22.2, 14.4};
		
		
		  boolean isSorted(double[] list1) {
		    for(int i = 0; i <= list1.length - 2; i++) {
		        if(list1[i + 1] < list1[i])
		            return false;
		    }
		    return true;
		}
	}

}
