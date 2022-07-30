package exercise2;

import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		  System.out.println("enter integer number between 0 and 6:");
		  int week= scanner.nextInt();
		
		switch(week) {
		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Tuesday");
			break;
		
		case 2:
			System.out.println("Wednesday");
			break;
		
		case 3:
			System.out.println("Thursday");
			break;
		
		case 4:
			System.out.println("Friday");
			break;
		
		case 5:
			System.out.println("Saturday");
			break;
		
		case 6:
			System.out.println("Sunday6");
			break;
		
		
		}
	}
}
