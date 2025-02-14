package projekt;
import java.util.Scanner;

public class drejtkendeshi{
	public static void main(String args[])
	{
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Jep gjeresine e brinjes a: ");
		int a=myObj.nextInt();
		
		System.out.println("Jep gjatesine e brinjes b: ");
		int b=myObj.nextInt();
		
		int S=a*b;
		
		System.out.println("Siperfaqja e drejtkendeshit eshte "+ S);
	}
