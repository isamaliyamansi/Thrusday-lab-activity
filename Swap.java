

import java.util.*;

public class Swap {  
	int a, b;  
	public void swapNum(SwapNumberDemo stn) {  
		int temp;  
		temp = stn.a;  
		stn.a = stn.b;  
		stn.b = temp;  
	}  
	public static void main(String args[]) {  
		Swap sn = new Swap();  
		Scanner sc = new Scanner(System.in);               
		System.out.print("Enter the first number: ");  
		sn.a = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		sn.b = sc.nextInt();  
		sn.swapNum(sn);  
		System.out.println("After swapping: a= " + sn.a + ", b= " + sn.b);  
	}  
}  