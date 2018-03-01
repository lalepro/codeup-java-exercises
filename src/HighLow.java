import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        guessingGame();

    }


    public static int guessingGame() {
        Scanner sc = new Scanner(System.in);
        String input = "y";
        double randomNumber = (Math.round(Math.random() * 100) + 1);
        String question = "Guess a Number!!! ";

        do {


            System.out.print(question);
            int userQ = sc.nextInt();


            if (randomNumber == userQ) {
                System.out.println("YOU GUESSED CORRECT!!" + userQ + " is right!!! YOU WIN!!!");
                System.out.println("Would you like to play again: Enter: Y/N");

                randomNumber = (Math.round(Math.random() * 99) + 1);
                input = sc.next();
                System.out.println();

            } else if (userQ > randomNumber) {
                System.out.println("You guessed too high!!, Guess again!: ");



            } else if (userQ < randomNumber) {
                System.out.println("You guessed too low....Guess again!: ");

            }

        } while (!input.equalsIgnoreCase("n"));

       return 0;
    }


}
