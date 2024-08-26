package moviereservationsystem;
import java.util.*;
public class MovieDemo {
	public static void main(String[] args) {
		ArrayList<Movie> movies=new ArrayList<Movie>();//Array List -collection
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		movies.add(new Movie("kanguva",true,2));
		movies.add(new Movie("vettiyan",false,100));
		movies.add(new Movie("its end with us",true,50));
		
		
		
		int userOption = 1;
		Scanner sc =new Scanner(System.in);
		
		for(Movie m:movies) {
			m.displayMovieInfo();
		}
		while(userOption==1) {
			
		
		System.out.println("ENTER 1 TO BOOK AND 2 TO EXIT");
		userOption=sc.nextInt();
		if(userOption==1) {
			Booking booking =new Booking();
			if(booking.isAvailable(bookings,movies)) {
				bookings.add(booking);
				System.out.println("Your Booking is confirmed");
				
			}
			else {
				System.out.println("Sorry!. Seats are full . try another Show or Date.");
			}
		}
		else {
			System.out.println("exit");
		}
		}
		
	
	}

}
