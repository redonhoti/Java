package projekt2;

public class RekursioniInfinit {

	public static void main(String[] args) {
       shtoNje(1);

	}
public static void shtoNje(int numri) {
	System.out.println(numri);
	numri +=1;
	shtoNje(numri);
}
}
