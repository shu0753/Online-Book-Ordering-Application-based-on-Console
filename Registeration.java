package Library;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Registeration{
	private String name;
	private long mobileno=9326430335L;
	private String emailid;
	private String password;
	private String address;
	static double TotalAmount;
	static List list=new ArrayList();
	static Set addTocart=new LinkedHashSet();
	public void proceedBill(){
		System.out.println("=========================================");
		System.out.println("<<<<<<<<<<List of Your Books You Taken>>>>>>>>>>");
		System.out.println("=========================================");
	for(Object obj:list) {
		System.out.println(obj);
		System.out.println("-----------------------------------------");
	    }
	if(Registeration.TotalAmount>2000){
		Registeration.TotalAmount=Registeration.TotalAmount-Registeration.TotalAmount*20/100;
		System.out.println("Total Amount You Have to Pay:"+Registeration.TotalAmount +" Rs");
		System.out.println("=========================================");
		System.out.println("Number of Book You Purchase: "+Registeration.list.size()+" Books");
		System.out.println("=========================================");
		System.out.println("~~~~~~~~~~~~~<Thank You For Shoping From Spior Book Shop Visit Again(^.^)>~~~~~~~~~~~~~");
		System.exit(0);
	}else{
		System.out.println("Total Amount You Have to Pay: "+Registeration.TotalAmount +" Rs");
		System.out.println("=========================================");
		System.out.println("Number of Book You Purchase:"+Registeration.list.size()+" Books");
		System.out.println("=========================================");
		System.out.println("~~~~~~~~~~~~~<Thank You For Shoping From Spior Book Shop Visit Again(^.^)>~~~~~~~~~~~~~");
		System.exit(0);
	   }
}
	public void viewCart(){
		if(Registeration.addTocart.size()==0){
			 System.out.println("Your Add To Cart Is Empty");	
		}else{
			System.out.println("<<<<<<<<<<Your Add To Cart>>>>>>>>>>");
			System.out.println("=========================================");
			for(Object obj:Registeration.addTocart){
			System.out.println(obj);
			System.out.println("=========================================");
		  }
	   }
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno() {
	 Scanner s =new Scanner(System.in);
	 System.out.println("Enter your mobile number");
	 long mno=s.nextLong();
	 if(mno>999999999 && mno<10000000000L) {
		this.mobileno=mno;
	 }
	 else {
		 System.out.println("Enter valid mobileno");
		 setMobileno();
	 }
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
}
	public void createAccount() {
		System.out.println("===Enter your Details to Create Account===");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=s.nextLine();
		setName(name);
		System.out.println("Enter your Email Id");
		String emailid=s.nextLine();
		setEmailid(emailid);
		System.out.println("Enter your Password");
		String password=s.next();
		setPassword(password);
		System.out.println("Enter your Address");
		String address=s.nextLine();
		address=s.nextLine();
		setAddress(address);
	try {
		setMobileno();
		System.out.println("====Account Create Successfully====");
	    }
	catch(InputMismatchException a){
		System.out.println("Enter Valid Mobile Number");
	   }
	login();
}
	public void login(){
	
	 if (this.mobileno!=0) {
		Scanner s=new Scanner(System.in);
		System.out.println("Press 1 For Mobile No Login");
		System.out.println("Press 2 For Email ID Login");
		int option=s.nextInt();
		if(option==1) {
			System.out.println("Enter your Mobile No");
			long mno=s.nextLong();
			System.out.println("Enter Password");
			String pwd=s.next();
        if(this.mobileno== mno && this.password.equals(pwd)) {
        	System.out.println("Logging Successfully");
        	System.out.println("=====================");
        }else {
        	System.out.println("Invaild Mno And Pwd");
        	login();
        }
	   }
		else if(option==2) {
			System.out.println("Enter your Email ID");
			String email=s.next();
			System.out.println("Enter Password");
			String pwd=s.next();
        if(this.emailid.equals(email)&& this.password.equals(pwd)) {
        	System.out.println("Logging Successfully");
        	System.out.println("=====================");
        }else {
        	System.out.println("Invaild Email And Pwd");
        	login();
        }
	   }else{
         System.out.println("Invalid Option");	
         login();
	  }
	 }else{
		 createAccount();
	 }
   }
}

