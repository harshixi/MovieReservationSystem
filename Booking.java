package moviereservationsystem;
import java.util.*;
import java.text.*;
public class Booking {
    String personName;
    String movieName;
    Date date;
    
    Booking(){
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter name: ");
    	personName=sc.next();
    	
    	System.out.println("Enter Movie name: ");
    	movieName=sc.next();
    	
    	System.out.println("Enter Date dd-mm-yyyy");
    	String dateInput=sc.next();
    	
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    	try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Movie>movies) {
    	int capacity=0;
    	for(Movie m:movies) {
    		if(m.getMovieName()==movieName) {
    			capacity=m.getCapacity();
    			
    		}
    	}
    		int booked=0;
    		for(Booking b:bookings) {
    			if(b.movieName==movieName && b.date.equals(date)) {
    				booked++;
    			}
    		}
    		
    	
		return booked<capacity?true:false;
    	
    }
}
