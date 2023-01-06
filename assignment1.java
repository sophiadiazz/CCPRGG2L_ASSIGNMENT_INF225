package Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

	public class match {
	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter student email: ");
	        String studentNum = scan.nextLine();

	        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
	        Matcher matcher = pattern.matcher(studentNum);

	        boolean match = matcher.matches();

	        if (match) {
	            System.out.println("valid student email");
	        } else {
	            System.out.println("invalid student email");
	        }
	        System.out.print("Enter student phone: ");
	        String phone = scan.nextLine();
	        
	        Pattern pattern1 = Pattern.compile("09\\d{9}");
	        Matcher matcher1 = pattern1.matcher(phone);

	        if (match) {
	            System.out.println("valid phone number");
	        } else {
	            System.out.println("invalid phone number");
	        }
	    }
	}
