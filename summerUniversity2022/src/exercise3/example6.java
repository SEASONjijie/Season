package exercise3;

public class example6 {
	public static void main(String[] args){
		int specialNumber=1;
		int lastNumber=1;
		int room=0;
		int x = Integer.parseInt(args[0]);
		System.out.println(specialNumber+"\n"+lastNumber);
		for(int i=0;i<=x; i++) {
			room=specialNumber;
			specialNumber=lastNumber+specialNumber;
			 System.out.println(specialNumber);
			lastNumber=room;
		}
		
	}
}
