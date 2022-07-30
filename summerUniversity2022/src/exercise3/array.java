package exercise3;

import java.util.Scanner;

public class array {
	public static void main(String[] args){
		 Scanner scanner = new Scanner(System.in);
			System.out.println("number >0:");
		 int partLength=scanner.nextInt();
	     double[] array= { 3.5, 7.9, 0.0, -7.9, 10.99, 78.9, 66.8,
			19.01, 18.9 , 99.7 };
			int lengthOfArray= array.length;
			double[] partOne = new double[lengthOfArray-partLength];
			double[] partTwo = new double[partLength];
			for (int i = 0; i < partLength; i++)
				partOne[i] = array[i];
			for (int i = 0; i < lengthOfArray-partLength; i++)
				partTwo[i] = array[i+partLength];
			for (int i = 0; i <lengthOfArray; i++)
				System.out.print(array[i] + " ");
		
			}

}
