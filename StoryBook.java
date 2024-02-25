package Library;
import java.util.Scanner;
public class StoryBook extends Interest implements Books{
	public void type(){
		   System.out.println("======================================");
		   System.out.println("<<<<<<<<Choose Your BookType>>>>>>>>");
		   System.out.println("======================================");
		   System.out.println("Type 1 for Action and Adventure Book");
		   System.out.println("Type 2 for Detective and Mystery Book");
		   System.out.println("Type 3 for Historical Fiction Book");
		   System.out.println("Type 4 for Horror Book");
		   System.out.println("Type 5 for Romance Book");
		   System.out.println("Type 6 for Go Back");
		   System.out.println("======================================");
		   Scanner s= new Scanner(System.in);
		   int Story=s.nextInt();
		   switch (Story){
		   case 1:{
			   actionAndadventure();
			   break;   
		   }
		   case 2:{
			   detectiveAndmystery();
			  break;   
		   }
		   case 3:{
			   historicalFiction();
			  break;   
		   }
		   case 4:{
			   horror();
			  break;   
		   }
		   case 5:{
			   romance();
			  break;   
		   }
		   case 6:{
			   interest();
		   }default:
			   System.out.println("Enter Valid Input");
			   type();
     }
}
	public void actionAndadventure(){
	  System.out.println("=================================================");
	  System.out.println("Choose your Book");
	  System.out.println("=================================================");
	  System.out.println("Type 1 for The Vagrant(The Vagrant Trilogy) Book Price 300Rs");
	  System.out.println("Type 2 for Samsara:Enter the Valley of Gods Book Price 250rs ");
	  System.out.println("Type 3 for Rahasyamayi Safar Book Price 400Rs");
	  System.out.println("Type 4 for The Old Man and The Sea Book Price 250Rs");
	  System.out.println("Type 5 for Kaliyuga Book Price 400Rs");
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
				Registeration.addTocart.add("The Vagrant(The Vagrant Trilogy) Book:Price 300Rs");
				System.out.println("Your Book Added to Cart successfully");
				System.out.println("=========================================");
			}
			case 2:{
				System.out.println("Price of The Vagrant(The Vagrant Trilogy) Book is 300Rs");
				System.out.println("Confirm your Order by Pressing Y/N");
				char c =s.next().charAt(0);
			if(c=='y'||c=='Y'){
				System.out.println("Order Confirm");
				Registeration.TotalAmount=Registeration.TotalAmount+300;
				Registeration.list.add("The Vagrant(The Vagrant Trilogy) Book:Price 300Rs");
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
				actionAndadventure();
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
				actionAndadventure();			
			}
		}else if(c =='n'|| c =='N'){
			actionAndadventure();
		}
	}
			case 3:{
				Registeration.addTocart.remove("The Vagrant(The Vagrant Trilogy) Book:Price 300Rs");
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
				actionAndadventure();
		}
}
else if(Option==2){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Samsara:Enter the Valley of Gods Book:Price 250Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Samsara:Enter the Valley of Gods Book is 250Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+250;
		Registeration.list.add("Samsara:Enter the Valley of Gods Book:Price 250Rs");
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
		actionAndadventure();
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
		actionAndadventure();			
	}
}else if(c =='n'|| c =='N'){
	actionAndadventure();
}
}
	case 3:{
		Registeration.addTocart.remove("Samsara:Enter the Valley of Gods Book:Price 250Rs");
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
		actionAndadventure();
  }	  
}
else if(Option==3){
	System.out.println("Type 1 To Add Book In Your Add To Cart");
	System.out.println("Type 2 If You Want To Purchase Book");
	System.out.println("Type 3 To Remove Book From Your Add To Cart");
	System.out.println("Type 4 To View Your Add To Cart");
	System.out.println("Type 5 To GO Back");
	System.out.println("============================================");
	int addTocart=s.nextInt();
	switch(addTocart) {
	case 1:{
		Registeration.addTocart.add("Rahasyamayi Safar Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Rahasyamayi Safar Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("Rahasyamayi Safar Book:Price 400Rs");
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
		actionAndadventure();
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
		actionAndadventure();			
	}
}else if(c =='n'|| c =='N'){
	actionAndadventure();
}
}
	case 3:{
		Registeration.addTocart.remove("Rahasyamayi Safar Book:Price 400Rs");
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
		actionAndadventure();
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
			Registeration.addTocart.add("The Old Man and The Sea Book:Price 250Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Old Man and The Sea Book is 250Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+250;
			Registeration.list.add("The Old Man and The Sea Book:Price 250Rs");
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
			actionAndadventure();
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
			actionAndadventure();			
		}
	}else if(c =='n'|| c =='N'){
		actionAndadventure();
	}
}
    case 3:{
			Registeration.addTocart.remove("The Old Man and The Sea Book:Price 250Rs");
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
			actionAndadventure();
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
		Registeration.addTocart.add("Kaliyuga Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Kaliyuga Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("Kaliyuga Book:Price 400Rs");
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
		actionAndadventure();
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
		actionAndadventure();			
	}
}else if(c =='n'|| c =='N'){
	actionAndadventure();
}
}
	case 3:{
		Registeration.addTocart.remove("Kaliyuga Book:Price 400Rs");
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
		actionAndadventure();
    }
  }
}	  

    public void detectiveAndmystery(){
      System.out.println("=======================================================");
      System.out.println("Choose your Book");
      System.out.println("=======================================================");
  	  System.out.println("Type 1 for The Mystery of Hidden Lab Book Price 100Rs");
  	  System.out.println("Type 2 for The Perfect Murder Book Price 200Rs");
  	  System.out.println("Type 3 for The Hidden Hindu Book Price 300Rs");
  	  System.out.println("Type 4 for Dark Psycology Secerts and Manipulation Book Price 400Rs");
  	  System.out.println("Type 5 for Journey to the Centre of the Earth Book Price 500Rs");
  	  System.out.println("Type 6 for Go Back");
  	  System.out.println("=======================================================");
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
				Registeration.addTocart.add("The Mystery of Hidden Lab Book:Price 100Rs");
				System.out.println("Your Book Added to Cart successfully");
				System.out.println("=========================================");
			}
			case 2:{
				System.out.println("Price of The Mystery of Hidden Lab Book is 100Rs");
				System.out.println("Confirm your Order by Pressing Y/N");
				char c =s.next().charAt(0);
			if(c=='y'||c=='Y'){
				System.out.println("Order Confirm");
				Registeration.TotalAmount=Registeration.TotalAmount+100;
				Registeration.list.add("The Mystery of Hidden Lab Book:Price 100Rs");
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
				detectiveAndmystery();
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
				detectiveAndmystery();			
			}
		}else if(c =='n'|| c =='N'){
			detectiveAndmystery();
		}
	}
			case 3:{
				Registeration.addTocart.remove("The Mystery of Hidden Lab Book:Price 100Rs");
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
				detectiveAndmystery();
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
			Registeration.addTocart.add("The Perfect Murder Book:Price 200Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Perfect Murder Book is 200Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+200;
			Registeration.list.add("The Perfect Murder Book:Price 200Rs");
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
			detectiveAndmystery();
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
			detectiveAndmystery();			
		}
	}else if(c =='n'|| c =='N'){
		detectiveAndmystery();
	}
}
		case 3:{
			Registeration.addTocart.remove("The Perfect Murder Book:Price 200Rs");
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
			detectiveAndmystery();
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
			Registeration.addTocart.add("The Hidden Hindu Book:Price 300Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Hidden Hindu Book is 300Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+300;
			Registeration.list.add("The Hidden Hindu Book:Price 300Rs");
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
			detectiveAndmystery();
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
			detectiveAndmystery();			
		}
	}else if(c =='n'|| c =='N'){
		detectiveAndmystery();
	}
}
		case 3:{
			Registeration.addTocart.remove("The Hidden Hindu Book:Price 300Rs");
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
			detectiveAndmystery();
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
			Registeration.addTocart.add("Dark Psycology Secerts and Manipulation Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Dark Psycology Secerts and Manipulation Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("Dark Psycology Secerts and Manipulation Book:Price 400Rs");
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
			detectiveAndmystery();
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
			detectiveAndmystery();			
		}
	}else if(c =='n'|| c =='N'){
		detectiveAndmystery();
	}
}
		case 3:{
			Registeration.addTocart.remove("Dark Psycology Secerts and Manipulation Book:Price 400Rs");
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
			detectiveAndmystery();
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
				Registeration.addTocart.add("Journey to the Centre of the Earth Book:Price 500Rs");
				System.out.println("Your Book Added to Cart successfully");
				System.out.println("=========================================");
			}
			case 2:{
				System.out.println("Price of Journey to the Centre of the Earth Book is 500Rs");
				System.out.println("Confirm your Order by Pressing Y/N");
				char c =s.next().charAt(0);
			if(c=='y'||c=='Y'){
				System.out.println("Order Confirm");
				Registeration.TotalAmount=Registeration.TotalAmount+500;
				Registeration.list.add("Journey to the Centre of the Earth Book:Price 500Rs");
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
				detectiveAndmystery();
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
				detectiveAndmystery();			
			}
		}else if(c =='n'|| c =='N'){
			detectiveAndmystery();
		}
	}
			case 3:{
				Registeration.addTocart.remove("Journey to the Centre of the Earth Book:Price 500Rs");
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
				detectiveAndmystery();
		}	
	}else if(Option==6){
			type();
		}
	}
    public void historicalFiction(){
      System.out.println("=======================================================");
      System.out.println("Choose your Book");
      System.out.println("=======================================================");
  	  System.out.println("Type 1 for Kaikash Dwara Book Price 350Rs");
  	  System.out.println("Type 2 for Shivaji:The Great Maratha Book Price 300Rs");
  	  System.out.println("Type 3 for Why I Killed Gandhi? Book Price 400Rs");
  	  System.out.println("Type 4 for The Forgotten History of India Book Price 250Rs");
  	  System.out.println("Type 5 for Eye of Shiva:Beyond the Quantum Universe Book Price 400Rs");
  	  System.out.println("Type 6 for Go Back");
  	  System.out.println("=======================================================");
  	  Scanner s= new Scanner(System.in);
	  int Option =s.nextInt();
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
				Registeration.addTocart.add("Kaikash Dwara Book:Price 350Rs");
				System.out.println("Your Book Added to Cart successfully");
				System.out.println("=========================================");
			}
			case 2:{
				System.out.println("Price of Kaikash Dwara Book is 350Rs");
				System.out.println("Confirm your Order by Pressing Y/N");
				char c =s.next().charAt(0);
			if(c=='y'||c=='Y'){
				System.out.println("Order Confirm");
				Registeration.TotalAmount=Registeration.TotalAmount+350;
				Registeration.list.add("Kaikash Dwara Book:Price 350Rs");
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
				historicalFiction();
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
				historicalFiction();			
			}
		}else if(c =='n'|| c =='N'){
			historicalFiction();
		}
	}
			case 3:{
				Registeration.addTocart.remove("Kaikash Dwara Book:Price 350Rs");
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
				historicalFiction();
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
			Registeration.addTocart.add("Shivaji:The Great Maratha Book:Price 300Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Shivaji:The Great Maratha Book is 300Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+300;
			Registeration.list.add("Shivaji:The Great Maratha Book:Price 300Rs");
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
			historicalFiction();
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
			historicalFiction();			
		}
	}else if(c =='n'|| c =='N'){
		historicalFiction();
	}
}
		case 3:{
			Registeration.addTocart.remove("Shivaji:The Great Maratha Book:Price 300Rs");
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
			historicalFiction();
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
			Registeration.addTocart.add("Why I Killed Gandhi? Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Why I Killed Gandhi? Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("Why I Killed Gandhi? Book:Price 400Rs");
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
			historicalFiction();
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
			historicalFiction();			
		}
	}else if(c =='n'|| c =='N'){
		historicalFiction();
	}
}
		case 3:{
			Registeration.addTocart.remove("Why I Killed Gandhi? Book:Price 400Rs");
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
			historicalFiction();
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
			Registeration.addTocart.add("The Forgotten History of India Book:Price 250Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Forgotten History of India Book is 250Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+250;
			Registeration.list.add("The Forgotten History of India Book:Price 250Rs");
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
			historicalFiction();
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
			historicalFiction();			
		}
	}else if(c =='n'|| c =='N'){
		historicalFiction();
	}
}
		case 3:{
			Registeration.addTocart.remove("The Forgotten History of India Book:Price 250Rs");
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
			historicalFiction();
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
			Registeration.addTocart.add("Eye of Shiva:Beyond the Quantum Universe Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Eye of Shiva:Beyond the Quantum Universe Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("Eye of Shiva:Beyond the Quantum Universe Book:Price 400Rs");
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
			historicalFiction();
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
			historicalFiction();			
		}
	}else if(c =='n'|| c =='N'){
		historicalFiction();
	}
}
		case 3:{
			Registeration.addTocart.remove("Eye of Shiva:Beyond the Quantum Universe Book:Price 400Rs");
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
			historicalFiction();
	}	
  }else if(Option==6){
		type();
		}
}
    public void horror(){
      System.out.println("==============================================");
      System.out.println("Choose your Book");
      System.out.println("==============================================");
  	  System.out.println("Type 1 for Ghosts of the Silent Hills Book Price 300Rs");
  	  System.out.println("Type 2 for The Devil in You Book Price 300Rs");
  	  System.out.println("Type 3 for The Canterville Ghost Book Price 400Rs");
  	  System.out.println("Type 4 for The Exorcist Book Price 250Rs");
  	  System.out.println("Type 5 for The Wind on the Haunted Hill Book Price 400Rs");
  	  System.out.println("Type 6 for Go Back");
  	  System.out.println("==============================================");
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
				Registeration.addTocart.add("Ghosts of the Silent Hills Book:Price 300Rs");
				System.out.println("Your Book Added to Cart successfully");
				System.out.println("=========================================");
			}
			case 2:{
				System.out.println("Price of Ghosts of the Silent Hills Book is 300Rs");
				System.out.println("Confirm your Order by Pressing Y/N");
				char c =s.next().charAt(0);
			if(c=='y'||c=='Y'){
				System.out.println("Order Confirm");
				Registeration.TotalAmount=Registeration.TotalAmount+300;
				Registeration.list.add("Ghosts of the Silent Hills Book:Price 300Rs");
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
				horror();
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
				horror();			
			}
		}else if(c =='n'|| c =='N'){
			horror();
		}
	}
			case 3:{
				Registeration.addTocart.remove("Ghosts of the Silent Hills Book:Price 300Rs");
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
				horror();
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
		Registeration.addTocart.add("The Devil in You Book:Price 300Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Devil in You Book is 300Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+300;
		Registeration.list.add("The Devil in You Book:Price 300Rs");
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
		horror();
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
		horror();			
	}
}else if(c =='n'|| c =='N'){
	horror();
}
}
	case 3:{
		Registeration.addTocart.remove("The Devil in You Book:Price 300Rs");
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
		horror();
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
		Registeration.addTocart.add("The Canterville Ghost Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Canterville Ghost Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("The Canterville Ghost Book:Price 400Rs");
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
		horror();
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
		horror();			
	}
}else if(c =='n'|| c =='N'){
	horror();
}
}
	case 3:{
		Registeration.addTocart.remove("The Canterville Ghost Book:Price 400Rs");
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
		horror();
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
		Registeration.addTocart.add("The Exorcist:Price 250Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of The Exorcist is 250Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+250;
		Registeration.list.add("The Exorcist:Price 250Rs");
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
		horror();
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
		horror();			
	}
}else if(c =='n'|| c =='N'){
	horror();
}
}
	case 3:{
		Registeration.addTocart.remove("The Exorcist:Price 250Rs");
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
		horror();
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
			Registeration.addTocart.add("The Wind on the Haunted Hill Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Wind on the Haunted Hill Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("The Wind on the Haunted Hill Book:Price 400Rs");
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
			horror();
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
			horror();			
		}
	}else if(c =='n'|| c =='N'){
		horror();
	}
}
		case 3:{
			Registeration.addTocart.remove("The Wind on the Haunted Hill Book:Price 400Rs");
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
			horror();
	}	
}else if(Option==6){
		type();
		}
 }
    public void romance(){
      System.out.println("========================================");
      System.out.println("Choose your Book");
      System.out.println("========================================");
  	  System.out.println("Type 1 for Pride and Prejudice Book Price 300Rs");
  	  System.out.println("Type 2 for This Spells Love Book Price 200Rs");
  	  System.out.println("Type 3 for Technically Yours Book Price 400Rs");
  	  System.out.println("Type 4 for The Second Chance Year Book Price 250Rs");
  	  System.out.println("Type 5 for Every Time You go Away  Book Price 400Rs");
  	  System.out.println("Type 6 for Go Back");
  	  System.out.println("========================================");
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
				Registeration.addTocart.add("Pride and Prejudice Book:Price 300Rs");
				System.out.println("Your Book Added to Cart successfully");
				System.out.println("=========================================");
			}
			case 2:{
				System.out.println("Price of Pride and Prejudice Book is 300Rs");
				System.out.println("Confirm your Order by Pressing Y/N");
				char c =s.next().charAt(0);
			if(c=='y'||c=='Y'){
				System.out.println("Order Confirm");
				Registeration.TotalAmount=Registeration.TotalAmount+300;
				Registeration.list.add("Pride and Prejudice Book:Price 300Rs");
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
				romance();
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
				romance();			
			}
		}else if(c =='n'|| c =='N'){
			romance();
		}
	}
			case 3:{
				Registeration.addTocart.remove("Pride and Prejudice Book:Price 300Rs");
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
				romance();
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
			Registeration.addTocart.add("This Spells Love Book:Price 200Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of This Spells Love Book is 200Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+200;
			Registeration.list.add("This Spells Love Book:Price 200Rs");
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
			romance();
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
			romance();			
		}
	}else if(c =='n'|| c =='N'){
		romance();
	}
}
		case 3:{
			Registeration.addTocart.remove("This Spells Love Book:Price 200Rs");
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
			romance();
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
		Registeration.addTocart.add("Technically Yours Book:Price 400Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Technically Yours Book is 400Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+400;
		Registeration.list.add("Technically Yours Book:Price 400Rs");
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
		romance();
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
		romance();			
	}
}else if(c =='n'|| c =='N'){
	romance();
}
}
	case 3:{
		Registeration.addTocart.remove("Technically Yours Book:Price 400Rs");
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
		romance();
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
			Registeration.addTocart.add("The Second Chance Year Book:Price 250Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of The Second Chance Year Book is 250Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+250;
			Registeration.list.add("The Second Chance Year Book:Price 250Rs");
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
			romance();
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
			romance();			
		}
	}else if(c =='n'|| c =='N'){
		romance();
	}
}
		case 3:{
			Registeration.addTocart.remove("The Second Chance Year Book:Price 250Rs");
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
			romance();
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
			Registeration.addTocart.add("Every Time You go Away Book:Price 400Rs");
			System.out.println("Your Book Added to Cart successfully");
			System.out.println("=========================================");
		}
		case 2:{
			System.out.println("Price of Every Time You go Away  Book is 400Rs");
			System.out.println("Confirm your Order by Pressing Y/N");
			char c =s.next().charAt(0);
		if(c=='y'||c=='Y'){
			System.out.println("Order Confirm");
			Registeration.TotalAmount=Registeration.TotalAmount+400;
			Registeration.list.add("Every Time You go Away Book:Price 400Rs");
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
			romance();
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
			romance();			
		}
	}else if(c =='n'|| c =='N'){
		romance();
	}
}
	case 3:{
			Registeration.addTocart.remove("Every Time You go Away Book:Price 400Rs");
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
			romance();
	}	
}else if(Option==6){
				
	type();
			}
     }
}

