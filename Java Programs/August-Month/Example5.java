class Movie {
  // Instance variables
  String name, director, musicComposer;
  // Constructor
  Movie(String n, String d, String mc) {
    name = n; // Storing n in name
    director = d; // Storing d in director
    musicComposer = mc; // Storing mc in musicComposer
  }
  // Instance method
  void printMovieDetails() {
    System.out.println(name + " is directed by " + director);
    System.out.println("Music is composed by " + musicComposer);
  }
}
public class Example5 {
  public static void main(String[] args) {
    Movie favoriteMovie = new Movie("Dalapathy", "Maniratnam", "Ilyaraja");
    favoriteMovie.printMovieDetails();
  }
}
