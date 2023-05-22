import java.util.HashMap;
import java.util.Map;

public class CountNumOfCharsInStringExample {

	public static void main(String[] args) {
		characterCount("rahulshettyacademy");
		

	}
	static void characterCount(String inputString) {

		// Creating a hashmap object.

		HashMap<Character, Integer> hash_map = new HashMap<>();
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
		
		 if (hash_map.containsKey(c)) {
			 
		hash_map.put(c, hash_map.get(c) + 1);
		
		}

		else {
		hash_map.put(c, 1);
		}
		 // Print the hashmap object which gives the number of each character in String.
//		 System.out.println(hash_map);
		 
		 


		
}
		for(Map.Entry<Character, Integer>e:hash_map.entrySet()) {
			 System.out.print(e.getKey()+""+e.getValue());
		 }
		}}
