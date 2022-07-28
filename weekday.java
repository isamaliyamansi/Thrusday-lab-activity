
//display the name of the weekday//

import java.util.Scanner;

class weekday{
	
	public static void main(String args[]){
		
		System.out.println(" Enter the no from 1 to 7  " );
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
	switch(n){
		
		case 1:
		System.out.println("Monday");
		break;
		
		case 2:
		System.out.println("thuesday");
		break;
		
		case 3:
		System.out.println("wednesday");
		break;
		
		case 4:
		System.out.println("thrusday");
		break;
		
		case 5:
		System.out.println("friday");
		break;
		
		case 6:
		System.out.println("saturday");
		break;
		
		case 7:
		System.out.println("sunday");
		break;
	}
	}
}