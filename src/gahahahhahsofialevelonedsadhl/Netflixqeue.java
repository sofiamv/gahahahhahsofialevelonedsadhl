package gahahahhahsofialevelonedsadhl;

import java.util.ArrayList;
import java.util.Collections;

//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 


public class Netflixqeue {
	public Netflixqeue() {
	}
	public static void main(String[] args) {
		Netflixqeue a = new Netflixqeue();
		Movie ob1 = new Movie("Minions", 10);
		Movie ob2 = new Movie("Frozen", 5);
		Movie ob3 = new Movie("50 shades of purple", 11);
		Movie ob4 = new Movie("New blockbuster woo", 7);
		Movie ob5 = new Movie("Not so strange things", 6);
		a.addMovie(ob1);
		a.addMovie(ob2);
		a.addMovie(ob3);
		a.addMovie(ob4);
		a.addMovie(ob5);
		a.printMovies();
		System.out.println("The best movie is " + a.getBestMovie());
		System.out.println("The second best movie is " + a.get2ndBestMovie());

	}
ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public Movie getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}
	public Movie get2ndBestMovie(){
		this.sortMoviesByRating();
		return movies.get(1);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public Movie getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		Collections.sort(movies);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}

}







