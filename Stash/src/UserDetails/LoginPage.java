package UserDetails;

import java.util.Scanner;

public class LoginPage{

	public static void main(String[] args) {
         
		ResgistrationForm res = new ResgistrationForm();
		System.out.println("----Login Page----");
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your Personal id ");
		String id = s.nextLine();
		
		
		System.out.println("Pls enetr your passWord");
		String pass = s.nextLine();
		
	}

}
