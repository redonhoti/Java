package projekt;


import java.util.Scanner;

public class comparison {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Jep numrin X: ");
		int X=myObj.nextInt();
		
		System.out.println("Jep numrin Y: ");
		int Y=myObj.nextInt();
		
		if(Y>X) {
			System.out.println("Vlera me e madhe eshte " + Y);
		}else {
			System.out.println("Vlera me e madhe eshte " + X);
		}
		
	}

}
