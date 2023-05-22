import java.util.Scanner;

public class SumOfDigitsInInteger {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the no");
		
		int num=sc1.nextInt();
		int result=0;
		while(num!=0) {
			int n=num%10;
			result+=n;
			num=num/10;
		}
		System.out.println(result);

	}

}
