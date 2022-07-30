package exercise4;

import java.util.ArrayList;

public class Exercise11three {
	public static void main(String args[]) {
		ArrayList<String> customersNames= new ArrayList<String>();
		customersNames.add("Donald");
		customersNames.add("Amit");
		customersNames.add("Stefan");	
		customersNames.add("Sahara");
		customersNames.add("Monique");
		
		for(String c :customersNames)
		{
			System.out.println(c);
		}
}
}