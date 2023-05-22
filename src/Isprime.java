
public class Isprime {

	public static void main(String[] args) {
		//A prime number is a number which is divisible by 1 and itself. 
		System.out.println(isPrime(4));//2, 3, 5, 7, 11, 13, 17
	}

	public static boolean isPrime(int num) {
		boolean value=true;
		if(num<1||num==1) {
			value=false;
			return value;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				value=false;
				break;
			}
			
		}
		return value;
		
		
	}
}
