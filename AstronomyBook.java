package Library;
import java.util.Scanner;
public class AstronomyBook extends Interest implements Books5{
	public void type(){
		   System.out.println("======================================");
		   System.out.println("<<<<<<<<Choose Your BookType>>>>>>>>");
		   System.out.println("======================================");
		   System.out.println("Type 1 for Astrophysics Book");
		   System.out.println("Type 2 for Astrometry Book");
		   System.out.println("Type 3 for Astrogelogy Book");
		   System.out.println("Type 4 for Astrobiology Book");
		   System.out.println("Type 5 for Cosmology Book");
		   System.out.println("Type 6 for Go Back");
		   System.out.println("======================================");
		   Scanner s= new Scanner(System.in);
		   int Story=s.nextInt();
		   switch (Story){
		   case 1:{
			   astrophysics();
			   break;   
		   }
		   case 2:{
			   astrometry();
			  break;   
		   }
		   case 3:{
			   astrogelogy();
			  break;   
		   }
		   case 4:{
			   astrobiology();
			  break;   
		   }
		   case 5:{
			   cosmology();
			  break;   
		   }
		   case 6:{
			   interest();
		   }
        }
  }
	public void astrophysics(){
		  System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for To Infinity And Beyond: A Journey Of Cosmic Discovery Book Price 500Rs");
		  System.out.println("Type 2 for Science Book, The ( Big Ideas): Big Ideas Simply Explained Book Price 520Rs ");
		  System.out.println("Type 3 for Relativity: The Special And General Theory Book Price 600Rs");
		  System.out.println("Type 4 for A Textbook Of Astronomy And Astrophysics Book Price 350Rs");
		  System.out.println("Type 5 for For The Love Of Physics Price 600Rs");
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
					Registeration.addTocart.add("To Infinity And Beyond: A Journey Of Cosmic Discovery Book:Price 500Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of To Infinity And Beyond: A Journey Of Cosmic Discovery Book is 500Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+500;
					Registeration.list.add("To Infinity And Beyond: A Journey Of Cosmic Discovery Book:Price 500Rs");
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
					astrophysics();
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
					astrophysics();			
				}
			}else if(c =='n'|| c =='N'){
				astrophysics();
			}
		}
				case 3:{
					Registeration.addTocart.remove("To Infinity And Beyond: A Journey Of Cosmic Discovery Book:Price 500Rs");
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
					astrophysics();
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
			Registeration.addTocart.add("Science Book, The ( Big Ideas): Big Ideas Simply Explained Book:Price 520Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Science Book, The ( Big Ideas): Big Ideas Simply Explained Book is 520Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+520;
			Registeration.list.add("Science Book, The ( Big Ideas): Big Ideas Simply Explained Book:Price 520Rs");
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
			astrophysics();
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
			astrophysics();			
		}
	}else if(c =='n'|| c =='N'){
		astrophysics();
	}
}
		case 3:{
			Registeration.addTocart.remove("Science Book, The ( Big Ideas): Big Ideas Simply Explained Book:Price 520Rs");
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
			astrophysics();
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
			Registeration.addTocart.add("Relativity: The Special And General Theory Book:Price 600Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Relativity: The Special And General Theory Book is 600Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+600;
			Registeration.list.add("Relativity: The Special And General Theory Book:Price 600Rs");
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
			astrophysics();
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
			astrophysics();			
		}
	}else if(c =='n'|| c =='N'){
		astrophysics();
	}
}
		case 3:{
			Registeration.addTocart.remove(3);
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
			astrophysics();
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
		Registeration.addTocart.add("A Textbook Of Astronomy And Astrophysics Book:Price 350Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of A Textbook Of Astronomy And Astrophysics Book is 350Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+350;
		Registeration.list.add("A Textbook Of Astronomy And Astrophysics Book:Price 350Rs");
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
		astrophysics();
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
		astrophysics();			
	}
}else if(c =='n'|| c =='N'){
	astrophysics();
}
}
	case 3:{
		Registeration.addTocart.remove("A Textbook Of Astronomy And Astrophysics Book:Price 350Rs");
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
		astrophysics();
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
		Registeration.addTocart.add("For The Love Of Physics Book:Price 600Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of For The Love Of Physics is 600Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+600;
		Registeration.list.add("For The Love Of Physics Book:Price 600Rs");
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
		astrophysics();
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
		astrophysics();			
	}
}else if(c =='n'|| c =='N'){
	astrophysics();
}
}
	case 3:{
		Registeration.addTocart.remove("For The Love Of Physics Book:Price 600Rs");
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
		astrophysics();
    }
  }
}
	public void astrometry(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Fundamentals Of Astrometry Book Price 350Rs");
		  System.out.println("Type 2 for Astrometry For Astrophysics Book Price 400Rs");
		  System.out.println("Type 3 for Modern Astrometry (Astronomy and Astrophysics Library) Book Price 600Rs");
		  System.out.println("Type 4 for A Guide To Astronomical Calculations Book Price 450Rs");
		  System.out.println("Type 5 for Principles Of Astronomy & Mathematical Astrology Book Price 200Rs");
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
					Registeration.addTocart.add("Fundamentals Of Astrometry Book:Price 350Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Fundamentals Of Astrometry Book is 350Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+350;
					Registeration.list.add("Fundamentals Of Astrometry Book:Price 350Rs");
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
					astrometry();
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
					astrometry();			
				}
			}else if(c =='n'|| c =='N'){
				astrometry();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Fundamentals Of Astrometry Book:Price 350Rs");
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
					astrometry();
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
			Registeration.addTocart.add("Astrometry For Astrophysics Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Astrometry For Astrophysics Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("Astrometry For Astrophysics Book:Price 400Rs");
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
			astrometry();
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
			astrometry();			
		}
	}else if(c =='n'|| c =='N'){
		astrometry();
	}
}
		case 3:{
			Registeration.addTocart.remove("Astrometry For Astrophysics Book:Price 400Rs");
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
			astrometry();
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
		Registeration.addTocart.add("Modern Astrometry(Astronomy and Astrophysics Library)Book:Price 600Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Modern Astrometry (Astronomy and Astrophysics Library) Book is 600Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+600;
		Registeration.list.add("Modern Astrometry(Astronomy and Astrophysics Library)Book:Price 600Rs");
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
		astrometry();
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
		astrometry();			
	}
}else if(c =='n'|| c =='N'){
	astrometry();
}
}
	case 3:{
		Registeration.addTocart.remove("Modern Astrometry(Astronomy and Astrophysics Library)Book:Price 600Rs");
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
		astrometry();
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
		Registeration.addTocart.add("A Guide To Astronomical Calculations Book:Price 450Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of A Guide To Astronomical Calculations Book is 450Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+450;
		Registeration.list.add("A Guide To Astronomical Calculations Book:Price 450Rs");
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
		astrometry();
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
		astrometry();			
	}
}else if(c =='n'|| c =='N'){
	astrometry();
}
}
	case 3:{
		Registeration.addTocart.remove("A Guide To Astronomical Calculations Book:Price 450Rs");
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
		astrometry();
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
		Registeration.addTocart.add("Principles Of Astronomy & Mathematical Astrology Book:Price 200Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Principles Of Astronomy & Mathematical Astrology Book is 200Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+200;
		Registeration.list.add("Principles Of Astronomy & Mathematical Astrology Book:Price 200Rs");
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
		astrometry();
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
		astrometry();			
	}
}else if(c =='n'|| c =='N'){
	astrometry();
}
}
	case 3:{
		Registeration.addTocart.remove("Principles Of Astronomy & Mathematical Astrology Book:Price 200Rs");
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
		astrometry();
}
}
}
	public void astrogelogy(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for The Geology Of Multi-Ring Impact Basins: The Moon and Other Planets Book Price 500Rs");
		  System.out.println("Type 2 for Hazards Due To Comets And Asteroids Book Price 600Rs");
		  System.out.println("Type 3 for The Astro-Geology Of Earthquakes And Volcanoes Book Price 400Rs");
		  System.out.println("Type 4 for The Astro-Geology Of Planets Book Price 450Rs");
		  System.out.println("Type 5 for Seismology Of The Sun And The Distant Stars Book Price 330Rs");
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
					Registeration.addTocart.add("The Geology Of Multi-Ring Impact Basins: The Moon And Other Planets Book:Price 500Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of The Geology Of Multi-Ring Impact Basins: The Moon And Other Planets Book is 500Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+500;
					Registeration.list.add("The Geology Of Multi-Ring Impact Basins: The Moon and Other Planets Book:Price 500Rs");
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
					astrogelogy();
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
					astrogelogy();			
				}
			}else if(c =='n'|| c =='N'){
				astrogelogy();
			}
		}
				case 3:{
					Registeration.addTocart.remove("The Geology Of Multi-Ring Impact Basins: The Moon And Other Planets Book:Price 500Rs");
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
					astrogelogy();
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
			Registeration.addTocart.add("Hazards Due To Comets And Asteroids Book:Price 600Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Hazards Due To Comets And Asteroids Book is 600Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+600;
			Registeration.list.add("Hazards Due To Comets And Asteroids Book:Price 600Rs");
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
			astrogelogy();
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
			astrogelogy();			
		}
	}else if(c =='n'|| c =='N'){
		astrogelogy();
	}
}
		case 3:{
			Registeration.addTocart.remove("Hazards Due To Comets And Asteroids Book:Price 600Rs");
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
			astrogelogy();
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
		Registeration.addTocart.add("Astro-Geology Of Earthquakes And Volcanoes Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Astro-Geology Of Earthquakes And Volcanoes Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("Astro-Geology Of Earthquakes And Volcanoes Book:Price 400Rs");
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
		astrogelogy();
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
		astrogelogy();			
	}
}else if(c =='n'|| c =='N'){
	astrogelogy();
}
}
	case 3:{
		Registeration.addTocart.remove("Astro-Geology Of Earthquakes And Volcanoes Book:Price 400Rs");
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
		astrogelogy();
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
		Registeration.addTocart.add("The Astro-Geology Of Planets Book:Price 450Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Astro-Geology Of Planets Book is 450Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+450;
		Registeration.list.add("The Astro-Geology Of Planets Book:Price 450Rs");
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
		astrogelogy();
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
		astrogelogy();			
	}
}else if(c =='n'|| c =='N'){
	astrogelogy();
}
}
	case 3:{
		Registeration.addTocart.remove("The Astro-Geology Of Planets Book:Price 450Rs");
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
		astrogelogy();
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
		Registeration.addTocart.add("Seismology Of The Sun And The Distant Stars Book:Price 330Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Seismology Of The Sun And The Distant Stars Book is 330Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+300;
		Registeration.list.add("Seismology Of The Sun And The Distant Stars Book:Price 330Rs");
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
		astrogelogy();
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
		astrogelogy();			
	}
}else if(c =='n'|| c =='N'){
	astrogelogy();
}
}
	case 3:{
		Registeration.addTocart.remove("Seismology Of The Sun And The Distant Stars Book:Price 330Rs");
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
		astrogelogy();
    }
  }
}
	public void astrobiology(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Astrobiology & Space Medicine Book Price 250Rs");
		  System.out.println("Type 2 for The Story Of Earth: The First 4.5 Billion Years, From Stardust To Living Planet Book Price 600Rs");
		  System.out.println("Type 3 for An Introduction To Astrobiology Book Price 100Rs");
		  System.out.println("Type 4 for Astrobiology (Hot Science) Book Price 400Rs");
		  System.out.println("Type 5 for Astrobiology: Origins From The Big-Bang To Civilisation Book Price 550Rs");
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
					Registeration.addTocart.add("Astrobiology & Space Medicine Book:Price 250Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Astrobiology & Space Medicine Book is 250Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+250;
					Registeration.list.add("Astrobiology & Space Medicine Book:Price 250Rs");
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
					astrobiology();
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
					astrobiology();			
				}
			}else if(c =='n'|| c =='N'){
				astrobiology();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Astrobiology & Space Medicine Book:Price 250Rs");
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
					astrobiology();
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
			Registeration.addTocart.add("The Story Of Earth: The First 4.5 Billion Years, From Stardust To Living Planet Book:Price 600Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Story Of Earth: The First 4.5 Billion Years, From Stardust To Living Planet Book is 600Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+600;
			Registeration.list.add("The Story Of Earth: The First 4.5 Billion Years, From Stardust To Living Planet Book:Price 600Rs");
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
			astrobiology();
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
			astrobiology();			
		}
	}else if(c =='n'|| c =='N'){
		astrobiology();
	}
}
		case 3:{
			Registeration.addTocart.remove("The Story Of Earth: The First 4.5 Billion Years, From Stardust To Living Planet Book:Price 600Rs");
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
			astrobiology();
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
		Registeration.addTocart.add("An Introduction To Astrobiology Book:Price 100Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of An Introduction To Astrobiology Book is 100Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+100;
		Registeration.list.add("An Introduction To Astrobiology Book:Price 100Rs");
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
		astrobiology();
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
		astrobiology();			
	}
}else if(c =='n'|| c =='N'){
	astrobiology();
}
}
	case 3:{
		Registeration.addTocart.remove("An Introduction To Astrobiology Book:Price 100Rs");
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
		astrobiology();
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
		Registeration.addTocart.add("Astrobiology (Hot Science) Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Astrobiology (Hot Science) Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("Astrobiology (Hot Science) Book:Price 400Rs");
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
		astrobiology();
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
		astrobiology();			
	}
}else if(c =='n'|| c =='N'){
	astrobiology();
}
}
	case 3:{
		Registeration.addTocart.remove("Astrobiology (Hot Science) Book:Price 400Rs");
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
		astrobiology();
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
		Registeration.addTocart.add("Astrobiology: Origins From The Big-Bang To Civilisation Book:Price 550Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Astrobiology: Origins from the Big-Bang to Civilisation Book is 550Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+550;
		Registeration.list.add("Astrobiology: Origins From The Big-Bang To Civilisation Book:Price 550Rs");
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
		astrobiology();
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
		astrobiology();			
	}
}else if(c =='n'|| c =='N'){
	astrobiology();
}
}
	case 3:{
		Registeration.addTocart.remove("Astrobiology: Origins From The Big-Bang To Civilisation Book:Price 550Rs");
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
		astrobiology();
   }
 }
}
	public void cosmology(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Cosmos Book Price 600Rs");
		  System.out.println("Type 2 for Introduction To Cosmology, 3rd Edn Book Price 350Rs");
		  System.out.println("Type 3 for Cosmic Science - An Honour For Human Thirst To Quest Book Price 450Rs");
		  System.out.println("Type 4 for Cosmology For The Curious Book Price 170Rs");
		  System.out.println("Type 5 for The Hubble Cosmos Book Price 280Rs");
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
					Registeration.addTocart.add("Cosmos Book:Price 600Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Cosmos Book is 600Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+600;
					Registeration.list.add("Cosmos Book:Price 600Rs");
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
					cosmology();
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
					cosmology();			
				}
			}else if(c =='n'|| c =='N'){
				cosmology();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Cosmos Book:Price 600Rs");
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
					cosmology();
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
			Registeration.addTocart.add("Introduction To Cosmology, 3rd Edn Book:Price 350Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Introduction To Cosmology, 3rd Edn Book is 350Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+350;
			Registeration.list.add("Introduction To Cosmology, 3rd Edn Book:Price 350Rs");
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
			cosmology();
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
			cosmology();			
		}
	}else if(c =='n'|| c =='N'){
		cosmology();
	}
}
		case 3:{
			Registeration.addTocart.remove("Introduction To Cosmology, 3rd Edn Book:Price 350Rs");
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
			cosmology();
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
		Registeration.addTocart.add("Cosmic Science - An Honour For Human Thirst To Quest Book:Price 450Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Cosmic Science - An Honour For Human Thirst To Quest Book is 450Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+450;
		Registeration.list.add("Cosmic Science - An Honour For Human Thirst To Quest Book:Price 450Rs");
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
		cosmology();
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
		cosmology();			
	}
}else if(c =='n'|| c =='N'){
	cosmology();
}
}
	case 3:{
		Registeration.addTocart.remove("Cosmic Science - An Honour For Human Thirst To Quest Book:Price 450Rs");
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
		cosmology();
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
		Registeration.addTocart.add("Cosmology For The Curious Book:Price 170Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Cosmology For The Curious Book is 170Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+170;
		Registeration.list.add("Cosmology For The Curious Book:Price 170Rs");
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
		cosmology();
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
		cosmology();			
	}
}else if(c =='n'|| c =='N'){
	cosmology();
}
}
	case 3:{
		Registeration.addTocart.remove("Cosmology For The Curious Book:Price 170Rs");
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
		cosmology();
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
		Registeration.addTocart.add("The Hubble Cosmos Book:Price 280Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Hubble Cosmos Book is 280Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+280;
		Registeration.list.add("The Hubble Cosmos Book:Price 280Rs");
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
		cosmology();
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
		cosmology();			
	}
}else if(c =='n'|| c =='N'){
	cosmology();
}
}
	case 3:{
		Registeration.addTocart.remove("The Hubble Cosmos Book:Price 280Rs");
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
		cosmology();
     }
   }
  }
}


