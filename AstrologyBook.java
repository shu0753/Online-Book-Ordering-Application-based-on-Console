package Library;
import java.util.Scanner;
public class AstrologyBook extends Interest implements Books6{
	public void type(){
		   System.out.println("======================================");
		   System.out.println("<<<<<<<<Choose Your BookType>>>>>>>>");
		   System.out.println("======================================");
		   System.out.println("Type 1 for Vedic Astrology Book");
		   System.out.println("Type 2 for Horary  Astrology Book");
		   System.out.println("Type 3 for Psycological Astrology Book");
		   System.out.println("Type 4 for Relational Astrology Book");
		   System.out.println("Type 5 for Traditional Astrology Book");
		   System.out.println("Type 6 for Go Back");
		   System.out.println("======================================");
		   Scanner s= new Scanner(System.in);
		   int Story=s.nextInt();
		   switch (Story){
		   case 1:{
			   vedicAstrology();
			   break;   
		   }
		   case 2:{
			   horaryAstrology();
			  break;   
		   }
		   case 3:{
			   psycologicalAstrology();
			  break;   
		   }
		   case 4:{
			   relationalAstrology();
			  break;   
		   }
		   case 5:{
			   tradtionalAstrology();
			  break;   
		   }
		   case 6:{
			   interest();
		   }
      }
   }
	public void vedicAstrology(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for ABC Of Vedic Astrology: Baby Steps To Astrology Book Price 350Rs");
		  System.out.println("Type 2 for Vedic Science And Technology Book Price 400Rs");
		  System.out.println("Type 3 for Vedic Mathematics (Indian Classics) Book Price 380Rs");
		  System.out.println("Type 4 for Mysteries Of Vedic Face Reading Book Price 250Rs");
		  System.out.println("Type 5 for Astrology For Beginners: Learn And Transform Your Thoughts About Vedic Astrology Book Price 500Rs");
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
					Registeration.addTocart.add("ABC Of Vedic Astrology: Baby Steps To Astrology Book:Price 350Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of ABC Of Vedic Astrology: Baby Steps To Astrology Book is 350Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+350;
					Registeration.list.add("ABC Of Vedic Astrology: Baby Steps To Astrology Book:Price 350Rs");
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
					vedicAstrology();
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
					vedicAstrology();			
				}
			}else if(c =='n'|| c =='N'){
				vedicAstrology();
			}
		}
				case 3:{
					Registeration.addTocart.remove("ABC Of Vedic Astrology: Baby Steps To Astrology Book:Price 350Rs");
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
					vedicAstrology();
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
			Registeration.addTocart.add("Vedic Science And Technology Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Vedic Science And Technology Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("Vedic Science And Technology Book:Price 400Rs");
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
			vedicAstrology();
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
			vedicAstrology();			
		}
	}else if(c =='n'|| c =='N'){
		vedicAstrology();
	}
}
		case 3:{
			Registeration.addTocart.remove(":Price Rs");
			System.out.println("Vedic Science And Technology Book:Price 400Rs");
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
			vedicAstrology();
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
		Registeration.addTocart.add("Vedic Mathematics (Indian Classics) Book:Price 380Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Vedic Mathematics (Indian Classics) Book is 380Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+380;
		Registeration.list.add("Vedic Mathematics (Indian Classics) Book:Price 380Rs");
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
		vedicAstrology();
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
		vedicAstrology();			
	}
}else if(c =='n'|| c =='N'){
	vedicAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Vedic Mathematics (Indian Classics) Book:Price 380Rs");
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
		vedicAstrology();
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
		Registeration.addTocart.add("Mysteries Of Vedic Face Reading Book:Price 250Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Mysteries Of Vedic Face Reading Book is 250Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+250;
		Registeration.list.add("Price of Mysteries Of Vedic Face Reading Book Price 250Rs");
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
		vedicAstrology();
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
		vedicAstrology();			
	}
}else if(c =='n'|| c =='N'){
	vedicAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Price of Mysteries Of Vedic Face Reading Book Price 250Rs");
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
		vedicAstrology();
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
		Registeration.addTocart.add("Astrology For Beginners: Learn And Transform Your Thoughts About Vedic Astrology Book:Price 500Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Astrology For Beginners: Learn And Transform Your Thoughts About Vedic Astrology Book is 500Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+500;
		Registeration.list.add("Astrology For Beginners: Learn And Transform Your Thoughts About Vedic Astrology Book:Price 500Rs");
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
		vedicAstrology();
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
		vedicAstrology();			
	}
}else if(c =='n'|| c =='N'){
	vedicAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Astrology For Beginners: Learn And Transform Your Thoughts About Vedic Astrology Book:Price 500Rs");
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
		vedicAstrology();
}
}
}
	public void horaryAstrology(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Brihat Parasara Hora Sastra Book Price 200Rs");
		  System.out.println("Type 2 for Horary For Beginners Book Price 400Rs");
		  System.out.println("Type 3 for Horary Astrology (Advance Stellar Astrology) Book Price 350Rs");
		  System.out.println("Type 4 for A Complete Book On Horary Astrology Book Price 500Rs");
		  System.out.println("Type 5 for Principles & Practice Of Horary Astrology Book Price 300Rs");
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
					Registeration.addTocart.add("Brihat Parasara Hora Sastra Book:Price 200Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Brihat Parasara Hora Sastra Book is 200Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+200;
					Registeration.list.add("Price of Brihat Parasara Hora Sastra Book Price 200Rs");
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
					horaryAstrology();
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
					horaryAstrology();			
				}
			}else if(c =='n'|| c =='N'){
				horaryAstrology();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Price of Brihat Parasara Hora Sastra Book Price 200Rs");
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
					horaryAstrology();
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
			Registeration.addTocart.add("Horary For Beginners Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Horary For Beginners Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("Horary For Beginners Book:Price 400Rs");
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
			horaryAstrology();
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
			horaryAstrology();			
		}
	}else if(c =='n'|| c =='N'){
		horaryAstrology();
	}
}
		case 3:{
			Registeration.addTocart.remove("Horary For Beginners Book:Price 400Rs");
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
			horaryAstrology();
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
		Registeration.addTocart.add("Horary Astrology (Advance Stellar Astrology)Book:Price 350Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Horary Astrology (Advance Stellar Astrology) Book is 350Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+300;
		Registeration.list.add("Horary Astrology (Advance Stellar Astrology)Book:Price 350Rs");
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
		horaryAstrology();
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
		horaryAstrology();			
	}
}else if(c =='n'|| c =='N'){
	horaryAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Horary Astrology (Advance Stellar Astrology)Book:Price 350Rs");
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
		horaryAstrology();
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
		Registeration.addTocart.add("A Complete Book On Horary Astrology Book:Price 500Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of A Complete Book On Horary Astrology Book is 500Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+500;
		Registeration.list.add("A Complete Book On Horary Astrology Book:Price 500Rs");
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
		horaryAstrology();
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
		horaryAstrology();			
	}
}else if(c =='n'|| c =='N'){
	horaryAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("A Complete Book On Horary Astrology Book:Price 500Rs");
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
		horaryAstrology();
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
		Registeration.addTocart.add("Principles & Practice Of Horary Astrology Book:Price 300Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Principles & Practice Of Horary Astrology Book is 300Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+300;
		Registeration.list.add("Principles & Practice Of Horary Astrology Book:Price 300Rs");
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
		horaryAstrology();
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
		horaryAstrology();			
	}
}else if(c =='n'|| c =='N'){
	horaryAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Principles & Practice Of Horary Astrology Book:Price 300Rs");
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
		horaryAstrology();
}
}
}
	public void psycologicalAstrology(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Astrology, Psychology and the Four Elements Book Price 300Rs");
		  System.out.println("Type 2 for How To Be A Psychic Book Price 280Rs");
		  System.out.println("Type 3 for You And Your Zodiac Signs:Zodiac Mantras Book Price 450Rs");
		  System.out.println("Type 4 for Encyclopaedia Of Psychological Astrology Book Price 700Rs");
		  System.out.println("Type 5 for Astrology & Diagnosis Book Price 250Rs");
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
					Registeration.addTocart.add("Astrology, Psychology and the Four Elements Book:Price 300Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Astrology, Psychology and the Four Elements Book is 300Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+300;
					Registeration.list.add("Astrology, Psychology and the Four Elements Book:Price 300Rs");
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
					psycologicalAstrology();
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
					psycologicalAstrology();			
				}
			}else if(c =='n'|| c =='N'){
				psycologicalAstrology();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Astrology, Psychology and the Four Elements Book:Price 300Rs");
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
					psycologicalAstrology();
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
			Registeration.addTocart.add("How To Be A Psychic Book:Price 280Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of How To Be A Psychic Book is 280Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+280;
			Registeration.list.add("How To Be A Psychic Book:Price 280Rs");
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
			psycologicalAstrology();
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
			psycologicalAstrology();			
		}
	}else if(c =='n'|| c =='N'){
		psycologicalAstrology();
	}
}
		case 3:{
			Registeration.addTocart.remove("How To Be A Psychic Book:Price 280Rs");
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
			psycologicalAstrology();
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
		Registeration.addTocart.add("You And Your Zodiac Signs:Zodiac Mantras Book:Price 450Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of You And Your Zodiac Signs:Zodiac Mantras Book is 450Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+450;
		Registeration.list.add("You And Your Zodiac Signs:Zodiac Mantras Book:Price 450Rs");
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
		psycologicalAstrology();
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
		psycologicalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	psycologicalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("You And Your Zodiac Signs:Zodiac Mantras Book:Price 450Rs");
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
		psycologicalAstrology();
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
		Registeration.addTocart.add("Encyclopaedia Of Psychological Astrology Book:Price 700Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Encyclopaedia Of Psychological Astrology Book is 700Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+700;
		Registeration.list.add("Encyclopaedia Of Psychological Astrology Book:Price 700Rs");
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
		psycologicalAstrology();
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
		psycologicalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	psycologicalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Encyclopaedia Of Psychological Astrology Book:Price 700Rs");
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
		psycologicalAstrology();
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
		Registeration.addTocart.add("Astrology & Diagnosis Book:Price 250Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Astrology & Diagnosis Book is 250Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+250;
		Registeration.list.add("Astrology & Diagnosis Book:Price 250Rs");
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
		psycologicalAstrology();
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
		psycologicalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	psycologicalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Astrology & Diagnosis Book:Price 250Rs");
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
		psycologicalAstrology();
   }
 }
}
	public void relationalAstrology(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Light On Relationships: The Synastry Of Indian Astrology Book Price 300Rs");
		  System.out.println("Type 2 for Astrology: Marriage And Relationships Book Price 220Rs");
		  System.out.println("Type 3 for Aspects In Astrology: A Guide To Understanding Planetary Relationships In The Horoscope Book Price 330Rs");
		  System.out.println("Type 4 for Astrology For Relationships: Your Complete Compatibility Guide To Friends, Lovers, Family, and Colleagues Book Price 500Rs");
		  System.out.println("Type 5 for Lal Kitab Book Price 800Rs");
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
					Registeration.addTocart.add("Light On Relationships: The Synastry Of Indian Astrology Book:Price 300Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Light On Relationships: The Synastry Of Indian Astrology Book is 300Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+300;
					Registeration.list.add("Light On Relationships: The Synastry Of Indian Astrology Book:Price 300Rs");
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
					relationalAstrology();
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
					relationalAstrology();			
				}
			}else if(c =='n'|| c =='N'){
				relationalAstrology();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Light On Relationships: The Synastry Of Indian Astrology Book:Price 300Rs");
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
					relationalAstrology();
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
			Registeration.addTocart.add("Astrology: Marriage And Relationships Book:Price 220Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Astrology: Marriage And Relationships Book is 220Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+220;
			Registeration.list.add("Astrology: Marriage And Relationships Book:Price 220Rs");
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
			relationalAstrology();
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
			relationalAstrology();			
		}
	}else if(c =='n'|| c =='N'){
		relationalAstrology();
	}
}
		case 3:{
			Registeration.addTocart.remove("Astrology: Marriage And Relationships Book:Price 220Rs");
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
			relationalAstrology();
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
		Registeration.addTocart.add("Aspects In Astrology: A Guide To Understanding Planetary Relationships In The Horoscope Book:Price 330Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Aspects In Astrology: A Guide To Understanding Planetary Relationships In The Horoscope Book is 330Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+330;
		Registeration.list.add("Aspects In Astrology: A Guide To Understanding Planetary Relationships In The Horoscope Book:Price 330Rs");
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
		relationalAstrology();
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
		relationalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	relationalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Aspects In Astrology: A Guide To Understanding Planetary Relationships In The Horoscope Book:Price 330Rs");
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
		relationalAstrology();
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
		Registeration.addTocart.add("Astrology For Relationships: Your Complete Compatibility Guide To Friends, Lovers, Family, and Colleagues Book:Price 500Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Astrology For Relationships: Your Complete Compatibility Guide To Friends, Lovers, Family, and Colleagues Book is 500Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+500;
		Registeration.list.add("Astrology For Relationships: Your Complete Compatibility Guide To Friends, Lovers, Family, and Colleagues Book:Price 500Rs");
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
		relationalAstrology();
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
		relationalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	relationalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Astrology For Relationships: Your Complete Compatibility Guide To Friends, Lovers, Family, and Colleagues Book:Price 500Rs");
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
		relationalAstrology();
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
		Registeration.addTocart.add("Lal Kitab Book:Price 800Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Lal Kitab Book is 800Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+800;
		Registeration.list.add("Lal Kitab Book:Price 800Rs");
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
		relationalAstrology();
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
		relationalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	relationalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Lal Kitab Book:Price 800Rs");
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
		relationalAstrology();
}
}
}
	public void tradtionalAstrology(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Vastu Remedies 2nd Edition Book Price 400Rs");
		  System.out.println("Type 2 for The Nakshatras: The Stars Beyond the Zodiac Book Price 300Rs");
		  System.out.println("Type 3 for Bhrigu Nandi Nadi: A Classical Work Based on NADI Technique of Prediction  Book Price 200Rs");
		  System.out.println("Type 4 for The Complete Book of Astrology (English, NA, Kris Brandt Riske) Book Price 150Rs");
		  System.out.println("Type 5 for Rahu & Kethu : The Life Changing Planets Book Price 800Rs");
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
					Registeration.addTocart.add("Vastu Remedies 2nd Edition Book:Price 400Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Vastu Remedies 2nd Edition Book is 400Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+400;
					Registeration.list.add("Vastu Remedies 2nd Edition Book:Price 400Rs");
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
					tradtionalAstrology();
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
					tradtionalAstrology();			
				}
			}else if(c =='n'|| c =='N'){
				tradtionalAstrology();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Vastu Remedies 2nd Edition Book:Price 400Rs");
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
					tradtionalAstrology();
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
			Registeration.addTocart.add("The Nakshatras: The Stars Beyond the Zodiac Book:Price 300Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Nakshatras: The Stars Beyond the Zodiac Book is 300Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+300;
			Registeration.list.add("The Nakshatras: The Stars Beyond the Zodiac Book:Price 300Rs");
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
			tradtionalAstrology();
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
			tradtionalAstrology();			
		}
	}else if(c =='n'|| c =='N'){
		tradtionalAstrology();
	}
}
		case 3:{
			Registeration.addTocart.remove("The Nakshatras: The Stars Beyond the Zodiac Book:Price 300Rs");
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
			tradtionalAstrology();
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
		Registeration.addTocart.add("Bhrigu Nandi Nadi: A Classical Work Based on NADI Technique of Prediction Book:Price 200Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Bhrigu Nandi Nadi: A Classical Work Based on NADI Technique of Prediction  Book is 200Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+200;
		Registeration.list.add("Bhrigu Nandi Nadi: A Classical Work Based on NADI Technique of Prediction Book:Price 200Rs");
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
		tradtionalAstrology();
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
		tradtionalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	tradtionalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("Bhrigu Nandi Nadi: A Classical Work Based on NADI Technique of Prediction Book:Price 200Rs");
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
		tradtionalAstrology();
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
		Registeration.addTocart.add("The Complete Book of Astrology (English, NA, Kris Brandt Riske) Book:Price 150Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Complete Book of Astrology (English, NA, Kris Brandt Riske) Book is 150Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+150;
		Registeration.list.add("The Complete Book of Astrology (English, NA, Kris Brandt Riske) Book:Price 150Rs");
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
		tradtionalAstrology();
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
		tradtionalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	tradtionalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove("The Complete Book of Astrology (English, NA, Kris Brandt Riske) Book:Price 150Rs");
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
		tradtionalAstrology();
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
		Registeration.addTocart.add("Rahu & Kethu : The Life Changing Planets Book:Price 800Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Rahu & Kethu : The Life Changing Planets Book is 800Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+800;
		Registeration.list.add("Rahu & Kethu : The Life Changing Planets Book:Price 800Rs");
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
		tradtionalAstrology();
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
		tradtionalAstrology();			
	}
}else if(c =='n'|| c =='N'){
	tradtionalAstrology();
}
}
	case 3:{
		Registeration.addTocart.remove(":Price Rs");
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
		tradtionalAstrology();
   }
  }
 }
}
