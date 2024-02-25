package Library;
import java.util.Scanner;
public class ComicsBook extends Interest implements Books4{
	public void type(){
		   System.out.println("======================================");
		   System.out.println("<<<<<<<<Choose Your BookType>>>>>>>>");
		   System.out.println("======================================");
		   System.out.println("Type 1 for Superhero Comics Book");
		   System.out.println("Type 2 for Children Comics Book");
		   System.out.println("Type 3 for Silent Comics Book");
		   System.out.println("Type 4 for Western Comics Book");
		   System.out.println("Type 5 for Go Back");
		   System.out.println("======================================");
		   Scanner s= new Scanner(System.in);
		   int Story=s.nextInt();
		   switch (Story){
		   case 1:{
			   superheroComics();
			   break;   
		   }
		   case 2:{
			   childrenComics();
			  break;   
		   }
		   case 3:{
			   silentComics();
			  break;   
		   }
		   case 4:{
			   westernComics();
			  break;   
		   }
		   case 5:{
			   interest();
			  break;   
		   }
		}
	}
				public void superheroComics(){
					System.out.println("=================================================");
					  System.out.println("Choose your Book");
					  System.out.println("=================================================");
					  System.out.println("Type 1 for Deadpool Kills the Marvel Universe Book Price 500Rs");
					  System.out.println("Type 2 for Secret Wars Book Price 400Rs");
					  System.out.println("Type 3 for Atharva - The Origin (A New Age Graphic Novel) featuring MS Dhoni Book Price 200Rs");
					  System.out.println("Type 4 for Batman: The Killing Joke Deluxe (New Edition) Book Price 350Rs");
					  System.out.println("Type 5 for Naruto: Official Character: The Official Character Data Book Price 700Rs");
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
								Registeration.addTocart.add("Deadpool Kills the Marvel Universe Book:Price 500Rs");
								System.out.println("Your Book Added to Cart successfully");
								System.out.println("=========================================");
								break;
							}
							case 2:{
								System.out.println("Price of Deadpool Kills the Marvel Universe Book is 500Rs");
								System.out.println("Confirm your Order by Pressing Y/N");
								char c =s.next().charAt(0);
							if(c=='y'||c=='Y'){
								System.out.println("Order Confirm");
								Registeration.TotalAmount=Registeration.TotalAmount+500;
								Registeration.list.add("Deadpool Kills the Marvel Universe Book:Price 500Rs");
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
								superheroComics();
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
								superheroComics();			
							}
						}else if(c =='n'|| c =='N'){
							superheroComics();
						}
						break;
						
					}
							case 3:{
								Registeration.addTocart.remove("Deadpool Kills the Marvel Universe Book:Price 500Rs");
								System.out.println("Your Book Remove from Cart successfully");
								System.out.println("=======================================");
								break;
							}
							case 4:{
								Registeration r=new Registeration();
								r.viewCart();
								break;
						}
							case 5:{
								type();
								break;
							}
							default:
								System.out.println("Invalid Input");
								superheroComics();
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
						Registeration.addTocart.add("Secret Wars Book:Price 400Rs");
						System.out.println("Your Book Added to Cart successfully");
						System.out.println("=========================================");
						break;
					}
					case 2:{
						System.out.println("Price of Secret Wars Book is 400Rs");
						System.out.println("Confirm your Order by Pressing Y/N");
						char c =s.next().charAt(0);
					if(c=='y'||c=='Y'){
						System.out.println("Order Confirm");
						Registeration.TotalAmount=Registeration.TotalAmount+400;
						Registeration.list.add("Secret Wars Book:Price 400Rs");
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
						superheroComics();
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
						superheroComics();			
					}
				}else if(c =='n'|| c =='N'){
					superheroComics();
				}
					break;
			}
					case 3:{
						Registeration.addTocart.remove("Price of Secret Wars Book Price 400Rs");
						System.out.println("Your Book Remove from Cart successfully");
						System.out.println("=======================================");
						break;
					}
					case 4:{
						Registeration r=new Registeration();
						r.viewCart();
						break;
				}
					case 5:{
						type();
						break;
					}
					default:
						System.out.println("Invalid Input");
						superheroComics();
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
				Registeration.addTocart.add("Atharva - The Origin (A New Age Graphic Novel) featuring MS Dhoni Book:Price 200Rs");
				System.out.println("Your Book Added to Cart successfully");
				System.out.println("=========================================");
				break;
			}
			case 2:{
				System.out.println("Price of Atharva - The Origin (A New Age Graphic Novel) featuring MS Dhoni Book is 200Rs");
				System.out.println("Confirm your Order by Pressing Y/N");
				char c =s.next().charAt(0);
			if(c=='y'||c=='Y'){
				System.out.println("Order Confirm");
				Registeration.TotalAmount=Registeration.TotalAmount+300;
				Registeration.list.add("Atharva - The Origin (A New Age Graphic Novel) featuring MS Dhoni Book:Price 200Rs");
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
				superheroComics();
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
				superheroComics();			
			}
		}else if(c =='n'|| c =='N'){
			superheroComics();
		}
	}
			case 3:{
				Registeration.addTocart.remove("Atharva - The Origin (A New Age Graphic Novel) featuring MS Dhoni Book:Price 200Rs");
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
				superheroComics();
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
		Registeration.addTocart.add("Batman: The Killing Joke Deluxe (New Edition) Book:Price 350Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Batman: The Killing Joke Deluxe (New Edition) Book is 350Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+350;
		Registeration.list.add("Batman: The Killing Joke Deluxe (New Edition) Book:Price 350Rs");
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
		superheroComics();
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
		superheroComics();			
	}
}else if(c =='n'|| c =='N'){
	superheroComics();
}
}
	case 3:{
		Registeration.addTocart.remove("Batman: The Killing Joke Deluxe (New Edition) Book:Price 350Rs");
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
		superheroComics();
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
		Registeration.addTocart.add("Naruto: Official Character: The Official Character Data Book:Price 700Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Naruto: Official Character: The Official Character Data Book is 700Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+700;
		Registeration.list.add("Price of Naruto: Official Character: The Official Character Data Book Price 700Rs");
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
		superheroComics();
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
		superheroComics();			
	}
}else if(c =='n'|| c =='N'){
	superheroComics();
}
}
	case 3:{
		Registeration.addTocart.remove("Price of Naruto: Official Character: The Official Character Data Book Price 700Rs");
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
		superheroComics();
   }
  }
}      
				public void childrenComics(){
					System.out.println("=================================================");
					  System.out.println("Choose your Book");
					  System.out.println("=================================================");
					  System.out.println("Type 1 for Geronimo Stilton -Spacemice Slip-Case Set Book Price 440Rs");
					  System.out.println("Type 2 for Teen Titans GO! Vol. 1: Party, Party! Book Price 350Rs");
					  System.out.println("Type 3 for Tom and Jerry Comics (Blue) Book Price 500Rs");
					  System.out.println("Type 4 for Valmiki's Ramayana 6 volume set ( English) Book Price 900Rs");
					  System.out.println("Type 5 for Paw Patrol 5-Minute Stories Collection (Paw Patrol) Book Price 300Rs");
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
								Registeration.addTocart.add("Geronimo Stilton -Spacemice Slip-Case Set Book:Price 440Rs");
								System.out.println("Your Book Added to Cart successfully");
								System.out.println("=========================================");
							}
							case 2:{
								System.out.println("Price of Geronimo Stilton -Spacemice Slip-Case Set Book is 440Rs");
								System.out.println("Confirm your Order by Pressing Y/N");
								char c =s.next().charAt(0);
							if(c=='y'||c=='Y'){
								System.out.println("Order Confirm");
								Registeration.TotalAmount=Registeration.TotalAmount+440;
								Registeration.list.add("Geronimo Stilton -Spacemice Slip-Case Set Book:Price 440Rs");
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
								childrenComics();
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
								childrenComics();			
							}
						}else if(c =='n'|| c =='N'){
							childrenComics();
						}
					}
							case 3:{
								Registeration.addTocart.remove("Geronimo Stilton -Spacemice Slip-Case Set Book:Price 440Rs");
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
								childrenComics();
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
								Registeration.addTocart.add("Teen Titans GO! Vol. 1: Party, Party! Book:Price 350Rs");
								System.out.println("Your Book Added to Cart successfully");
								System.out.println("=========================================");
							}
							case 2:{
								System.out.println("Price of Teen Titans GO! Vol. 1: Party, Party! Book is 350Rs");
								System.out.println("Confirm your Order by Pressing Y/N");
								char c =s.next().charAt(0);
							if(c=='y'||c=='Y'){
								System.out.println("Order Confirm");
								Registeration.TotalAmount=Registeration.TotalAmount+350;
								Registeration.list.add("Teen Titans GO! Vol. 1: Party, Party! Book:Price 350Rs");
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
								childrenComics();
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
								childrenComics();			
							}
						}else if(c =='n'|| c =='N'){
							childrenComics();
						}
					}
							case 3:{
								Registeration.addTocart.remove("Teen Titans GO! Vol. 1: Party, Party! Book:Price 350Rs");
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
								childrenComics();
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
								Registeration.addTocart.add("Tom and Jerry Comics (Blue) Book:Price 500Rs");
								System.out.println("Your Book Added to Cart successfully");
								System.out.println("=========================================");
							}
							case 2:{
								System.out.println("Price of Tom and Jerry Comics (Blue) Book is 500Rs");
								System.out.println("Confirm your Order by Pressing Y/N");
								char c =s.next().charAt(0);
							if(c=='y'||c=='Y'){
								System.out.println("Order Confirm");
								Registeration.TotalAmount=Registeration.TotalAmount+500;
								Registeration.list.add("Tom and Jerry Comics (Blue) Book:Price 500Rs");
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
								childrenComics();
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
								childrenComics();			
							}
						}else if(c =='n'|| c =='N'){
							childrenComics();
						}
					}
							case 3:{
								Registeration.addTocart.remove("Tom and Jerry Comics (Blue) Book:Price 500Rs");
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
								childrenComics();
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
								Registeration.addTocart.add("Valmiki's Ramayana 6 volume set ( English) Book:Price 900Rs");
								System.out.println("Your Book Added to Cart successfully");
								System.out.println("=========================================");
							}
							case 2:{
								System.out.println("Price of Valmiki's Ramayana 6 volume set ( English) Book is 900Rs");
								System.out.println("Confirm your Order by Pressing Y/N");
								char c =s.next().charAt(0);
							if(c=='y'||c=='Y'){
								System.out.println("Order Confirm");
								Registeration.TotalAmount=Registeration.TotalAmount+300;
								Registeration.list.add("Valmiki's Ramayana 6 volume set ( English) Book:Price 900Rs");
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
								childrenComics();
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
								childrenComics();			
							}
						}else if(c =='n'|| c =='N'){
							childrenComics();
						}
					}
							case 3:{
								Registeration.addTocart.remove("Valmiki's Ramayana 6 volume set ( English) Book:Price 900Rs");
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
								childrenComics();
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
								Registeration.addTocart.add("Paw Patrol 5-Minute Stories Collection (Paw Patrol) Book:Price 300Rs");
								System.out.println("Your Book Added to Cart successfully");
								System.out.println("=========================================");
							}
							case 2:{
								System.out.println("Price of Paw Patrol 5-Minute Stories Collection (Paw Patrol) Book is 300Rs");
								System.out.println("Confirm your Order by Pressing Y/N");
								char c =s.next().charAt(0);
							if(c=='y'||c=='Y'){
								System.out.println("Order Confirm");
								Registeration.TotalAmount=Registeration.TotalAmount+300;
								Registeration.list.add("Paw Patrol 5-Minute Stories Collection (Paw Patrol) Book:Price 300Rs");
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
								childrenComics();
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
								childrenComics();			
							}
						}else if(c =='n'|| c =='N'){
							childrenComics();
						}
					}
							case 3:{
								Registeration.addTocart.remove("Paw Patrol 5-Minute Stories Collection (Paw Patrol) Book:Price 300Rs");
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
								childrenComics();
						}
				}
		} 
				public void silentComics(){
					System.out.println("=================================================");
					  System.out.println("Choose your Book");
					  System.out.println("=================================================");
					  System.out.println("Type 1 for A Silent Voice Manga by Yoshitoki Oima Book Price 300Rs");
					  System.out.println("Type 2 for Quiet Girl in a Noisy World: An Introvert's Story Book Price 350Rs");
					  System.out.println("Type 3 for All I Ever Want Is You : A True Love Story Adapted Into Fiction Book Price 200Rs");
					  System.out.println("Type 4 for Milk & Mocha Comics Collection Book Price 500Rs");
					  System.out.println("Type 5 for Champak  Magazine Book Price 430Rs");
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
								Registeration.addTocart.add("A Silent Voice Manga by Yoshitoki Oima Book:Price 300Rs");
								System.out.println("Your Book Added to Cart successfully");
								System.out.println("=========================================");
							}
							case 2:{
								System.out.println("Price of A Silent Voice Manga by Yoshitoki Oima Book is 300Rs");
								System.out.println("Confirm your Order by Pressing Y/N");
								char c =s.next().charAt(0);
							if(c=='y'||c=='Y'){
								System.out.println("Order Confirm");
								Registeration.TotalAmount=Registeration.TotalAmount+300;
								Registeration.list.add("A Silent Voice Manga by Yoshitoki Oima Book:Price 300Rs");
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
								silentComics();
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
								silentComics();			
							}
						}else if(c =='n'|| c =='N'){
							silentComics();
						}
					}
							case 3:{
								Registeration.addTocart.remove("A Silent Voice Manga by Yoshitoki Oima Book:Price 300Rs");
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
								silentComics();
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
						Registeration.addTocart.add("Quiet Girl in a Noisy World: An Introvert's Story Book:Price 350Rs");
						System.out.println("Your Book Added to Cart successfully");
						System.out.println("=========================================");
					}
					case 2:{
						System.out.println("Price of Quiet Girl in a Noisy World: An Introvert's Story Book is 350Rs");
						System.out.println("Confirm your Order by Pressing Y/N");
						char c =s.next().charAt(0);
					if(c=='y'||c=='Y'){
						System.out.println("Order Confirm");
						Registeration.TotalAmount=Registeration.TotalAmount+350;
						Registeration.list.add("Quiet Girl in a Noisy World: An Introvert's Story Book:Price 350Rs");
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
						silentComics();
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
						silentComics();			
					}
				}else if(c =='n'|| c =='N'){
					silentComics();
				}
			}
					case 3:{
						Registeration.addTocart.remove("Quiet Girl in a Noisy World: An Introvert's Story Book:Price 350Rs");
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
						silentComics();
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
				Registeration.addTocart.add("All I Ever Want Is You : A True Love Story Adapted Into Fiction Book:Price 200Rs");
				System.out.println("Your Book Added to Cart successfully");
				System.out.println("=========================================");
			}
			case 2:{
				System.out.println("Price of All I Ever Want Is You : A True Love Story Adapted Into Fiction Book is 200Rs");
				System.out.println("Confirm your Order by Pressing Y/N");
				char c =s.next().charAt(0);
			if(c=='y'||c=='Y'){
				System.out.println("Order Confirm");
				Registeration.TotalAmount=Registeration.TotalAmount+200;
				Registeration.list.add("All I Ever Want Is You : A True Love Story Adapted Into Fiction Book:Price 200Rs");
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
				silentComics();
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
				silentComics();			
			}
		}else if(c =='n'|| c =='N'){
			silentComics();
		}
	}
			case 3:{
				Registeration.addTocart.remove("All I Ever Want Is You : A True Love Story Adapted Into Fiction Book:Price 200Rs");
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
				silentComics();
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
		Registeration.addTocart.add("Milk & Mocha Comics Collection Book:Price 500Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Milk & Mocha Comics Collection Book is 500Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+500;
		Registeration.list.add("Milk & Mocha Comics Collection Book:Price 500Rs");
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
		silentComics();
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
		silentComics();			
	}
}else if(c =='n'|| c =='N'){
	silentComics();
}
}
	case 3:{
		Registeration.addTocart.remove("Milk & Mocha Comics Collection Book:Price 500Rs");
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
		silentComics();
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
		Registeration.addTocart.add("Champak Magazine Book:Price 430Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Champak Magazine Book is 430Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+430;
		Registeration.list.add("Champak Magazine Book:Price 430Rs");
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
		silentComics();
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
		silentComics();			
	}
}else if(c =='n'|| c =='N'){
	silentComics();
}
}
	case 3:{
		Registeration.addTocart.remove("Champak Magazine Book:Price 430Rs");
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
		silentComics();
    }
  }
}
				public void westernComics(){
					System.out.println("=================================================");
					  System.out.println("Choose your Book");
					  System.out.println("=================================================");
					  System.out.println("Type 1 for All Quiet on the Western Front Book Price 450Rs");
					  System.out.println("Type 2 for Tongue In Cheek : The Funny Side Of Life Book Price 330Rs");
					  System.out.println("Type 3 for All-Star Western(1951-1961) Book Price 250Rs");
					  System.out.println("Type 4 for Two-Gun Kid Book Price 700Rs");
					  System.out.println("Type 5 for Spy X Family Vol 1 By Tatsuya Endo Book Price 250Rs");
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
								Registeration.addTocart.add("All Quiet on the Western Front Book:Price 450Rs");
								System.out.println("Your Book Added to Cart successfully");
								System.out.println("=========================================");
							}
							case 2:{
								System.out.println("Price of All Quiet on the Western Front Book is 450Rs");
								System.out.println("Confirm your Order by Pressing Y/N");
								char c =s.next().charAt(0);
							if(c=='y'||c=='Y'){
								System.out.println("Order Confirm");
								Registeration.TotalAmount=Registeration.TotalAmount+450;
								Registeration.list.add("All Quiet on the Western Front Book:Price 450Rs");
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
								westernComics();
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
								westernComics();			
							}
						}else if(c =='n'|| c =='N'){
							westernComics();
						}
					}
							case 3:{
								Registeration.addTocart.remove("All Quiet on the Western Front Book:Price 450Rs");
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
								westernComics();
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
					Registeration.addTocart.add("Tongue In Cheek : The Funny Side Of Life Book:Price 330Rs");
					System.out.println("Your Book Added to Cart successfully");
					System.out.println("=========================================");
				}
				case 2:{
					System.out.println("Price of Tongue In Cheek : The Funny Side Of Life Book is 330Rs");
					System.out.println("Confirm your Order by Pressing Y/N");
					char c =s.next().charAt(0);
				if(c=='y'||c=='Y'){
					System.out.println("Order Confirm");
					Registeration.TotalAmount=Registeration.TotalAmount+330;
					Registeration.list.add("Tongue In Cheek : The Funny Side Of Life Book:Price 330Rs");
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
					westernComics();
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
					westernComics();			
				}
			}else if(c =='n'|| c =='N'){
				westernComics();
			}
		}
				case 3:{
					Registeration.addTocart.remove("Tongue In Cheek : The Funny Side Of Life Book:Price 330Rs");
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
					westernComics();
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
		Registeration.addTocart.add("All-Star Western(1951-1961)Book:Price 250Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of All-Star Western(1951-1961) Book is 250Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+250;
		Registeration.list.add("All-Star Western(1951-1961)Book:Price 250Rs");
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
		westernComics();
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
		westernComics();			
	}
}else if(c =='n'|| c =='N'){
	westernComics();
}
}
	case 3:{
		Registeration.addTocart.remove("All-Star Western(1951-1961)Book:Price 250Rs");
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
		westernComics();
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
		Registeration.addTocart.add("Two-Gun Kid Book:Price 700Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Two-Gun Kid Book is 700Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+700;
		Registeration.list.add("Two-Gun Kid Book:Price 700Rs");
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
		westernComics();
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
		westernComics();			
	}
}else if(c =='n'|| c =='N'){
	westernComics();
}
}
	case 3:{
		Registeration.addTocart.remove("Two-Gun Kid Book:Price 700Rs");
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
		westernComics();
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
		Registeration.addTocart.add("Spy X Family Vol 1 By Tatsuya Endo Book:Price 250Rs");
		System.out.println("Your Book Added to Cart successfully");
		System.out.println("=========================================");
	}
	case 2:{
		System.out.println("Price of Spy X Family Vol 1 By Tatsuya Endo Book is 250Rs");
		System.out.println("Confirm your Order by Pressing Y/N");
		char c =s.next().charAt(0);
	if(c=='y'||c=='Y'){
		System.out.println("Order Confirm");
		Registeration.TotalAmount=Registeration.TotalAmount+250;
		Registeration.list.add("Spy X Family Vol 1 By Tatsuya Endo Book:Price 250Rs");
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
		westernComics();
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
		westernComics();			
	}
}else if(c =='n'|| c =='N'){
	westernComics();
}
}
	case 3:{
		Registeration.addTocart.remove("Spy X Family Vol 1 By Tatsuya Endo Book:Price 250Rs");
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
		westernComics();
   }
  }
 }
}