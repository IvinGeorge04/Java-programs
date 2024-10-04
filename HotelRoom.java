package Tutorial;
import java.util.*;
public class HotelRoom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Slot no number:");
		int slot=sc.nextInt();
		try {
			if(slot<=0) {
				throw new InvalidReservationException("Invalid slot number...");
			}
			else {
				System.out.println("Your slot is registered");
			}
		}catch(InvalidReservationException e) {
			System.out.println(e.getMessage());
		}

	}

}
