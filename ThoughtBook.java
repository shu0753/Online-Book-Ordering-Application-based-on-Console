package Library;
import java.util.Scanner;
public class ThoughtBook extends Interest implements Books2{
	public void type(){
		   System.out.println("======================================");
		   System.out.println("<<<<<<<<Choose Your BookType>>>>>>>>");
		   System.out.println("======================================");
		   System.out.println("Type 1 for Crictical Thinking Book");
		   System.out.println("Type 2 for Creative Thinking Book");
		   System.out.println("Type 3 for Analytical Thinking Book");
		   System.out.println("Type 4 for Abstract Thinking Book");
		   System.out.println("Type 5 for Concrete Thinking Book");
		   System.out.println("Type 6 for Go Back");
		   System.out.println("======================================");
		   Scanner s= new Scanner(System.in);
		   int Story=s.nextInt();
		   switch (Story){
		   case 1:{
			   criticalThinking();
			   break;   
		   }
		   case 2:{
			   creativeThinking();
			  break;   
		   }
		   case 3:{
			   analyticalThinking();
			  break;   
		   }
		   case 4:{
			   abstractThinking();
			  break;   
		   }
		   case 5:{
			   concreteThinking();
			  break;   
		   }
		   case 6:{
			   interest();
		   }
      }
   }
	public void criticalThinking(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Experts Secerts Book Price 400Rs");
		  System.out.println("Type 2 for Critcial Thinkers Book Price 300Rs");
		  System.out.println("Type 3 for Thinking Fast And Slow  Book Price 500Rs");
		  System.out.println("Type 4 for Artifcial Intelligence An Modern Approach  Book Price 200Rs");
		  System.out.println("Type 5 for Don't Believe Everything You Think Book Price 200Rs");
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
					Registeration.addTocart.add("Experts Secerts Book:Price 400Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Experts Secerts Book is 400Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+400;
					Registeration.list.add("Experts Secerts Book:Price 400Rs");
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
					criticalThinking();
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
					criticalThinking();			
				}
			}else if(c =='n'|| c =='N'){
				criticalThinking();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Experts Secerts Book:Price 400Rs");
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
					criticalThinking();
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
			Registeration.addTocart.add("Critcial Thinkers Book:Price 300Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Critcial Thinkers Book is 300Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+300;
			Registeration.list.add("Critcial Thinkers Book:Price 300Rs");
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
			criticalThinking();
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
			criticalThinking();			
		}
	}else if(c =='n'|| c =='N'){
		criticalThinking();
	}
}
		case 3:{
			Registeration.addTocart.remove("Critcial Thinkers Book:Price 300Rs");
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
			criticalThinking();
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
		Registeration.addTocart.add("Thinking Fast And Slow Book:Price 500Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Thinking Fast And Slow Book is 500Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+500;
		Registeration.list.add("Thinking Fast And Slow Book:Price 500Rs");
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
		criticalThinking();
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
		criticalThinking();			
	}
}else if(c =='n'|| c =='N'){
	criticalThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Thinking Fast And Slow Book:Price 500Rs");
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
		criticalThinking();
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
		Registeration.addTocart.add("Artifcial Intelligence An Modern Approach Book:Price 200Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Experts Secerts Book is 200Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+200;
		Registeration.list.add("Artifcial Intelligence An Modern Approach Book:Price 200Rs");
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
		criticalThinking();
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
		criticalThinking();			
	}
}else if(c =='n'|| c =='N'){
	criticalThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Artifcial Intelligence An Modern Approach Book:Price 200Rs");
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
		criticalThinking();
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
		Registeration.addTocart.add("Don't Believe Everything You Think Book:Price 200Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Don't Believe Everything You Think Book is 200Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+200;
		Registeration.list.add("Don't Believe Everything You Think Book:Price 200Rs");
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
		criticalThinking();
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
		criticalThinking();			
	}
}else if(c =='n'|| c =='N'){
	criticalThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Don't Believe Everything You Think Book:Price 200Rs");
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
		criticalThinking();
    }
   }
  }
	public void creativeThinking(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for The Art Of Creative Thinking Book Price 250Rs");
		  System.out.println("Type 2 for Creative Thinking:Finding Solutions Out Of The Box Book Price 320Rs");
		  System.out.println("Type 3 for Designing In StoryTelling Book Price 120Rs");
		  System.out.println("Type 4 for Things I Have Learned In My Life So Far Book Price 500Rs");
		  System.out.println("Type 5 for How To Fly A Horse Book Price 200Rs");
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
					Registeration.addTocart.add("The Art Of Creative Thinking Book:Price 250Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of The Art Of Creative Thinking Book is 250Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+250;
					Registeration.list.add("The Art Of Creative Thinking Book:Price 250Rs");
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
					creativeThinking();
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
					creativeThinking();			
				}
			}else if(c =='n'|| c =='N'){
				creativeThinking();
			}
		}
				case 3:{
					Registeration.addTocart.remove("The Art Of Creative Thinking Book:Price 250Rs");
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
					creativeThinking();
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
			Registeration.addTocart.add("Creative Thinking:Finding Solutions Out Of The Box Book:Price 320Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Creative Thinking:Finding Solutions Out Of The Box Book is 320Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+320;
			Registeration.list.add("Creative Thinking:Finding Solutions Out Of The Box Book:Price 320Rs");
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
			creativeThinking();
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
			creativeThinking();			
		}
	}else if(c =='n'|| c =='N'){
		creativeThinking();
	}
}
		case 3:{
			Registeration.addTocart.remove("Creative Thinking:Finding Solutions Out Of The Box Book:Price 320Rs");
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
			creativeThinking();
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
		Registeration.addTocart.add("Designing In StoryTelling Book:Price 120Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Designing In StoryTelling Book is 120Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+120;
		Registeration.list.add("Designing In StoryTelling Book:Price 120Rs");
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
		creativeThinking();
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
		creativeThinking();			
	}
}else if(c =='n'|| c =='N'){
	creativeThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Designing In StoryTelling Book:Price 120Rs");
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
		creativeThinking();
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
		Registeration.addTocart.add("Things I Have Learned In My Life So Far Book:Price 500Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Things I Have Learned In My Life So Far Book is 500Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+500;
		Registeration.list.add("Things I Have Learned In My Life So Far Book:Price 500Rs");
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
		creativeThinking();
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
		creativeThinking();			
	}
}else if(c =='n'|| c =='N'){
	creativeThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Things I Have Learned In My Life So Far Book:Price 500Rs");
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
		creativeThinking();
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
		Registeration.addTocart.add("How To Fly A Horse Book:Price 200Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of How To Fly A Horse Book is 200Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+200;
		Registeration.list.add("How To Fly A Horse Book:Price 200Rs");
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
		creativeThinking();
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
		creativeThinking();			
	}
}else if(c =='n'|| c =='N'){
	creativeThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("How To Fly A Horse Book:Price 200Rs");
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
		creativeThinking();
    }
  }
}
	public void analyticalThinking(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for A Mind For Numbers Book Price 200Rs");
		  System.out.println("Type 2 for Analytical And Logical Reasoning For CAT And Other Management Entrance Tests Book Price 800Rs");
		  System.out.println("Type 3 for Mind Master  Book Price 320Rs");
		  System.out.println("Type 4 for The Silicon Mind Book Price 400Rs");
		  System.out.println("Type 5 for The Power Of Your Subconscious Mind Book Price 250Rs");
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
					Registeration.addTocart.add(" A Mind For Numbers Book:Price 200Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of A Mind For Numbers Book is 200Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+200;
					Registeration.list.add(" A Mind For Numbers Book:Price 200Rs");
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
					analyticalThinking();
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
					analyticalThinking();			
				}
			}else if(c =='n'|| c =='N'){
				analyticalThinking();
			}
		}
				case 3:{
					Registeration.addTocart.remove(" A Mind For Numbers Book:Price 200Rs");
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
					analyticalThinking();
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
			Registeration.addTocart.add("Analytical And Logical Reasoning For CAT And Other Management Entrance Tests Book:Price 800Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Analytical And Logical Reasoning For CAT And Other Management Entrance Tests Book is 800Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+800;
			Registeration.list.add("Analytical And Logical Reasoning For CAT And Other Management Entrance Tests Book:Price 800Rs");
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
			analyticalThinking();
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
			analyticalThinking();			
		}
	}else if(c =='n'|| c =='N'){
		analyticalThinking();
	}
}
		case 3:{
			Registeration.addTocart.remove("Analytical And Logical Reasoning For CAT And Other Management Entrance Tests Book:Price 800Rs");
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
			analyticalThinking();
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
		Registeration.addTocart.add("Mind Master Book:Price 320Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Mind Master Book Price 320Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+320;
		Registeration.list.add("Mind Master Book:Price 320Rs");
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
		analyticalThinking();
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
		analyticalThinking();			
	}
}else if(c =='n'|| c =='N'){
	analyticalThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Mind Master Book:Price 320Rs");
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
		analyticalThinking();
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
		Registeration.addTocart.add("The Silicon Mind Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Silicon Mind Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("The Silicon Mind Book:Price 400Rs");
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
		analyticalThinking();
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
		analyticalThinking();			
	}
}else if(c =='n'|| c =='N'){
	analyticalThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("The Silicon Mind Book:Price 400Rs");
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
		analyticalThinking();
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
		Registeration.addTocart.add("The Power Of Your Subconscious Mind Book:Price 250Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Power Of Your Subconscious Mind Book is 200Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+250;
		Registeration.list.add("The Power Of Your Subconscious Mind Book:Price 250Rs");
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
		analyticalThinking();
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
		analyticalThinking();			
	}
}else if(c =='n'|| c =='N'){
	analyticalThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("The Power Of Your Subconscious Mind Book:Price 250Rs");
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
		analyticalThinking();
}
}
	}
	public void abstractThinking(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for The Wisdom Of Crowds James Book Price 200Rs");
		  System.out.println("Type 2 for The Usefulness Of Useless Knowledge  Book Price 400Rs");
		  System.out.println("Type 3 for A Light In Attic Book Price 240Rs");
		  System.out.println("Type 4 for Think Like A Rocket Scientist Book Price 220Rs");
		  System.out.println("Type 5 for A Walk In The Park Book Price 300Rs");
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
					Registeration.addTocart.add("The Wisdom Of Crowds James Book:Price 200Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of The Wisdom Of Crowds James Book is 200Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+200;
					Registeration.list.add("The Wisdom Of Crowds James Book:Price 200Rs");
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
					abstractThinking();
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
					abstractThinking();			
				}
			}else if(c =='n'|| c =='N'){
				abstractThinking();
			}
		}
				case 3:{
					Registeration.addTocart.remove("The Wisdom Of Crowds James Book:Price 200Rs");
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
					abstractThinking();
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
			Registeration.addTocart.add("The Usefulness Of Useless Knowledge Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Usefulness Of Useless Knowledge Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("The Usefulness Of Useless Knowledge Book:Price 400Rs");
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
			abstractThinking();
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
			abstractThinking();			
		}
	}else if(c =='n'|| c =='N'){
		abstractThinking();
	}
}
		case 3:{
			Registeration.addTocart.remove("The Usefulness Of Useless Knowledge Book:Price 400Rs");
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
			abstractThinking();
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
		Registeration.addTocart.add("A Light In Attic Book:Price 240Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of A Light In Attic Book is 240Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+240;
		Registeration.list.add("A Light In Attic Book:Price 240Rs");
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
		abstractThinking();
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
		abstractThinking();			
	}
}else if(c =='n'|| c =='N'){
	abstractThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("A Light In Attic Book:Price 240Rs");
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
		abstractThinking();
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
		Registeration.addTocart.add("Think Like A Rocket Scientist Book:Price 220Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Think Like A Rocket Scientist Book is 220Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+220;
		Registeration.list.add("Think Like A Rocket Scientist Book:Price 220Rs");
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
		abstractThinking();
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
		abstractThinking();			
	}
}else if(c =='n'|| c =='N'){
	abstractThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Think Like A Rocket Scientist Book:Price 220Rs");
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
		abstractThinking();
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
		Registeration.addTocart.add("A Walk In The Park Book:Price 300Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of A Walk In The Park Book is 300Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+300;
		Registeration.list.add("A Walk In The Park Book:Price 300Rs");
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
		abstractThinking();
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
		abstractThinking();			
	}
}else if(c =='n'|| c =='N'){
	abstractThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("A Walk In The Park Book:Price 300Rs");
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
		abstractThinking();
}
}
}
	public void concreteThinking(){
		System.out.println("=================================================");
		  System.out.println("Choose your Book");
		  System.out.println("=================================================");
		  System.out.println("Type 1 for Concrete Thinking Story Book Price 300Rs");
		  System.out.println("Type 2 for Concrete Lies And Abstract Truths Kindle Edition Book Price 500Rs");
		  System.out.println("Type 3 for Radical Uncertainty:Decision-Making Beyond The Numbers Book Price 300Rs");
		  System.out.println("Type 4 for Through The Magic Mirror Book Price 600Rs");
		  System.out.println("Type 5 for Concrete Thinking By Demas Nwoko Book Price 100Rs");
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
					Registeration.addTocart.add("Concrete Thinking Story Book:Price 300Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Concrete Thinking Story Book is 300Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+300;
					Registeration.list.add("Concrete Thinking Story Book:Price 300Rs");
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
					concreteThinking();
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
					concreteThinking();			
				}
			}else if(c =='n'|| c =='N'){
				concreteThinking();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Concrete Thinking Story Book:Price 300Rs");
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
					concreteThinking();
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
			Registeration.addTocart.add("Concrete Lies And Abstract Truths Kindle Edition Book:Price 500Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Concrete Lies And Abstract Truths Kindle Edition Book is 500Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+500;
			Registeration.list.add("Concrete Lies And Abstract Truths Kindle Edition Book:Price 500Rs");
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
			concreteThinking();
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
			concreteThinking();			
		}
	}else if(c =='n'|| c =='N'){
		concreteThinking();
	}
}
		case 3:{
			Registeration.addTocart.remove("Concrete Lies And Abstract Truths Kindle Edition Book:Price 500Rs");
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
			concreteThinking();
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
		Registeration.addTocart.add("Radical Uncertainty:Decision-Making Beyond The Numbers Book:Price 300Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Radical Uncertainty:Decision-Making Beyond The Numbers Book is 300Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+300;
		Registeration.list.add("Radical Uncertainty:Decision-Making Beyond The Numbers Book:Price 300Rs");
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
		concreteThinking();
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
		concreteThinking();			
	}
}else if(c =='n'|| c =='N'){
	concreteThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Radical Uncertainty:Decision-Making Beyond The Numbers Book:Price 300Rs");
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
		concreteThinking();
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
		Registeration.addTocart.add("Through The Magic Mirror Book:Price 600Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Through The Magic Mirror Book is 600Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+600;
		Registeration.list.add("Through The Magic Mirror Book:Price 600Rs");
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
		concreteThinking();
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
		concreteThinking();			
	}
}else if(c =='n'|| c =='N'){
	concreteThinking();
}
}
	case 3:{
		Registeration.addTocart.remove("Through The Magic Mirror Book:Price 600Rs");
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
		concreteThinking();
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
		Registeration.addTocart.add("Concrete Thinking By Demas Nwoko Book:Price 100Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Concrete Thinking By Demas Nwoko Book is 100Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+100;
		Registeration.list.add("Concrete Thinking By Demas Nwoko Book:Price 100Rs");
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
		concreteThinking();
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
		concreteThinking();			
	}
}else if(c =='n'|| c =='N'){
	concreteThinking();
  }
}
	case 3:{
		Registeration.addTocart.remove("Concrete Thinking By Demas Nwoko Book:Price 100Rs");
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
		concreteThinking();
      }
    }
  }
 }