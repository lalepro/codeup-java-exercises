import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        addition(5, 7);
        subtraction(4, 9);
        multiplication(8, 3);
        division(5, 3);
        mathIF(98, 3);
        modulus(100, 5);
        System.out.println(calculateFactorial(1,10));

        getInteger(1, 10);

        fact(getInteger(1, 10));

        rollDice();




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
        String question = "Enter a number between 1 and 10: ";
        System.out.print(question);
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
//        System.out.println(userInput);
        if (userInput > max || userInput < min) {
            getInteger(min, max);
        }

        return userInput;
    }

//    Original solution: gives results but doesn't show path
//
    public static long fact(long userInput) {
        long answer = userInput;
        String output = " ";
        output += answer + "! = " + answer;

        for (long i = userInput -1; i >=1; i--){
            output += " x " + i;
//            System.out.println(answer + output);
            userInput *= i;
        }
        System.out.println(output);
        return 0;
    }

////
//    public static long fact(long userInput) {
//        String answer = userInput + "! = ";
////        long total = userInput;
////        String output = " ";
//        answer += userInput;
//        for (long i = userInput - 1; i >= 1; i--) {
//            long total = userInput * i;
//            answer += " x " + i;
//            System.out.println(answer + " = " + total);
//            userInput *= i;
//        }
//        System.out.println("Your a genius!");
//        return userInput;
//    }
//
//    public static long fact(long userInput) {
//        String answer = userInput + "! = ";
////        long total = userInput;
////        String output = " ";
//        answer += userInput;
//        String solution;
//
//        for (long i = userInput - 1; i >= 1; i--) {
//            long total = userInput * i;
//            answer += " x " + i;
//            solution = answer + " = " + total;
////            System.out.println(solution);
//            userInput *= i;
//        }
//        System.out.println(solution);
//        return userInput;
//    }
//
    public static int calculateFactorial(int one, int ten) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between one & ten: ");
        int userInput = scanner.nextInt();
//        int result = 1;
        String teddy = userInput + "! = ";
        teddy += userInput;
//        do {
        if (userInput >= one && userInput <= ten) {
            for (int i = userInput - 1; i >= 1; i--) {
                String userChoice = userInput + "! = ";
                userChoice += userInput + i;
                long total = userInput * i;
                teddy += " x " + i;
                System.out.println(teddy + " = " + total);
                userInput *= i;

            }
        } else {
            return calculateFactorial(one, ten);
        }
//            System.out.print("Continue? [y/n]");
//            userChoice = scanner.next();
//
//        } while (userChoice.toLowerCase().startsWith("y"));
        return userInput;
    }
//    public static long fact(long userInput) {
//        String answer = userInput + "! = ";
////        long total = userInput;
////        String output = " ";
//        answer += userInput;
//        for (long i = userInput - 1; i >= 1; i--) {
//            long total = userInput * i;
//            answer += " x " + i;
//            System.out.println(answer + " = " + total);
//            userInput *= i;
//        }
//        System.out.println("Your a genius!");
//        return userInput;
//    }

//======================#4====================

    public static int rollDice() {
        String userQ;
        int x;
        int y;

        do {
            Scanner sc = new Scanner(System.in);
            String question = "Please enter the number of sides on your dice: ";
            System.out.print(question);
            int userInput = sc.nextInt();
            sc.nextLine();
            x = (int) (Math.random() * userInput) + 1;
            y = (int) (Math.random() * userInput) + 1;
            System.out.println();
            System.out.println("The dice come up " +  x + " " + y);
            System.out.print("Enter another round? Y/N: ");
            userQ = sc.nextLine();
        }


        while (userQ.toLowerCase().startsWith("y"));
            return 0;

    }

//    ==========================5=====HighLow.class=========================





}


