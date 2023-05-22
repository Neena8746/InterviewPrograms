import java.util.HashMap;

public class str {
	public static void main(String[] args) {
	      String str = "aaabbbbtttqqst";
	      int count = 1;
	      char prevChar = str.charAt(0);
	      
	      for(int i=1; i<str.length(); i++){
	         char currChar = str.charAt(i);
	         if(currChar == prevChar){
	            count++;
	         } else {
	            System.out.print(prevChar+""+count);
	            prevChar = currChar;
	            count = 1;
	         }
	      }
	      
	      System.out.print(prevChar+""+count); // Print last character count
	   }
}