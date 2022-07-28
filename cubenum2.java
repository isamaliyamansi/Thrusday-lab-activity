
//Display the cube of the number//

import java.util.Scanner;

class cubenum2{
	
	public static void main(String args[]){
	
	System.out.println(" Enter the number " );
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for( int i=1;i<=n;i++){
			

		System.out.println(" the num is a  " + i + " the cube of the number is " + (i*i*i));
		}
		
	}
}