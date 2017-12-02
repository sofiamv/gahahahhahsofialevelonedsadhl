package gahahahhahsofialevelonedsadhl;


public class Movie implements Comparable<Movie> {
	//1. Instantiate some Movie objects (at least 5).
	//2. Use the Movie class to get the ticket price of one of your movies.
	private String title;
	private int stars;

	public Movie(String title, int stars) {
		this.title = title;
		this.stars = stars;
	}

	public String getTitle() {
		return this.title;
	}

	public int getRating() {
		return this.stars;
	}

	public String toString() {
		return "\"" + title + "\" - " + stars + " stars";
	}

public String getTicketPrice() {
		if (this.stars > 2) {
			return "That will be $12 please.";
		} else if (this.title.contains("Twilight")) {
			return "This movie is so bad, we'll pay YOU to watch it!";
		} else {
			return "Don't waste your money on this horrible rubbish.";
		}
	}
 public static void main(String[] args) {
	Movie ob1 = new Movie("Minions", 10);
	Movie ob2 = new Movie("Frozen", 5);
	Movie ob3 = new Movie("50 shades of purple", 11);
	Movie ob4 = new Movie("New blockbuster woo", 7);
	Movie ob5 = new Movie("Not so strange things", 6);
	System.out.println(ob1.getTicketPrice());
}

	public int compareTo(Movie otherMovie) {
		int compareQuantity = otherMovie.getRating();

		// return this.stars - compareQuantity; //ascending order
		return compareQuantity - this.stars; // descending order
	}
}

