
public class StringRevrsal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "Neena Augustine";
        String[] nameParts = fullName.split(" ");
        
        // Reverse the order of the name parts
        String reversedName = nameParts[1] + " " + nameParts[0];
        
        System.out.println("Reversed Name: " + reversedName);

	}

}
