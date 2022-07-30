package EXERCISE1;

import java.util.Scanner;

public class olean {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		  System.out.println("please enter the number:");
		  double a= scanner.nextDouble();
		if(a%3==0) {
		
			 System.out.println("a can be divided by 3");
		}
		else 
			System.out.println("a can not be divided by 3");
	}
}
