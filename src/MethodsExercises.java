import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        addition(5, 7);
        subtraction(4, 9);
        multiplication(8, 3);
        division(5, 3);
        mathIF(98, 3);
        modulus(100, 5);
        getInteger(1, 10);

        fact(getInteger(1, 10));


    }

    public static void addition(int x, int n) {
        System.out.println(x + n);
    }

    public static void subtraction(int y, int h) {
        System.out.println(y - h);
    }

    public static void multiplication(int a, int w) {
        System.out.println(a * w);

    }

    public static void division(int m, int w) {
        System.out.println((double) m / w);
    }

    public static void mathIF(int x, int y) {
        if (x > y) {
            System.out.println(x);
        } else if (y > x) {
            System.out.println(y);
        }
    }

    public static void modulus(int x, int y) {
        System.out.println(x % y);
    }

//    public static void divideZero(int x) {
//        System.out.println(x/0);
//
//    } NOT A NUMBER

//======================FACTORIAL ============

    public static int getInteger(int min, int max) {
        String question = "Enter a number between 1 and 10";
        System.out.println(question);
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
//        System.out.println(userInput);
        if (userInput > max || userInput < min) {
            getInteger(min, max);
        }

        return userInput;
    }

//    public static long fact(long userInput) {
//        long total = 1;
//        for (long i=userInput; i >=1; i--){
//            total *= i;
//        }
//        System.out.println(userInput + "! = " + total);
//        return total;
//    }


    public static long fact(long userInput) {
        String answer = userInput + "! ";
        long total = userInput;
        String output = " ";
        output += answer + "! = " + userInput;
        for (long i = userInput - 1; i >= 1; i--) {
            output += " x " + i;
            System.out.println(output);
            userInput *= i;
        }
        System.out.println(output += " = " + userInput);
        return userInput;
    }



//======================#4====================
//public class PairOfDice {
//
//    private int die1;   // Number showing on the first die.
//    private int die2;   // Number showing on the second die.
//
//    public PairOfDice() {
//        // Constructor.  Rolls the dice, so that they initially
//        // show some random values.
//        roll();  // Call the roll() method to roll the dice.
//    }
//
//    public void roll() {
//        // Roll the dice by setting each of the dice to be
//        // a random number between 1 and 6.
//        die1 = (int)(Math.random()*6) + 1;
//        die2 = (int)(Math.random()*6) + 1;
//    }
//
//    public int getDie1() {
//        // Return the number showing on the first die.
//        return die1;
//    }
//
//    public int getDie2() {
//        // Return the number showing on the second die.
//        return die2;
//    }
//
//    public int getTotal() {
//        // Return the total showing on the two dice.
//        return die1 + die2;
//    }
//
//}  // end class PairOfDice
//
//    public static void main(String[] args) {
//
//        PairOfDice dice;          // A variable that will refer to the dice.
//        int rollCount;    // Number of times the dice have been rolled.
//
//        dice = new PairOfDice();  // Create the PairOfDice object.
//        rollCount = 0;
//
//        /* Roll the dice until they come up snake eyes. */
//
//        do {
//            dice.roll();
//            System.out.println("The dice come up " + dice.getDie1()
//                    + " and " + dice.getDie2());
//            rollCount++;
//        } while (dice.getTotal() != 2);
//
//        /* Report the number of rolls. */
//
//        System.out.println("\nIt took " + rollCount + " rolls to get a 2.");
//
//    }
//
//}
//// end class RollFor2


}


