import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//a. While=================
//        int i = 5;
//        while (i <= 15){
//            System.out.println("i is: " + i);
//            i++;
//
//        }

//        b. Do While====================

//        int num = 0;
//        do {
//            System.out.println("Count is: " + num);
//            num += 2;
//        } while (num <= 100);

//        int num = 100;
//        do {
//            System.out.println("Count is: " + num);
//            num -= 5;
//        } while (num >= 0);

//        int num = 2;
//        do {
//            num *= num;
//            System.out.println("Count is: " + num);
//        } while (num <= 10000);

//        int num = 2;
//        do {
//            num *= num;
//            System.out.println("Count is: " + num);
//        } while (num <= 10000);

//==============C. =====FOR Loops

//        for(int i=5; i<=15; i++){
//            System.out.println("Count is: " + i);
//        }

//
//        for(int i=0; i<=100; i += 2){
//            System.out.println("Count is: " + i);
//
//        }


//        for(int i=100; i>=0; i -= 5){
//            System.out.println("Count is: " + i);
//
//        }

//        for(int i=2; i<=10000; i *= i){
//
//            System.out.println("Count is: " + i);
//        }

//        2. Fizzbuzz===============
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
////        For numbers which are multiples of both three and five print “FizzBuzz”.
//
//
//        }
//        String Fizz = " ", Buzz = "buzz";
//        for(int i=1; i<=100; i++)
//        {
//            if (i % 3 == 0) {
//                System.out.println("Fizz is: " + Fizz + " " + i);
//            }
//            else if (i % 5 == 0){
//                System.out.println("Buzz is: " + Buzz + " " + i);
//            }
//            else if (i % 15 == 0){
//                System.out.println("FizzBuzz is " + " " + i);
//            }
//        }

//====+==+=+=+==+==+========3 Display a table of powers------
//        Prompt the user to enter an integer.
//                Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
        //        int userNumber;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        userNumber = sc.nextInt();
//        System.out.println("User entered: --> \"" + userNumber + "\" <--");

        int userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        userInput = scan.nextInt();
        System.out.format(userInput);


    }
}



