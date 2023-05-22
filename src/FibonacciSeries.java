import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//Fibonacci series is a series of numbers in which each number is the sum of the two preceding numbers.
		Scanner sc =new Scanner(System.in);
		System.out.println("print the array no");
		int fiblength=sc.nextInt();
				
		int[]arr=new int[fiblength];
		arr[0]=0;
		arr[1]=1;
		//{0,1,}
		
		for(int i=2;i<fiblength;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
       
		System.out.println("print the fibonacci series");
		
		for(int i=0;i<fiblength;i++) {
			System.out.println(arr[i]);
		}
	}

}
