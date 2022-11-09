
public class Bus {
	public String Plaka;
	public int koltuk_sayisi;
	public Seat[]  seats;
	
	
	public Bus(String Plaka, int koltuk_sayisi, String seats) {
		this.Plaka = Plaka;
		this.koltuk_sayisi = koltuk_sayisi;
		this.seats = seats;
		
	}

	
	public static void main(String[] args) {
		
		
		//seats[] yolcular = new seats [42];
		 
		//for (int i = 0; i < 10; i++)
		//{
		    //get input variables;
		 //   yolcular[i] = new seats();
		    
		//}   
		
	
	}
	//hocam burda bir for içine alıp her seferinde kullanıcıdan girdi almaya çalıştım.
	//array çalışmam gerekiyor. Class tarafı oturdu ama bunu for loop'u ile array'e bağlayamadım.
	public int deneme(int[] array){
		
		
		int[] my_array = new array[];
				
		int	sonuc = 0; 
		
		for (int i = 1; i < array.length; i++) {
			
		
				int bus_seat = 0;
				int bus_passenger = 0;
				int bus_phone = 0;
				
				for (int j = 0; j < i; j++) {
					bus_seat += array[j];
					
					
				}
				
				for(int k = i+1; k < array.length; k++) {
					bus_passenger += array[k];
					
				}
				
				if(bus_seat == bus_passenger) {
					sonuc = array[i];
					
				}
			
				
		}
		return sonuc;
	}
	

	public String getPlaka() {
		return Plaka;
	}


	public void setPlaka(String plaka) {
		Plaka = plaka;
	}


	public int getKoltuk_sayisi() {
		return koltuk_sayisi;
	}


	public void setKoltuk_sayisi(int koltuk_sayisi) {
		this.koltuk_sayisi = koltuk_sayisi;
	}


	public Seat[] getSeats() {
		return seats;
	}


	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
	
	
}

//Aşağıdaki özellikler ile bir Bus sınıfı oluşturun:
//▪ Öznitelikler: plaka, koltukSayısı, Seat[] seats, OK
//▪ Bir constructor OK
//▪ Get/Set methods OK
//▪ bookSeat (Passenger p, int seatID) method (Önceden rezerve edilmiş bir koltuk
//rezerve etmeye çalışırsanız, bir hata mesajı vermeniz gerekir, “rezerve edilmiş     -- burayı yapamadım.
//koltukta kim oturuyor?” )  
//▪ printAllPassengers() method		OK
//▪ printAllAvailableSeatIDs() method 			-- Burayı yapamadım. For döngüsüne alıp kullanıcıdan girdi almam lazım.


