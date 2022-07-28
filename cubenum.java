
//Display the cube of the number//

import java.util.Scanner;

class cubenum{
	
	public static void main(String args[]){
	
	System.out.println(" Enter the number " );
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int cube = n*n*n;
		System.out.println(" the cube of the number is " + cube);
		
	}
}