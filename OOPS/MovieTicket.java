package OOPS;

public class MovieTicket {
	 private int movieId;
	 private int noOfSeats;
	 private double costPerTicket;
	 
	 public int getMovieId() {
		 return movieId;
	 }
	 public void setMovieId(int movieId) {
		 this.movieId = movieId;
	 }
	 public int getNoOfSeats() {
		 return noOfSeats;
	 }
	 public void setNoOfSeats(int noOfSeats) {
		 this.noOfSeats = noOfSeats;
	 }
	 public double getCostPerTicket() {
		 return costPerTicket;
	 }
	 public void setCostPerTicket(double costPerTicket) {
		 this.costPerTicket = costPerTicket;
	 }
	 public MovieTicket(int movieId,int noOfSeats) {
		 this.setMovieId(movieId);
		 this.setNoOfSeats(noOfSeats);
	 }

	 public double calculateTotalAmount() {
		 if(movieId==111) {
			 this.costPerTicket = 7;
		 }
		 else if(movieId==112) {
			 this.costPerTicket = 8;
		 }
		 else if(movieId==113) {
			 this.costPerTicket = 8.5;
		 }
		 double amt = this.costPerTicket * this.noOfSeats;
		 amt+=amt*0.02;
		 //this.setCostPerTicket(amt);
		 return Math.round(amt);
	 }
}
