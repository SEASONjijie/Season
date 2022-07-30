package exercise4;

import java.util.ArrayList;

public class Exercise11two {
	public static void main(String args[]) {
		ArrayList<String> customersNames= new ArrayList<String>();
		customersNames.add("Donald");
		customersNames.add("Amit");
		customersNames.add("Stefan");	
		customersNames.add("Sahara");
		customersNames.add("Monique");
		
		for(int index=0;index<customersNames.size();index++)
		{
			System.out.println(customersNames.get(index));
		}
}
}
