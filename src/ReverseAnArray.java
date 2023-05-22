
public class ReverseAnArray {

	public static void main(String[] args) {
		char[]arr= {'a','u','g','u'};
		
		int right=arr.length-1;
		int left=0;
		
		while(left<right){
			char c=arr[left];
			arr[left]=arr[right];
			arr[right]=c;
			
			left+=1;
			right-=1;
		}
     for(char c:arr) {
    	 System.out.print(c);
     }
	}



}
