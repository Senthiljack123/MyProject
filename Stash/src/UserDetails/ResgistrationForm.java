package UserDetails;

import java.util.Iterator;
import java.util.Scanner;

public class ResgistrationForm {
	
	public static int len(int num) {
		int rem = 0,res = 0;
		while(num > 0) {
		    rem = num % 10;
		    res++; 
		    num = num / 10;
		}
		return res;
				
	}
	
	public static Boolean checkPassWord(String s) {
		int count = 0;
		 for (int i = 0; i < s.length(); i++) {
			
			 if(s.charAt(i) >= 'a' || s.charAt(i) >= 'A' || s.charAt(i) >= '0') count++;
		}
		 if(count == s.length()) return true;
		 return false;
	}

	public static void main(String[] args) {
 		System.out.println("----------Resgistartion Form----------");
		Scanner s    = new Scanner(System.in);
		
		  System.out.println("Enter Your Name"); 
		  String name = s.nextLine();
		  
		  System.out.println("Enter Your Gender");
		  System.out.println("---Male or Female---"); 
		  String gend = s.nextLine();
		  
		  System.out.println("Enter Your Store Name"); 
		  String sName = s.nextLine();
		 
		  System.out.println("Enter Your Mobile Number");
		  int   num   = s.nextInt();
		  if(len(num) != 10) {
			System.out.println("Pls Enter valid MobileNumber");
		   }
 		
		  System.out.println("Enter your Age");
		  int age = s.nextInt();
		  if(age >= 100) System.out.println("pls Enter Valid Age");
		  
		  
		  System.out.println("Enter Your Store Pincode");
		  int code = s.nextInt();
		  if(len(code) != 6) System.out.println("Pls enter valid pincode");
		  
		 
		  System.out.println("Enter the PassWord");
		  String pass = s.nextLine();
		  if(checkPassWord(pass)) {
			  System.out.println("Conform Password"); 
			  String cPass = s.nextLine();
		  }
		  else System.out.println("pls enter Strong password");
		  
		  
		 
		 
		
		
		
		

	}

}
