package p1;
	import java.util.*;
	 class Customer  {
		 int g;
	
	public void display(){
			
			System.out.println("customer enters the restaurant");
	}
	public void complete()
	{
	
	
			System.out.println("completion");
			System.out.println("Customer requests a bill from the manager");
		
		
	}
	public void bill(){
		System.out.println("feed Back form: 1.Excellent 2.Good 3.Average 4.Worst");
		Scanner scr=new Scanner(System.in);
		  g=scr.nextInt();
	
	
		switch(g)
		{
		case 1: System.out.println("Excellent");
		break;
		case 2:System.out.println("Good");
		break;
		case 3:System.out.println("Average");
		break;
		case 4: System.out.println("Worst");
		break;
		}
	
	}
	 }


