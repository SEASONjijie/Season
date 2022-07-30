package exercise4;

import java.util.ArrayList;

public class Exercise11 {
	public static void main(String args[]) {
		ArrayList<String> customersNames= new ArrayList<String>();
		customersNames.add("Donald");
		customersNames.add("Amit");
		customersNames.add("Stefan");	
		customersNames.add("Sahara");
		customersNames.add("Monique");
		
		for (Object temp: customersNames) {
			System.out.println(temp);
	}
}
}
