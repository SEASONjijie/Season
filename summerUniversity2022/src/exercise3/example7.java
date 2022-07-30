package exercise3;

public class example7 {
	public static void main(String[] args){
		int N= Integer.parseInt(args[0]);
		for(int i=0;i<=N;i++) {
			
			boolean flag=true;
			
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					flag=false;
				}
			}
					
				if(flag)
					System.out.println(i);
			}
		}
	}

