
public class CountCapitalizedWordsInString {

	public static void main(String[] args) {
		countCapitalChars("NeenaAugustinE");
		}
	public static void countCapitalChars(String value) {
		int counter=0;
		for(int i=0;i<value.length();i++) {
			if(value.charAt(i)>='A'&&value.charAt(i)<='Z'){
				counter++;
			}
		}
		System.out.println(counter);
	}

}
