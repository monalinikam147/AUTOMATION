package LogicalPrograms;

public class swap_two_Numbers_without_using_third_variable {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		a = a+b;//30
		b = a-b;//10
		a = a-b;//20
		
		System.out.println(a);
		System.out.println(b);
	}

}
