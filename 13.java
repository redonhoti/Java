package projekt;
public class KompleksitetiiFunksioneve{
	public static void main() {
		int N=10;
		for(int i=0; i<N; i++) {
			funksioni1();
			for(int j=0; j<N; j++) {
				funksioni2();
				for(int k=0;k<N;k++) {
					funksioni3();
				}
			}
		}
	}
	public static void funksioni1() {
			System.out.print("Pershendetje!");
	}
	public static void funksioni2() {
		System.out.print("Mirembrema!");
	}
	public static void funksioni3() {
		int N=10;
		for(int i=0; i<N; i++) {
			for(int m=0; m<N; m++) {
				System.out.print("Unazat e nderthurura");
			}
		}
	}
}
