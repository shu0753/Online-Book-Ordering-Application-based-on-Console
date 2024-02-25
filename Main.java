package Library;
import java.util.Scanner;
public class Main{
	static {
		 System.out.println("============================================");
		 System.out.println("~~~~~~~~~Welcome To Spior Book Shop~~~~~~~~~");
		 System.out.println("<<<<<<<<<<<<<<<Discount Offer>>>>>>>>>>>>>>>");
		 System.out.println("~If You Purchase Books Above 2000Rs You Will Get 20% Off On Your Total Amount~");
		 System.out.println("-------------------------------------------");
		 System.out.println("Disclaimer:No Return No Refunds");
		 System.out.println("==============================================");
	 }
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Select The Option");
		 System.out.println("Type 1 for Create an Account");
		 System.out.println("Type 2 for Login");
		 System.out.println("Type 3 for Exit");
		 try {
		 int Select =s.nextInt();
		 Registeration r=new Registeration();
		 switch(Select) {
		 case 1:{
			 r.createAccount();
			 break;
		 }
		 
		 case 2:{
		  r.login();
		   break;
		 }
		 case 3:{
			 System.out.println("====(^.^)Visit Again(^.^)====");
			 System.exit(0);
		 }
		 default:{
			System.out.println("Enter Valid Option"); 
			main(null);
		} 
	   }
		 
		Interest i=new Interest();
		 i.interest();
	}catch(Exception e) {
		 System.out.println("Enter Input Only Number");
	 }
		 Registeration r=new Registeration();
		 r.createAccount();
  }
}
