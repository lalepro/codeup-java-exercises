import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            String choice;

            do {

                System.out.println("Ask Bob A Question");


                String userQ = scan.nextLine();


                if (userQ.endsWith("?")) {
                    System.out.println("Sure");
                } else if (userQ.trim().equals("")) {
                    System.out.println("Fine be that way.");
                } else if (userQ.endsWith("!") || userQ.toUpperCase().equals(userQ)) {
                    System.out.println("Whoah, chill out!");
                } else {
                    System.out.println("Whatever.");
                }
                System.out.println("What else?");
                choice = scan.nextLine();
            } while (choice.equals("y"));
    }
}
