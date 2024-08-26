package moviereservationsystem;

public class Movie {
     private String movieName;
     private boolean premium;
     private int capacity; //get and set
    Movie(String name,Boolean premium,int cap){
    	this.movieName=name;
    	this.premium=premium;
    	this.capacity=cap;
    }
	public String getMovieName() {
		return movieName;
	}
	public boolean isPremium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void displayMovieInfo(){
		System.out.println("Movie Name : " + movieName+" Premium : "+premium+" Total Capacity : "+capacity);
	}
}
