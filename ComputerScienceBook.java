package Library;
import java.util.Scanner;
public class ComputerScienceBook extends Interest implements Books3{
	public void type(){
		   System.out.println("======================================");
		   System.out.println("<<<<<<<<Choose Your BookType>>>>>>>>");
		   System.out.println("======================================");
		   System.out.println("Type 1 for Core Java Book");
		   System.out.println("Type 2 for Advanced Java Book");
		   System.out.println("Type 3 for Python  Book");
		   System.out.println("Type 4 for MySql Book");
		   System.out.println("Type 5 for Web Technologies Book");
		   System.out.println("Type 6 for Go Back");
		   System.out.println("======================================");
		   Scanner s= new Scanner(System.in);
		   int Story=s.nextInt();
		   switch (Story){
		   case 1:{
			   coreJava();
			   break;   
		   }
		   case 2:{
			   advancedJava();
			  break;   
		   }
		   case 3:{
			   python();
			  break;   
		   }
		   case 4:{
			   mySql();
			  break;   
		   }
		   case 5:{
			   webTechnologies();
			  break;   
		   }
		   case 6:{
			   interest();
		   }
     }
 }
	public void coreJava(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Java: The Complete Reference | 12th Edition Book Price 300Rs");
		  System.out.println("Type 2 for Core Java Vol 1 Fundamental Book Price 240Rs");
		  System.out.println("Type 3 for Let Us Java Book Price 150Rs");
		  System.out.println("Type 4 for Complete Java HandBook In 100 Pages : A Small Book, that Help A Lot Book Price 700Rs");
		  System.out.println("Type 5 for First Step Towards Core Java Book Price 340Rs");
		  System.out.println("Type 6 for Go Back");
		  System.out.println("=================================================");
		  Scanner s= new Scanner(System.in);
		  int Option=s.nextInt();
			if(Option==1){
				System.out.println("Type 1 To Add Book In Your Add To Cart");
				System.out.println("Type 2 If You Want To Purchase Book");
				System.out.println("Type 3 To Remove Book From Your Add To Cart");
				System.out.println("Type 4 To View Your Add To Cart");
				System.out.println("Type 5 To GO Back");
				System.out.println("============================================");
				int addTocart=s.nextInt();
				switch(addTocart) {
				case 1:{
					Registeration.addTocart.add("Java: The Complete Reference | 12th Edition Book:Price 300Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Java: The Complete Reference | 12th Edition Book is 300Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+300;
					Registeration.list.add("Java: The Complete Reference | 12th Edition Book:Price 300Rs");
					System.out.println("===============================");
					System.out.println("Do You Want More Book?");
					System.out.println("===============================");
					System.out.println("Type 1 for Order from Same Type");
					System.out.println("Type 2 for Change Type");
					System.out.println("Type 3 for Change Interest");
					System.out.println("Type 4 for Proceed Bill");
					System.out.println("===============================");
				int t=s.nextInt();
				switch(t){
				case 1:{
					coreJava();
					break;	
				}
				case 2:{
					type();
					break;
				}
				case 3:{
					interest();
					break;	
				}
				case 4:{
					Registeration r=new Registeration();
					r.proceedBill();
					break;	
			}
				default:
					System.out.println("Invalid Input");
					coreJava();			
				}
			}else if(c =='n'|| c =='N'){
				coreJava();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Java: The Complete Reference | 12th Edition Book:Price 300Rs");
					System.out.println("Your Book Remove from Cart successfully");
					System.out.println("=======================================");
				}
				case 4:{
					Registeration r=new Registeration();
					r.viewCart();
			}
				case 5:{
					type();
					break;
				}
				default:
					System.out.println("Invalid Input");
					coreJava();
			}
	}else if(Option==2){
		System.out.println("Type 1 To Add Book In Your Add To Cart");
		System.out.println("Type 2 If You Want To Purchase Book");
		System.out.println("Type 3 To Remove Book From Your Add To Cart");
		System.out.println("Type 4 To View Your Add To Cart");
		System.out.println("Type 5 To GO Back");
		System.out.println("============================================");
		int addTocart=s.nextInt();
		switch(addTocart) {
		case 1:{
			Registeration.addTocart.add("Core Java Vol 1 Fundamental Book:Price 240Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Core Java Vol 1 Fundamental Book is 240Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+240;
			Registeration.list.add("Core Java Vol 1 Fundamental Book:Price 240Rs");
			System.out.println("===============================");
			System.out.println("Do You Want More Book?");
			System.out.println("===============================");
			System.out.println("Type 1 for Order from Same Type");
			System.out.println("Type 2 for Change Type");
			System.out.println("Type 3 for Change Interest");
			System.out.println("Type 4 for Proceed Bill");
			System.out.println("===============================");
		int t=s.nextInt();
		switch(t){
		case 1:{
			coreJava();
			break;	
		}
		case 2:{
			type();	
			break;
		}
		case 3:{
			interest();
			break;	
		}
		case 4:{
			Registeration r=new Registeration();
			r.proceedBill();
			break;	
	}
		default:
			System.out.println("Invalid Input");
			coreJava();			
		}
	}else if(c =='n'|| c =='N'){
		coreJava();
	}
}
		case 3:{
			Registeration.addTocart.remove("Core Java Vol 1 Fundamental Book:Price 240Rs");
			System.out.println("Your Book Remove from Cart successfully");
			System.out.println("=======================================");
		}
		case 4:{
			Registeration r=new Registeration();
			r.viewCart();
	}
		case 5:{
			type();
			break;
		}
		default:
			System.out.println("Invalid Input");
			coreJava();
	}
}else if(Option==3){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Let Us Java Book:Price 150Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Let Us Java Book is 150Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+150;
		Registeration.list.add("Let Us Java Book:Price 150Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		coreJava();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		coreJava();			
	}
}else if(c =='n'|| c =='N'){
	coreJava();
}
}
	case 3:{
		Registeration.addTocart.remove("Let Us Java Book:Price 150Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		coreJava();
}
}else if(Option==4){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Complete Java HandBook In 100 Pages : A Small Book, that Help A Lot Book:Price 700Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Complete Java HandBook In 100 Pages : A Small Book, that Help A Lot Book is 700Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+700;
		Registeration.list.add("Complete Java HandBook In 100 Pages : A Small Book, that Help A Lot Book:Price 700Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		coreJava();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		coreJava();			
	}
}else if(c =='n'|| c =='N'){
	coreJava();
}
}
	case 3:{
		Registeration.addTocart.remove("Complete Java HandBook In 100 Pages : A Small Book, that Help A Lot Book:Price 700Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		coreJava();
}
}else if(Option==5){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("First Step Towards Core Java Book:Price 340Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of First Step Towards Core Java Book is 340Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+340;
		Registeration.list.add("First Step Towards Core Java Book:Price 340Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		coreJava();
		break;	
	}
	case 2:{
		type();
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		coreJava();			
	}
}else if(c =='n'|| c =='N'){
	coreJava();
}
}
	case 3:{
		Registeration.addTocart.remove("First Step Towards Core Java Book:Price 340Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		coreJava();
}
}
}
	public void advancedJava(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Self Learn Advanced Java Book Price 450Rs");
		  System.out.println("Type 2 for Advanced Java & Spring Framework Book Price 140Rs");
		  System.out.println("Type 3 for Exploring Advanced Java Book Price 300Rs");
		  System.out.println("Type 4 for A textbook on advanced Java Book Price 250Rs");
		  System.out.println("Type 5 for Secrets Of Java Book Price 500Rs");
		  System.out.println("Type 6 for Go Back");
		  System.out.println("=================================================");
		  Scanner s= new Scanner(System.in);
		  int Option=s.nextInt();
			if(Option==1){
				System.out.println("Type 1 To Add Book In Your Add To Cart");
				System.out.println("Type 2 If You Want To Purchase Book");
				System.out.println("Type 3 To Remove Book From Your Add To Cart");
				System.out.println("Type 4 To View Your Add To Cart");
				System.out.println("Type 5 To GO Back");
				System.out.println("============================================");
				int addTocart=s.nextInt();
				switch(addTocart) {
				case 1:{
					Registeration.addTocart.add("Self Learn Advanced Java Book:Price 450Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Self Learn Advanced Java Book is 450Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+450;
					Registeration.list.add("Self Learn Advanced Java Book:Price 450Rs");
					System.out.println("===============================");
					System.out.println("Do You Want More Book?");
					System.out.println("===============================");
					System.out.println("Type 1 for Order from Same Type");
					System.out.println("Type 2 for Change Type");
					System.out.println("Type 3 for Change Interest");
					System.out.println("Type 4 for Proceed Bill");
					System.out.println("===============================");
				int t=s.nextInt();
				switch(t){
				case 1:{
					advancedJava();
					break;	
				}
				case 2:{
					type();
					break;
				}
				case 3:{
					interest();
					break;	
				}
				case 4:{
					Registeration r=new Registeration();
					r.proceedBill();
					break;	
			}
				default:
					System.out.println("Invalid Input");
					advancedJava();			
				}
			}else if(c =='n'|| c =='N'){
				advancedJava();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Self Learn Advanced Java Book:Price 450Rs");
					System.out.println("Your Book Remove from Cart successfully");
					System.out.println("=======================================");
				}
				case 4:{
					Registeration r=new Registeration();
					r.viewCart();
			}
				case 5:{
					type();
					break;
				}
				default:
					System.out.println("Invalid Input");
					advancedJava();
			}
	}else if(Option==2){
		System.out.println("Type 1 To Add Book In Your Add To Cart");
		System.out.println("Type 2 If You Want To Purchase Book");
		System.out.println("Type 3 To Remove Book From Your Add To Cart");
		System.out.println("Type 4 To View Your Add To Cart");
		System.out.println("Type 5 To GO Back");
		System.out.println("============================================");
		int addTocart=s.nextInt();
		switch(addTocart) {
		case 1:{
			Registeration.addTocart.add("Self Learn Advanced Java Book:Price 450Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Self Learn Advanced Java Book is 450Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+450;
			Registeration.list.add("Self Learn Advanced Java Book:Price 450Rs");
			System.out.println("===============================");
			System.out.println("Do You Want More Book?");
			System.out.println("===============================");
			System.out.println("Type 1 for Order from Same Type");
			System.out.println("Type 2 for Change Type");
			System.out.println("Type 3 for Change Interest");
			System.out.println("Type 4 for Proceed Bill");
			System.out.println("===============================");
		int t=s.nextInt();
		switch(t){
		case 1:{
			advancedJava();
			break;	
		}
		case 2:{
			type();	
			break;
		}
		case 3:{
			interest();
			break;	
		}
		case 4:{
			Registeration r=new Registeration();
			r.proceedBill();
			break;	
	}
		default:
			System.out.println("Invalid Input");
			advancedJava();			
		}
	}else if(c =='n'|| c =='N'){
		advancedJava();
	}
}
		case 3:{
			Registeration.addTocart.remove("Self Learn Advanced Java Book:Price 450Rs");
			System.out.println("Your Book Remove from Cart successfully");
			System.out.println("=======================================");
		}
		case 4:{
			Registeration r=new Registeration();
			r.viewCart();
	}
		case 5:{
			type();
			break;
		}
		default:
			System.out.println("Invalid Input");
			advancedJava();
	}
}else if(Option==3){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Self Learn Advanced Java Book is 450Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+450;
		Registeration.list.add("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		advancedJava();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		advancedJava();			
	}
}else if(c =='n'|| c =='N'){
	advancedJava();
}
}
	case 3:{
		Registeration.addTocart.remove("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		advancedJava();
}
}else if(Option==4){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Self Learn Advanced Java Book is 450Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+450;
		Registeration.list.add("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		advancedJava();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		advancedJava();			
	}
}else if(c =='n'|| c =='N'){
	advancedJava();
}
}
	case 3:{
		Registeration.addTocart.remove("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		advancedJava();
}
}else if(Option==5){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Self Learn Advanced Java Book is 450Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+450;
		Registeration.list.add("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		advancedJava();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		advancedJava();			
	}
}else if(c =='n'|| c =='N'){
	advancedJava();
}
}
	case 3:{
		Registeration.addTocart.remove("Self Learn Advanced Java Book:Price 450Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		advancedJava();
}
}
}
	public void python(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Think Python: How to Think Like a Computer Scientist Book Price 350Rs");
		  System.out.println("Type 2 for The StatQuest Illustrated Guide to Machine Learning Book Price 280Rs");
		  System.out.println("Type 3 for Python Cookbook: Recipes for Mastering Python 3, Third Edition Book Price 330Rs");
		  System.out.println("Type 4 for Data Structures and Algorithms in Python, An Indian Adaptation Book Price 250Rs");
		  System.out.println("Type 5 for Data Science using Python: A Step-by-Step Practical Approach for Beginners Book Price 400Rs");
		  System.out.println("Type 6 for Go Back");
		  System.out.println("=================================================");
		  Scanner s= new Scanner(System.in);
		  int Option=s.nextInt();
			if(Option==1){
				System.out.println("Type 1 To Add Book In Your Add To Cart");
				System.out.println("Type 2 If You Want To Purchase Book");
				System.out.println("Type 3 To Remove Book From Your Add To Cart");
				System.out.println("Type 4 To View Your Add To Cart");
				System.out.println("Type 5 To GO Back");
				System.out.println("============================================");
				int addTocart=s.nextInt();
				switch(addTocart) {
				case 1:{
					Registeration.addTocart.add("Think Python: How to Think Like a Computer Scientist Book:Price 350Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Think Python: How to Think Like a Computer Scientist Book is 350Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+350;
					Registeration.list.add("Think Python: How to Think Like a Computer Scientist Book:Price 350Rs");
					System.out.println("===============================");
					System.out.println("Do You Want More Book?");
					System.out.println("===============================");
					System.out.println("Type 1 for Order from Same Type");
					System.out.println("Type 2 for Change Type");
					System.out.println("Type 3 for Change Interest");
					System.out.println("Type 4 for Proceed Bill");
					System.out.println("===============================");
				int t=s.nextInt();
				switch(t){
				case 1:{
					python();
					break;	
				}
				case 2:{
					type();	
				}
				case 3:{
					interest();
					break;	
				}
				case 4:{
					Registeration r=new Registeration();
					r.proceedBill();
					break;	
			}
				default:
					System.out.println("Invalid Input");
					python();			
				}
			}else if(c =='n'|| c =='N'){
				python();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Think Python: How to Think Like a Computer Scientist Book:Price 350Rs");
					System.out.println("Your Book Remove from Cart successfully");
					System.out.println("=======================================");
				}
				case 4:{
					Registeration r=new Registeration();
					r.viewCart();
			}
				case 5:{
					type();
					break;
				}
				default:
					System.out.println("Invalid Input");
					python();
			}
	}else if(Option==2){
		System.out.println("Type 1 To Add Book In Your Add To Cart");
		System.out.println("Type 2 If You Want To Purchase Book");
		System.out.println("Type 3 To Remove Book From Your Add To Cart");
		System.out.println("Type 4 To View Your Add To Cart");
		System.out.println("Type 5 To GO Back");
		System.out.println("============================================");
		int addTocart=s.nextInt();
		switch(addTocart) {
		case 1:{
			Registeration.addTocart.add("The StatQuest Illustrated Guide to Machine Learning Book:Price 280Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The StatQuest Illustrated Guide to Machine Learning Book is 280Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+280;
			Registeration.list.add("The StatQuest Illustrated Guide to Machine Learning Book:Price 280Rs");
			System.out.println("===============================");
			System.out.println("Do You Want More Book?");
			System.out.println("===============================");
			System.out.println("Type 1 for Order from Same Type");
			System.out.println("Type 2 for Change Type");
			System.out.println("Type 3 for Change Interest");
			System.out.println("Type 4 for Proceed Bill");
			System.out.println("===============================");
		int t=s.nextInt();
		switch(t){
		case 1:{
			python();
			break;	
		}
		case 2:{
			type();
			break;
		}
		case 3:{
			interest();
			break;	
		}
		case 4:{
			Registeration r=new Registeration();
			r.proceedBill();
			break;	
	}
		default:
			System.out.println("Invalid Input");
			python();			
		}
	}else if(c =='n'|| c =='N'){
		python();
	}
}
		case 3:{
			Registeration.addTocart.remove("The StatQuest Illustrated Guide to Machine Learning Book:Price 280Rs");
			System.out.println("Your Book Remove from Cart successfully");
			System.out.println("=======================================");
		}
		case 4:{
			Registeration r=new Registeration();
			r.viewCart();
	}
		case 5:{
			type();
			break;
		}
		default:
			System.out.println("Invalid Input");
			python();
	}
}else if(Option==3){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Python Cookbook: Recipes for Mastering Python 3, Third Edition Book:Price 330Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Python Cookbook: Recipes for Mastering Python 3, Third Edition Book is 330Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+330;
		Registeration.list.add("Python Cookbook: Recipes for Mastering Python 3, Third Edition Book:Price 330Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		python();
		break;	
	}
	case 2:{
		type();
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		python();			
	}
}else if(c =='n'|| c =='N'){
	python();
}
}
	case 3:{
		Registeration.addTocart.remove("Python Cookbook: Recipes for Mastering Python 3, Third Edition Book:Price 330Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		python();
}
}else if(Option==4){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Data Structures and Algorithms in Python, An Indian Adaptation Book:Price 250Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Data Structures and Algorithms in Python, An Indian Adaptation Book is 250Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+250;
		Registeration.list.add("Data Structures and Algorithms in Python, An Indian Adaptation Book:Price 250Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		python();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		python();			
	}
}else if(c =='n'|| c =='N'){
	python();
}
}
	case 3:{
		Registeration.addTocart.remove("Data Structures and Algorithms in Python, An Indian Adaptation Book:Price 250Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		python();
}
}else if(Option==5){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Data Science using Python: A Step-by-Step Practical Approach for Beginners Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Data Science using Python: A Step-by-Step Practical Approach for Beginners Book is 350Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("Data Science using Python: A Step-by-Step Practical Approach for Beginners Book:Price 400Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		python();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		python();			
	}
}else if(c =='n'|| c =='N'){
	python();
}
}
	case 3:{
		Registeration.addTocart.remove("Data Science using Python: A Step-by-Step Practical Approach for Beginners Book:Price 400Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		python();
}
}
	}
	public void mySql(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Querying MySQL Book Price 100Rs");
		  System.out.println("Type 2 for MySQL TroubleShooting Book Price Rs 300");
		  System.out.println("Type 3 for Efficient MySQL Performance Book Price 200Rs");
		  System.out.println("Type 4 for Sql in MySQL Book Price 500Rs");
		  System.out.println("Type 5 for Understanding MySQL Internals Book Price 400Rs");
		  System.out.println("Type 6 for Go Back");
		  System.out.println("=================================================");
		  Scanner s= new Scanner(System.in);
		  int Option=s.nextInt();
			if(Option==1){
				System.out.println("Type 1 To Add Book In Your Add To Cart");
				System.out.println("Type 2 If You Want To Purchase Book");
				System.out.println("Type 3 To Remove Book From Your Add To Cart");
				System.out.println("Type 4 To View Your Add To Cart");
				System.out.println("Type 5 To GO Back");
				System.out.println("============================================");
				int addTocart=s.nextInt();
				switch(addTocart) {
				case 1:{
					Registeration.addTocart.add("Querying MySQL Book:Price 100Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Querying MySQL Book is 100Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+100;
					Registeration.list.add("Querying MySQL Book:Price 100Rs");
					System.out.println("===============================");
					System.out.println("Do You Want More Book?");
					System.out.println("===============================");
					System.out.println("Type 1 for Order from Same Type");
					System.out.println("Type 2 for Change Type");
					System.out.println("Type 3 for Change Interest");
					System.out.println("Type 4 for Proceed Bill");
					System.out.println("===============================");
				int t=s.nextInt();
				switch(t){
				case 1:{
					mySql();
					break;	
				}
				case 2:{
					type();	
					break;
				}
				case 3:{
					interest();
					break;	
				}
				case 4:{
					Registeration r=new Registeration();
					r.proceedBill();
					break;	
			}
				default:
					System.out.println("Invalid Input");
					mySql();			
				}
			}else if(c =='n'|| c =='N'){
				mySql();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Querying MySQL Book:Price 100Rs");
					System.out.println("Your Book Remove from Cart successfully");
					System.out.println("=======================================");
				}
				case 4:{
					Registeration r=new Registeration();
					r.viewCart();
			}
				case 5:{
					type();
					break;
				}
				default:
					System.out.println("Invalid Input");
					mySql();
			}
	}else if(Option==2){
		System.out.println("Type 1 To Add Book In Your Add To Cart");
		System.out.println("Type 2 If You Want To Purchase Book");
		System.out.println("Type 3 To Remove Book From Your Add To Cart");
		System.out.println("Type 4 To View Your Add To Cart");
		System.out.println("Type 5 To GO Back");
		System.out.println("============================================");
		int addTocart=s.nextInt();
		switch(addTocart) {
		case 1:{
			Registeration.addTocart.add("MySQL TroubleShooting Book:Price 300Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of MySQL TroubleShooting Book is 300Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+300;
			Registeration.list.add("MySQL TroubleShooting Book:Price 300Rs");
			System.out.println("===============================");
			System.out.println("Do You Want More Book?");
			System.out.println("===============================");
			System.out.println("Type 1 for Order from Same Type");
			System.out.println("Type 2 for Change Type");
			System.out.println("Type 3 for Change Interest");
			System.out.println("Type 4 for Proceed Bill");
			System.out.println("===============================");
		int t=s.nextInt();
		switch(t){
		case 1:{
			mySql();
			break;	
		}
		case 2:{
			type();	
			break;
		}
		case 3:{
			interest();
			break;	
		}
		case 4:{
			Registeration r=new Registeration();
			r.proceedBill();
			break;	
	}
		default:
			System.out.println("Invalid Input");
			mySql();			
		}
	}else if(c =='n'|| c =='N'){
		mySql();
	}
}
		case 3:{
			Registeration.addTocart.remove("MySQL TroubleShooting Book:Price 300Rs");
			System.out.println("Your Book Remove from Cart successfully");
			System.out.println("=======================================");
		}
		case 4:{
			Registeration r=new Registeration();
			r.viewCart();
	}
		case 5:{
			type();
			break;
		}
		default:
			System.out.println("Invalid Input");
			mySql();
	}
}else if(Option==3){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Efficient MySQL Performance Book:Price 200Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Efficient MySQL Performance Book is 200Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+200;
		Registeration.list.add("Efficient MySQL Performance Book:Price 200Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		mySql();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		mySql();			
	}
}else if(c =='n'|| c =='N'){
	mySql();
}
}
	case 3:{
		Registeration.addTocart.remove("Efficient MySQL Performance Book:Price 200Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		mySql();
}
}else if(Option==4){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Sql in MySQL Book:Price 500Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Sql in MySQL Book is 500Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+500;
		Registeration.list.add("Sql in MySQL Book:Price 500Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		mySql();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		mySql();			
	}
}else if(c =='n'|| c =='N'){
	mySql();
}
}
	case 3:{
		Registeration.addTocart.remove("Sql in MySQL Book:Price 500Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		mySql();
}
}else if(Option==5){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Understanding MySQL Internals Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Understanding MySQL Internals Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("Understanding MySQL Internals Book:Price 400Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		mySql();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		mySql();			
	}
}else if(c =='n'|| c =='N'){
	mySql();
}
}
	case 3:{
		Registeration.addTocart.remove("Understanding MySQL Internals Book:Price 400Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		mySql();
}
}
	}
	public void webTechnologies(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Basic concepts of HTML Book Price 340Rs");
		  System.out.println("Type 2 for Javascript The Definitive Guide 7/ED Book Price 200Rs");
		  System.out.println("Type 3 for Mastering HTML, CSS & Java Script Web Publishing Book Price 700Rs");
		  System.out.println("Type 4 for CSS Pocket Reference Book Price 400Rs");
		  System.out.println("Type 5 for Web Designing Book Price 350Rs");
		  System.out.println("Type 6 for Go Back");
		  System.out.println("=================================================");
		  Scanner s= new Scanner(System.in);
		  int Option=s.nextInt();
			if(Option==1){
				System.out.println("Type 1 To Add Book In Your Add To Cart");
				System.out.println("Type 2 If You Want To Purchase Book");
				System.out.println("Type 3 To Remove Book From Your Add To Cart");
				System.out.println("Type 4 To View Your Add To Cart");
				System.out.println("Type 5 To GO Back");
				System.out.println("============================================");
				int addTocart=s.nextInt();
				switch(addTocart) {
				case 1:{
					Registeration.addTocart.add("Basic concepts of HTML Book:Price 340Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Basic concepts of HTML Book is 340Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+340;
					Registeration.list.add("Basic concepts of HTML Book:Price 340Rs");
					System.out.println("===============================");
					System.out.println("Do You Want More Book?");
					System.out.println("===============================");
					System.out.println("Type 1 for Order from Same Type");
					System.out.println("Type 2 for Change Type");
					System.out.println("Type 3 for Change Interest");
					System.out.println("Type 4 for Proceed Bill");
					System.out.println("===============================");
				int t=s.nextInt();
				switch(t){
				case 1:{
					webTechnologies();
					break;	
				}
				case 2:{
					type();	
					break;
				}
				case 3:{
					interest();
					break;	
				}
				case 4:{
					Registeration r=new Registeration();
					r.proceedBill();
					break;	
			}
				default:
					System.out.println("Invalid Input");
					webTechnologies();			
				}
			}else if(c =='n'|| c =='N'){
				webTechnologies();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Basic concepts of HTML Book:Price 340Rs");
					System.out.println("Your Book Remove from Cart successfully");
					System.out.println("=======================================");
				}
				case 4:{
					Registeration r=new Registeration();
					r.viewCart();
			}
				case 5:{
					type();
					break;
				}
				default:
					System.out.println("Invalid Input");
					webTechnologies();
			}
	}else if(Option==2){
		System.out.println("Type 1 To Add Book In Your Add To Cart");
		System.out.println("Type 2 If You Want To Purchase Book");
		System.out.println("Type 3 To Remove Book From Your Add To Cart");
		System.out.println("Type 4 To View Your Add To Cart");
		System.out.println("Type 5 To GO Back");
		System.out.println("============================================");
		int addTocart=s.nextInt();
		switch(addTocart) {
		case 1:{
			Registeration.addTocart.add("Javascript The Definitive Guide 7/ED Book:Price 200Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Javascript The Definitive Guide 7/ED Book is 200Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+200;
			Registeration.list.add("Javascript The Definitive Guide 7/ED Book:Price 200Rs");
			System.out.println("===============================");
			System.out.println("Do You Want More Book?");
			System.out.println("===============================");
			System.out.println("Type 1 for Order from Same Type");
			System.out.println("Type 2 for Change Type");
			System.out.println("Type 3 for Change Interest");
			System.out.println("Type 4 for Proceed Bill");
			System.out.println("===============================");
		int t=s.nextInt();
		switch(t){
		case 1:{
			webTechnologies();
			break;	
		}
		case 2:{
			type();	
			break;
		}
		case 3:{
			interest();
			break;	
		}
		case 4:{
			Registeration r=new Registeration();
			r.proceedBill();
			break;	
	}
		default:
			System.out.println("Invalid Input");
			webTechnologies();			
		}
	}else if(c =='n'|| c =='N'){
		webTechnologies();
	}
}
		case 3:{
			Registeration.addTocart.remove("Javascript The Definitive Guide 7/ED Book:Price 200Rs");
			System.out.println("Your Book Remove from Cart successfully");
			System.out.println("=======================================");
		}
		case 4:{
			Registeration r=new Registeration();
			r.viewCart();
	}
		case 5:{
			type();
			break;
		}
		default:
			System.out.println("Invalid Input");
			webTechnologies();
	}
}else if(Option==3){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Mastering HTML, CSS & Java Script Web Publishing Book:Price 700Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Mastering HTML, CSS & Java Script Web Publishing Book is 700Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+700;
		Registeration.list.add("Mastering HTML, CSS & Java Script Web Publishing Book:Price 700Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		webTechnologies();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		webTechnologies();			
	}
}else if(c =='n'|| c =='N'){
	webTechnologies();
}
}
	case 3:{
		Registeration.addTocart.remove("Mastering HTML, CSS & Java Script Web Publishing Book:Price 700Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		webTechnologies();
}
}else if(Option==4){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("CSS Pocket Reference:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of CSS Pocket Reference Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("CSS Pocket Reference:Price 400Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		webTechnologies();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		webTechnologies();			
	}
}else if(c =='n'|| c =='N'){
	webTechnologies();
}
}
	case 3:{
		Registeration.addTocart.remove("CSS Pocket Reference:Price 400Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		webTechnologies();
}
}else if(Option==5){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Web Designing Book:Price 350Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Web Designing Book is 350Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+350;
		Registeration.list.add("Web Designing Book:Price 350Rs");
		System.out.println("===============================");
		System.out.println("Do You Want More Book?");
		System.out.println("===============================");
		System.out.println("Type 1 for Order from Same Type");
		System.out.println("Type 2 for Change Type");
		System.out.println("Type 3 for Change Interest");
		System.out.println("Type 4 for Proceed Bill");
		System.out.println("===============================");
	int t=s.nextInt();
	switch(t){
	case 1:{
		webTechnologies();
		break;	
	}
	case 2:{
		type();	
		break;
	}
	case 3:{
		interest();
		break;	
	}
	case 4:{
		Registeration r=new Registeration();
		r.proceedBill();
		break;	
}
	default:
		System.out.println("Invalid Input");
		webTechnologies();			
	}
}else if(c =='n'|| c =='N'){
	webTechnologies();
}
}
	case 3:{
		Registeration.addTocart.remove("Web Designing Book:Price 350Rs");
		System.out.println("Your Book Remove from Cart successfully");
		System.out.println("=======================================");
	}
	case 4:{
		Registeration r=new Registeration();
		r.viewCart();
}
	case 5:{
		type();
		break;
	}
	default:
		System.out.println("Invalid Input");
		webTechnologies();
}
}
	}
}
