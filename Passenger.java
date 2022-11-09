
public class Passenger {

	private String adi, soyadi, cinsiyeti, telefonu;
	


	//tüm parametereleri alan bir constructor tanımladım. Phone'u sınıftan aldım.
	public Passenger(String adi, String soyadi, String cinsiyeti, String telefonu) {
		
		Phone tel1 = new Phone(554,4408630,"Cep");
		
		this.adi = adi;
		this.soyadi = soyadi;
		this.cinsiyeti = cinsiyeti;
		this.telefonu = tel1.getTur()+" " +tel1.getUlke_kodu()+tel1.getKod() +tel1.getNumara();
				
	}
	

	
	

	
	//get-set methodlarını tanımladım.
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getCinsiyeti() {
		return cinsiyeti;
	}

	public void setCinsiyeti(String cinsiyeti) {
		this.cinsiyeti = cinsiyeti;
	}

	public String getTelefonu() {
		return telefonu;
	}

	public void setTelefonu(String telefonu) {
		this.telefonu  = telefonu;
	}
	
	//display'i tanımladım
	public void display() {
		
		System.out.println("Yolcunun Adı: "+ this.adi);
		System.out.println("Yolcunun Soyadı: "+ this.soyadi);
		System.out.println("Yolcunun Cinsiyeti: "+ this.cinsiyeti);
		System.out.println("Yolcunun Telefonu: "+ this.telefonu);
		
	}
	
	
	
	
}

	



//Aşağıdaki özellikler ile bir Passenger sınıfı oluşturun: 
//▪ Öznitelikler: adı, soyadı, cinsiyeti ve telefonu (Phone) ok
//▪ Bir constructor tanımlanmalı, tüm öznitelikleri parametre olarak alan ok
//▪ Get / Set methods ok 
//▪ Display method ok 