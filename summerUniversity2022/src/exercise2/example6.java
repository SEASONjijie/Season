package exercise2;

import java.util.Scanner;

public class example6 {
	public static void main(String[] args) {
		
		 
		 Scanner scanner = new Scanner(System.in);
		
		  double r=Math.random();
	        int u=(int)(100*r);
	        while(true) {
	        	System.out.println("please enter an integer number between 0 and 100:");
            
		        int numberWeGuess= scanner.nextInt();
	        	if(u==numberWeGuess) {
	        		System.out.println("you won the lottery,the number is:"+u);
	        		break;}
	        	System.out.println("try again"+u);
	        		
	        	
	        
	                
	        	
	        }
	       
	        
		  
	}
}
