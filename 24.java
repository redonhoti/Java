package projekt2;

public class Faktoriel {

	public static void main(String[] args) {

int n=4;
long faktoriel=gjejFaktorielin(n);
System.out.println("Faktorieli i numrit "+n+" eshte "  + faktoriel);
	}
	public static long gjejFaktorielin(int n) {
		if(n >=1)
			return n*gjejFaktorielin(n-1);
		else
			return 1;
	}

}
