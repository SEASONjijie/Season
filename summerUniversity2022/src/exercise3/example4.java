package exercise3;

import java.util.Scanner;

public class example4 {
	public static void main(String[] args){
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Find the square root of which number:  ");
		 double numberInSquareRoot = scanner.nextDouble();
		 System.out.println("Assume a result:  ");
		 double resultWeGuess = scanner.nextDouble();
		 
		 double result=newtonRaphsonMethod(resultWeGuess,numberInSquareRoot);
		 System.out.println("");
	        System.out.println("--------");
	        System.out.println(result);
	}
	
	
	
	 private static double newtonRaphsonMethod(double resultWeGuess,double numberInSquareRoot) {
		 double squareRootResult=0;
		 int numberOfIterations=0; 
		 
		 while(true) {
			squareRootResult=(resultWeGuess+numberInSquareRoot/resultWeGuess)/2;
		    resultWeGuess=squareRootResult;
		    numberOfIterations=numberOfIterations+1;
		    System.out.println(squareRootResult+"     iterations: "+numberOfIterations);
		    if((int)(1000*resultWeGuess)==(int)(1000*numberInSquareRoot/resultWeGuess))
			 break;
		 
		 }
		 return squareRootResult;
		}
	 }
