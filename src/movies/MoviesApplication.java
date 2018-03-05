package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class MoviesApplication {
    static Movie[] films = MoviesArray.findAll();

    public static void main(String[] args) {


        Input ul = new Input();
        int userInput;

//        String userNewMovie;
        do {
            System.out.println(
                    "0 - exit\n" +
                            "1 - view all movies\n" +
                            "2 - view movies in the Animated category\n" +
                            "3 - view movies in the Drama category\n" +
                            "4 - view movies in the Horror category\n" +
                            "5 - view movies in the Sci-fi category \n" +
                            "6 - add a movie and category \n" +
                            "What would you like to do: ");

            userInput = ul.getInt();
            ul.getNextLine();

            switch (userInput) {

                case 1:
                    for (Movie allMovies : films) {
                        System.out.println(allMovies.getName() + " -- " + allMovies.getCategory());
                    }
                    break;
                case 2:
                    getCategory("animated");
                    break;
                case 3:
                    getCategory("drama");
                    break;
                case 4:
                    getCategory("horror");
                    break;
                case 5:
                    getCategory("scifi");
                    break;
                case 6:
                    addMovie();

            }


        } while (userInput != 0);
        System.out.println("Thank you");

    }

    public static void getCategory(String cat) {
        for (Movie catMovies : films) {
            if (catMovies.getCategory().equals(cat)) {
                System.out.println("------------------");
                System.out.println("Name: " + catMovies.getName() + "Category: " + catMovies.getCategory());
            }
        }
    }

    public static void addMovie() {
        Input ul = new Input();
        String newfilm = ul.getString("Enter new film: ");
        String newCategory = ul.getString("Enter new category: ");
        Movie newMovie = new Movie(newfilm, newCategory);
//        ArrayList<Movie> filmsArray = new ArrayList<>();
//        filmsArray.add(newMovie);
        Movie[] newMovies =Arrays.copyOf(films, films.length + 1);
        int lastIndex = newMovies.length -1;
        newMovies[lastIndex] = newMovie;
        films = newMovies;

    }

}







//            if (userInput == 1) {
//                for (Movie allMovies : films) {
//                    System.out.println(allMovies.getName() + " -- " + allMovies.getCategory());
//                }
//            } else if (userInput == 2) {
//
//                }
//            } else if (userInput == 3) {
//                for (Movie dramaFilm : films) {
//                    if (dramaFilm.getCategory().equals("drama")) {
//                        System.out.println(dramaFilm.getName() + " -- " + dramaFilm.getCategory());
//                    }
//                }
//            } else if (userInput == 4) {
//                for (Movie horrorFilms : films) {
//                    if (horrorFilms.getCategory().equals("horror")) {
//                        System.out.println(horrorFilms.getName() + " -- " + horrorFilms.getCategory());
//                    }
//                }
//            } else if (userInput == 5) {
//                for (Movie scifiFilms : films) {
//                    if (scifiFilms.getCategory().equals("scifi")) {
//                        System.out.println(scifiFilms.getName() + " -- " + scifiFilms.getCategory());
//                    }
//                }
//
//            } else if (userInput == 6) {
//
//                String newfilm = ul.getString("Enter new film: ");
//                String newCategory = ul.getString("Enter new category: ");
//                Movie newMovie = new Movie(newfilm, newCategory);
//                ArrayList<Movie> filmsArray = new ArrayList<>();
//                filmsArray.add(newMovie);
//            }
//        } while (userInput != 0);
//        System.out.println("thank you for visiting");
//    }
////            public void
//            for (Movie allMovies : films) {
//                System.out.println(allMovies.getName() + " -- " + allMovies.getCategory());
//            }


