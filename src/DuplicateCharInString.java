import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		findDuplicate("rahulshettyacademy");

	}
  public static void findDuplicate(String value) {
	  HashMap<Character,Integer>hm =new HashMap<>();
	  char[]arr=value.toCharArray();
	  
	  for(char c:arr) {
		  if(hm.containsKey(c)) {
			  int n=hm.get(c);
			  hm.put(c, hm.get(c)+1);
		  }else {
			  hm.put(c, 1);
		  }
	  }
	  
	  Set<Character>set=hm.keySet();
	  
	  for(char c:set) {
		  if(hm.get(c)>1) {
			  System.out.println(c+"-->"+hm.get(c));
		  }
	  }
  }
}
