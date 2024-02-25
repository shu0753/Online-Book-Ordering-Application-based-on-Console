package Library;
import java.util.Scanner;
public class Interest extends Registeration  {
	public void interest() {
		System.out.println("=================================================");
		System.out.println("<<<<<<<<Select your Interest>>>>>>>>");
		System.out.println("=================================================");
		System.out.println("Type 1 for Story Book");	
		System.out.println("Type 2 for Thought Book");	
		System.out.println("Type 3 for Computer Science Book");	
		System.out.println("Type 4 for Astronomy Book");	
		System.out.println("Type 5 for Astrology Book");			
		System.out.println("Type 6 for Comics Book");	
		System.out.println("Type 7 for Exit");
		System.out.println("=================================================");
		Scanner s= new Scanner(System.in);
	      int Select=s.nextInt();
	      switch(Select){
	      case 1:{  
	    	  StoryBook a=new StoryBook();
	    	  a.type();
	    	  break;
	      }
	      case 2:{
	    	  ThoughtBook b=new ThoughtBook();
	    	  b.type();
	    	  break;
	      }
	      case 3:{
	    	  ComputerScienceBook c=new ComputerScienceBook();
	    	  c.type();
	    	  break;
	      }
          case 4:{
        	  AstronomyBook d=new AstronomyBook();
        	  d.type();
	    	  break;
	      }
	      case 5:{
	    	  AstrologyBook e=new AstrologyBook();
	    	  e.type();
	    	  break;
	      }
	      case 6:{
	    	  ComicsBook j=new ComicsBook();
	    	  j.type();
	    	  break;
	      }
	      case 7:{
	    	  System.out.println("Vist Again");
	    	  System.exit(0);
	      }
	      default:
	    	  System.out.println("Enter Valid Input");
	    	  interest();
	}
}
}
