import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		//number in which the sum of the cubes of each digit is equal to the number itself. 
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter the no to check which is Armstrong no or not");// 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
		int num=sc1.nextInt();
		int actual=num;
		int result=0;
		while(num!=0) {
			int n=num%10;
			result+=Math.pow(n, 3);
			num=num/10;
		}
	System.out.println(result);
		if(actual==result) {
			System.out.println("given no is armstrong");
		}else {
			System.out.println("not an Armstrong");
		}
		
		

	}

}
