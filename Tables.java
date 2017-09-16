package p1;
import java.util.*;
 class Tables extends Customer {
	 int a;
	public void table(){
	Scanner scr=new Scanner(System.in);
	System.out.println("enter table number");
	 a=scr.nextInt();

	switch(a)
	{
		case 1:System.out.println("Host allots the table " +a+"  to the customer" );
		break;
		case 2:System.out.println("Host allots the table " +a+ " to the customer" );
		break;
		case 3:System.out.println("Host allots the table " +a+"  to the customer" );
		break;
		case 4:System.out.println("Host allots the table " +a+" to the customer" );
		break;
		case 5:System.out.println("Host allots the table " +a+"  to the customer" );
		break;
		case 6:System.out.println("Host allots the table " +a+ " to the customer" );
		break;
		default:System.out.println("no table available");
	}
}

}
