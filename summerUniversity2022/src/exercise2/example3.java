package exercise2;

import java.util.Scanner;

public class example3 {
	public static void main(String[] args) {
		
			 Scanner scanner = new Scanner(System.in);
			  System.out.println("enter integer number(less than10000):");
			   int x=scanner.nextInt();	
			  
              if(x<=10000) {			 
			
			  System.out.println("the square of x: "+Math.pow(x,2));
			  System.exit(0);
              }
			  else {
			 System.out.println("larger than 10000");
			 System.exit(1);
		}
	}
}
