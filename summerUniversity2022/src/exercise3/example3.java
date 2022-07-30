package exercise3;

public class example3 {
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		int i = 0; // loop control counter
		int v = 1; // current power of two
		// while loop
		while (i <N) {
		
		i = i + 1;
		v = v * 2;
        }
		System.out.println(v);
}
}