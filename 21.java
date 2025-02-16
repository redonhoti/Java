package projekt2;

public class metodat{
	public static void main(String[] args) {
		Nyja nyja1=new Nyja(1);
		Nyja nyja2=new Nyja(2);
		
		System.out.println(nyja1.lexoTeDhenen());
		System.out.println(nyja1.lexoNyjenERadhes());
		
		nyja1.vendosTeDhenen(10);
		System.out.println(nyja1.lexoTeDhenen());
		System.out.println(nyja1.lexoNyjenERadhes());
		
		nyja1.krijoLidhjen(nyja2);
		System.out.println(nyja1.lexoTeDhenen());
		System.out.println(nyja1.lexoNyjenERadhes());
		System.out.println(nyja1.lexoNyjenERadhes().lexoTeDhenen());

		System.out.println(nyja1.lexoNyjenERadhes().lexoNyjenERadhes());
	}

}
