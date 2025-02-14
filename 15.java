package projekt;

public class shembull2 {
	public static int function1(int input) {
		int N=input;
		for(int i=1; i<N; i++) {
				System.out.println(i);
		}
		int count=0;
		while (N!=1) {
			N=N/2;
			count++;
		}
		return count;
	}
}
