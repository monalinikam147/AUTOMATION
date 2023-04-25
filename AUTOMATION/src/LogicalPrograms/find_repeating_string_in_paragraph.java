package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class find_repeating_string_in_paragraph {

	
	public static void main(String[] args) {
		
		String str = "abc pqr abc xyz pqr xyz abc abc xyz pqr";
		
		//convert string paragraph into array
		String ar[] = str.split(" ");
		
		//read array
		for(int i=0; i<=ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		
		//create a hashmap
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		//again read array
		
		for(int i=0; i<= ar.length-1; i++) {
			String s1 = ar[i];
			
			if(map.containsKey(s1)) {
				map.put(s1, map.get(s1)+1);
				
			}else {
				map.put(s1, 1);
			}
			
		}
		System.out.println(map);
		Set<String> keys = map.keySet();
		
		for( String key:keys) {
			System.out.println(key+ ":"+map.get(key));
			
		}
	}
}
