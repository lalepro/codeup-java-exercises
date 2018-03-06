package movies;
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MoviesApplication {
    static Movie[] films = MoviesArray.findAll();
    static Input ul = new Input();
    public static void main(String[] args) {
//        Input ul = new Input();
        int userInput;
        System.out.println(
        "       ________________                              _______________ \n" +
                "      /                \\                            / /           \\ \\ \n" +
                "     / /          \\ \\   \\                          |    -    -       \\\n" +
                "     |                  |                          | /        -   \\  |\n" +
                "    /                  /                           \\                 \\\n" +
                "   |      ___\\ \\| | / /                             \\____________  \\  \\\n" +
                "   |      /           |                             |            \\    | \n" +
                "   |      |     __    |                             |             \\   \\ \n" +
                "  /       |       \\   |                             |              \\  | \n" +
                "  |       |        \\  |                             | ====          | |\n" +
                "  |       |       __  |                             | (o-)      _   | | \n" +
                "  |      __\\     (_o) |                             /            \\  | |\n" +
                "  |     |             |     Heh Heh Movies         /            ) ) | |\n" +
                "   \\    ||             \\      /    Movies Huh Huh /             ) / | | \n" +
                "    |   |__             \\    /                \\  |___            - |  | \n" +
                "    |   |           (*___\\  /                  \\    *'             |  |\n" +
                "    |   |       _     |    /                    \\  |____           |  |\n" +
                "    |   |    //_______|                             ####\\          |  |\n" +
                "    |  /       |_|_|_|___/\\                        ------          |_/  \n" +
                "     \\|       \\ -         |                        |                | \n" +
                "      |       _----_______/                        \\_____           | \n" +
                "      |      /                                          \\           |\n" +
                "      |_____/                                            \\__________|"
        );

        do { System.out.println(
                   " _____________________________\n" +
                   "| 1 - View ALL | 2 - Animated |\n" +
                   "| 3 - Drama    | 4 - Horror   |\n" +
                   "| 5 - Sci-fi   | 6 - Musical  |\n" +
                   "| 7 - Comedy   | 8 - ADD      |\n" +
                   "| 9 - Delete   | 10- Rate 1-5 |\n" +
                   "| 11- Edit     | 12 - Search  |\n" +
                   "| 13 - Exit    |              |\n" +
                   " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"  +
                   "|   ENTER CATEGORY NUMBER     |\n" +
                   " ----------------------------");
            userInput = ul.getInt();
            ul.getNextLine();
            displayMovie(userInput);
        } while (userInput != 0);
        System.out.println(
                        "                          (####)\n" +
                        "                        (#######)\n" +
                        "                      (#########)\n" +
                        "                     (#########)\n" +
                        "                    (#########)\n" +
                        "                   (#########)\n" +
                        "   __&__          (#########)\n" +
                        "  /     \\        (#########)   |\\/\\/\\/|     /\\ /\\  /\\               /\\\n" +
                        " |       |      (#########)    |      |     | V  \\/  \\---.    .----/  \\----.\n" +
                        " |  (o)(o)       (o)(o)(##)    |      |      \\_        /       \\          /\n" +
                        " C   .---_)    ,_C     (##)    | (o)(o)       (o)(o)  <__.   .--\\ (o)(o) /__.\n" +
                        "  | |.___|    /___,   (##)     C      _)     _C         /     \\     ()     /\n" +
                        "  |  \\__/       \\     (#)       | ,___|     /____,   )  \\      >   (C_)   <\n" +
                        "  /_____\\        |    |         |   /         \\     /----'    /___\\____/___\\\n" +
                        " /_____/ \\       OOOOOO        /____\\          ooooo             /|    |\\\n" +
                        "/         \\     /      \\      /      \\        /     \\           /        \\"
        );

    }
    public static void allMovies(){
        for(Movie allMovie : films)
        {System.out.println(
                " ________________________________________________________________\n"+
                "| Title: "+ allMovie.getName() + " | Genre: " + allMovie.getCategory());}
    }

    public static void addMovie() {
        Input ul = new Input();
        String newfilm = ul.getString("Enter new film: ");
        String newCategory = ul.getString("Enter new category: ");
        Movie newMovie = new Movie(newfilm, newCategory);
//        ArrayList<Movie> filmsArray = new ArrayList<>();
//        filmsArray.add(newMovie);
        Movie[] addMovie =Arrays.copyOf(films, films.length + 1);
        int lastIndex = addMovie.length -1;
        addMovie[lastIndex] = newMovie;
        films = addMovie;
        }

    public static void getCategory(String genre) {
        for (Movie genreMovie : films) {
            if (genreMovie.getCategory().equalsIgnoreCase(genre)) {
                System.out.println(" -------------------------------------------------------------------");
                System.out.println("|Title: " + genreMovie.getName() + " ==> Genre: " + genreMovie.getCategory());
            }
        }
    }

    public static void displayMovie(int userInput) {
        switch (userInput) {
            case 1:
                allMovies();
                break;
            case 2:
                getCategory("Animated");
                break;
            case 3:
                getCategory("Drama");
                break;
            case 4:
                getCategory("Horror");
                break;
            case 5:
                getCategory("Scifi");
                break;
            case 6:
                getCategory("Musical");
                break;
            case 7:
                getCategory("Comedy");
                break;
            case 8:
                addMovie();
                break;
            case 9:
                deleteMovie();
                break;
          case 10:
                rateMovie();
              break;
            case 11:
                editMovie();
                break;
            case 12:
                searchMovie();
                break;
            case 13:
                System.exit(13);
            default:
                System.out.println("Error: we should never get here");


        }
    }

    private static void searchMovie() {
    }

    private static void editMovie() {
    }

    private static void rateMovie() {
    }

//   ================ working on bonuses from Slack=========

    public static void deleteMovie() {
        Input ul = new Input();
        String eraseFilm = ul.getString("Remove which Movie?  ");
        String eraseCategory = ul.getString("What is the category? ");
        Movie removeMovie = new Movie(eraseFilm, eraseCategory);
        Movie[] deleteMovie = Arrays.copyOf(films, films.length - 1);
        int lastIndex = deleteMovie.length -1;
        deleteMovie[lastIndex] = removeMovie;
        films = deleteMovie;
    }
//
//    public static void addRatings(Movie[] movies){
//        Random rng = new Random();
//        for(Movie movie : movies){
//            movie.setRating(rng.nextInt(10));
//        }
//    }

//    public static Movie[] findAll(){
//        Movie[] movies = generateMovies(); rename findAll() to generateMovies
//        addRatings();
//        return movies;
//    }

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


