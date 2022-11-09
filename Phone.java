
public class Phone {
	
	// öznitelikleri tanımladım.
	private String ulke_kodu, tur;
	private int kod, numara;
	

		
	// ilk constructor olarak tüm parametreleri tanımladım.
	public Phone(String ulke_kodu,int kod, int numara, String tur) {
		this.ulke_kodu = ulke_kodu;
		this.kod = kod;
		this.numara = numara;
		this.tur = tur;
		
	}
	
	// ikinci constructor'da ulke kodunu default değer +90 aldım. + var diye string kullandım.
	public Phone (int kod, int numara, String tur) {
		
		this.ulke_kodu = "+90";
		this.kod = kod;
		this.numara = numara;
		this.tur = tur;
	}	
	
	
	//this optional.
	public String getUlke_kodu() {
		return this.ulke_kodu;
				
	}		
	
	public void setUlke_kodu(String ulke_kodu) {
		this.ulke_kodu = ulke_kodu;
	}

	
	// eclipse kendi get set üretirken this getirmiyor.
	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public void display() {
		
			System.out.println("Telefonun ülke kodu: "+ this.ulke_kodu);
			System.out.println("Telefonun alan kodu: "+ this.kod);
			System.out.println("Telefon numarası: "+ this.numara);
			System.out.println("Telefonun türü: "+ this.tur);
			
		}
	
	
		
	

}


//Aşağıdaki özellikler ile bir Phone sınıfı oluşturun:
//▪ Dört öznitelik: ülke kodu, kod (şehir veya cep telefonu operatörü), numara (7
//basamak), tür (ev, ofis veya cep telefonu) ok 

//▪ İki constructor metod
// o Biri tüm parametreleri alan, ok 
//o Diğeri ise ülke kodunu varsayılan olarak +90 alan ve diğer parametreleri 
//girdi olarak alan ok

//▪ Get / Set methods ok
//▪ Display method ok