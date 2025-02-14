package projekt2;

import java.util.ArrayList;

public class Vargjet {

	public static void main(String[] args) {
		ArrayList<Integer> vargu=new ArrayList<Integer>();
		vargu.add(5);
		vargu.add(10);
		vargu.add(12);
		vargu.add(-2);
		
		vargu.get(0);
		vargu.set(0, 8);
		vargu.remove(1);
		
		System.out.println(vargu);
		}
		
	}
