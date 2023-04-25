package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class count_repeating_char_in_String_using_HashMap {
	
	public static void main(String[] args) {
		
		String str = "yaabbbcccxxxxby";
		
		//create hashmap
		 HashMap<Character, Integer> map = new HashMap<Character,Integer>();	
     
     //read the character in a string and store it into one variable
     
		for(int i=0; i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) { //true
				map.put(ch, map.get(ch) +1);
				
			}else {
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);//{a=2, b=4, c=3, x=4, y=2}
		Set<Character> keys = map.keySet();
		
			for( Character key:keys) {
				System.out.println(key+":"+map.get(key));//output will be in set
				System.out.println(key);//unique key identify 
				

			}
			
		

     
	}

}
