package LogicalPrograms;

public class palindrome_string {
	public static void main(String[] args) {
		String str = "madam";
		String rev ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println("Original string:" +str);
		System.out.println("reverse string:");
		
		
		if(str.equals(rev)) {
			System.out.println("String is Palindrome");
			
		}else
		{
			System.out.println("String is not palindrome");
		}
	}

}
