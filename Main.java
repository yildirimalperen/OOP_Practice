import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		//Bus bus = new Bus("06 HUBM 06", 42);
		
		//System.out.println(bus.Plaka + " " + bus.koltuk_sayisi);
	
		

		String str ="";
		Scanner getpassenger = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		Seat yolcu_seat = new Seat(0,false,"");
		Passenger yolcu_passenger = new Passenger("","","","");
		Phone yolcu_phone = new Phone (0,0,"");
		
		
		System.out.println("Yolcu Adını Giriniz");
		yolcu_passenger.setAdi(input.nextLine());
		
		System.out.println("Yolcu Soyadını Giriniz");
		yolcu_passenger.setSoyadi(input.nextLine());
		
		System.out.println("Yolcu Cinsiyetini Giriniz");
		yolcu_passenger.setCinsiyeti(input.nextLine());
		
		System.out.println("Yolcu Telefon Kodunu Giriniz");
		yolcu_phone.setKod(getpassenger.nextInt()); // buraya int değer dışında girilirse hata kodu getirmek lazım.
		
		System.out.println("Yolcu Telefon Numrasını Giriniz");
		yolcu_phone.setNumara(getpassenger.nextInt()); // buraya int değer dışında girilirse hata kodu getirmek lazım.
		
		System.out.println("Yolcu Telefon Türünü Giriniz");
		yolcu_phone.setTur(input.nextLine());
		
		
		
		
		yolcu_seat.setPassenger("Yolcu adı: " +yolcu_passenger.getAdi()+
								" Soyadı " + yolcu_passenger.getSoyadi()+
								" Cinsiyeti: "+yolcu_passenger.getCinsiyeti() + 
								" Yolcu telefon numarası: "+ yolcu_phone.getUlke_kodu() +yolcu_phone.getKod()+ yolcu_phone.getNumara() + 
								"Türü "+yolcu_phone.getTur());
		
		System.out.println(yolcu_seat.getPassenger());
				
			
	}
		
		
}
