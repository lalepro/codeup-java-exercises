package movies;
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
public class MoviesApplication {
    static Movie[] films = MoviesArray.findAll();
    public static void main(String[] args) {
        Input ul = new Input();
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
                   " ___________________________\n" +
                   "| 1 - View ALL Movies       |\n" +
                   "| 2 - Animated | 3 - Drama  |\n" +
                   "| 4 - Horror   | 5 - Sci-fi |\n" +
                   "| 6 - Musical  | 7 - Comedy |\n" +
                   "| 8 - ADD Movie| 0 - EXIT   |\n" +
                   " ~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"  +
                   "|   ENTER CATEGORY NUMBER   |\n" +
                   " ---------------------------");
            userInput = ul.getInt();
            ul.getNextLine();
            switch (userInput) {
                case 1: allMovies();
                    break;
                case 2: getCategory("Animated");
                    break;
                case 3: getCategory("Drama");
                    break;
                case 4: getCategory("Horror");
                    break;
                case 5: getCategory("Scifi");
                    break;
                case 6: getCategory("Musical");
                    break;
                case 7: getCategory("Comedy");
                    break;
                case 8: addMovie();
            }
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
        for(Movie allMovies : films)
        {System.out.println(
                " ________________________________________________________________\n"+
                "| Title: "+ allMovies.getName() + " | Genre: " + allMovies.getCategory());}
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

    public static void getCategory(String genre) {
        for (Movie genreMovies : films) {
            if (genreMovies.getCategory().equalsIgnoreCase(genre)) {
                System.out.println(" -------------------------------------------------------------------");
                System.out.println("|Title: " + genreMovies.getName() + " ==> Genre: " + genreMovies.getCategory());
            }
        }
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


