package p1;
import java.util.*;

 class Menu extends Tables{

	int i;
	int j;
	/**
	 * @param args
	 */public void menu(){
		Scanner scr=new Scanner(System.in);
		
		System.out.println("select the section (1 for starters/2 for desserts)");
		 i=scr.nextInt();
		
	if(i==1){
		System.out.println("starters 1.Chicken Lollypop 2. Chicken Roll");
		j=scr.nextInt();
		}
	if(i==2){
		System.out.println("desserts 1.Gulab Jamun 2. Kaju ki Barfi");
		j=scr.nextInt();
	}
			switch(i)
		{
			case 1:System.out.println("Starters" );
			
				switch(j)
				{
				
				case 1: System.out.println("order no(1).Chicken Lollypop ");
					System.out.println("Customer ordered" );
					System.out.println("manager places the customer order..");
				break;
				case 2:System.out.println("order no(2).Chicken Roll");
				System.out.println("Customer ordered" );
				System.out.println("manager places the customer order..");
				break;
				}
			break;
			case 2:System.out.println("desserts" );
			
				switch(j)
				{
				
				case 1: System.out.println("order no(1).Gulab Jamun ");
				System.out.println("Customer ordered" );
				System.out.println("manager places the customer order..");
				break;
				case 2:System.out.println("order no(2).Kaju ki Barfi");
				System.out.println("Customer ordered" );
				System.out.println("manager places the customer order..");
				break;
				}
			break;
			default:System.out.println("not available");
		}
	}
}
