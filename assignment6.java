package ch7;

public class assignment6 {

	public static void main(String[] args) {
		double [] list1 = {16.1, 12.3, 22.2, 14.4};
		double [] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
		isSorted(list1);
		isSorted(list2);
		
		public boolean isSorted(double[] arr) {
		    for(int i = 0; i <= arr.length - 2; i++) {
		        if(arr[i + 1] < arr[i])
		            return false;
		    }
		    return true;
		}

	}

	
}