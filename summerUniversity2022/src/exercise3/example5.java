package exercise3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class example5 {
	public static void main(String[] args) {
		LinkedList<String> llistobj = new LinkedList<String>();
		ArrayList<String> arraylist= new ArrayList<String>();
		arraylist.add("Lanlan");
		arraylist.add("SEASON");
		
		for (Object temp: arraylist) {
			System.out.println(temp);
		}
		for (Object temp: llistobj) {
			System.out.println(temp);
		}
		}
		}


