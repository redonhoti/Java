package projekt2;

class LinkedList{
	Nyja nyjaPrijese;
	
	LinkedList(){
		this.nyjaPrijese=null;
	}
	void shtoNyjenPrijese(int data) {
		Nyja nyjaERe=new Nyja(data);
		Nyja nyjaETanishme=this.nyjaPrijese;
		this.nyjaPrijese=nyjaERe;
		
		if(nyjaETanishme != null) {
			this.nyjaPrijese.krijoLidhjen(nyjaETanishme);
		}
	}
	void shtoNyjenFundore(int data) {
		Nyja nyjaFundore=this.nyjaPrijese;
		if(nyjaFundore ==null) {
			this.nyjaPrijese=new Nyja(data);
		}else {
			while (nyjaFundore.lexoNyjenERadhes() !=null) {
				nyjaFundore=nyjaFundore.lexoNyjenERadhes();
			}
			Nyja nyjaERe=new Nyja(data);
			nyjaFundore.krijoLidhjen(nyjaERe);
		}
	}
	Nyja largoNyjenPrijese() {
		Nyja nyja=this.nyjaPrijese;
		if(nyja != null) {
			this.nyjaPrijese=nyja.lexoNyjenERadhes();
			nyja.krijoLidhjen(null);
			
		}
		return nyja;
	}

	}

