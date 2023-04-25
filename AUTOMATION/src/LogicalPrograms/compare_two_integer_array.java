package LogicalPrograms;

import java.util.Arrays;

public class compare_two_integer_array {
	
	public static void main(String[] args) {
		
		int ar1[]= {10,20,30};
		int ar2[] = {20,30,40};
		int ar3[] = {10,20,30};
		
		
		System.out.println(Arrays.equals(ar1,ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		
		
		System.out.println(Arrays.deepEquals(args, args));//use to compare two multidimensional array
	}

}
