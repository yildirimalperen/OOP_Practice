
public class Seat {
	public int SeatID;
	public boolean status;
	public String passenger;
		
	
	public Seat(int SeatID, boolean status, String passenger) {
		
		Passenger passenger1 = new Passenger("a","b","c","d");
		
		
		this.SeatID = SeatID;
		this.status = status;
		this.passenger = passenger1.getAdi() + " " + passenger1.getSoyadi() + " " + passenger1.getCinsiyeti() + " " +passenger1.getTelefonu();
		
	}
		
		
	
	
			public int getSeatID() {
				return SeatID;
			}
			public void setSeatID(int seatID) {
				SeatID = seatID;
			}
			public boolean getStatus() {
				return status;
			}
			public void setStatus(boolean status) {
				this.status = status;
			}
			
			public String getPassenger() {
				return passenger;
			}
			public void setPassenger(String passenger) {
				this.passenger = passenger;
			}
			
			public void display() {
				
				System.out.println("Yolcunun Koltuk Numarası: "+ this.SeatID);
				System.out.println("Yolcunun Durumu: "+ this.status);
				System.out.println("Yolcunun Bilgileri: "+ this.passenger);
	
				
			}
			
	}
	
	
	
//Aşağıdaki özellikler ile bir Seat sınıfı oluşturun:
//▪ Öznitelikler: int seatID, boolean status, Passenger ok 
//▪ Bir constructor tanımlanmalı, tüm öznitelikleri parametre olarak alan ok 
//▪ Get / Set methods ok 
//▪ Display method ok
	
	

