package EXERCISE1;

import java.util.Scanner;

public class example1 {
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		  System.out.println("please enter the coefficient:");
		  System.out.print("a: ");
          double a= scanner.nextDouble();
          System.out.print("b: ");
          double b= scanner.nextDouble();
          System.out.print("c: ");
          double c= scanner.nextDouble();
          
          double delta = calculateDelta(a,b,c);
        

	      
	          
	            if (delta>= 0) {
	            	double root1= PossitiveCalculateRoots(a,b,c,delta);
	            	double root2=NegativeCalculateRoots(a,b,c,delta);
	            	
	            	 System.out.println("Roots: " + root1+"and"+root2);
	            }
	            	 else 
	            		 System.out.println("No roots");
	        }
	 
	 
	 public static double calculateDelta(double a,double b,double c) {
		double delta=b*b-4*a*c ;
		return delta;
	 }
	 public static double PossitiveCalculateRoots(double a,double b,double c,double delta) {
			double root1=(-b+Math.sqrt(delta))/2/a ;
			
			return root1;
			
			
	 }
	 public static double NegativeCalculateRoots(double a,double b,double c,double delta) {
			double root2=(-b-Math.sqrt(delta))/2/a ;
			
			return root2;
}
}

