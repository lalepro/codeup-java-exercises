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
//
//        long num = 2;
//        System.out.println(num);
//        do {
//            num *= num;
//            System.out.println(num);
//        } while (num <= 1000000);

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
//        String Fizz = " ", Buzz = " ";
//        for(int i=1; i<=100; i++)
//        {
//            if (i % 15 == 0){
//            System.out.println("FizzzzzzBuzzzzz is " + " " + i);
//        }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz is: " + Fizz + " " + i);
//            }
//            else if (i % 5 == 0){
//                System.out.println("Buzzzzzzz is: " + Buzz + " " + i);
//            }
//
//        }

//====+==+=+=+==+==+========3 Display a table of powers------
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

//        String userQ;
//
//        do {
//
//            Scanner scan = new Scanner(System.in);
//
//            System.out.println("What number would you like to go up to? ");
//
//
//            String userInput = scan.nextLine();
//            double input = Double.parseDouble(userInput);
//
//            System.out.println("number | Squared | cubed");
//            System.out.println("------ | --------| ------");
//
//            for (int i = 1; i <= input; i++) {
//                if (input != (' ')) {
//                    System.out.println(i + "      |   " + (i * i) + "     |   " + (i * i * i));
//                }
//            }
//            System.out.println("Do you want to enter another number?: Yes or No");
//            userQ = scan.nextLine();
////
//        } while (userQ.toLowerCase().startsWith("y"));

//        ======================Cohorts version of table===========
////
//        Scanner scanner = new Scanner(System.in);
//        boolean confirmCont = true;
//        do {
//            System.out.print("Please enter a number: ");
//            int input = scanner.nextInt();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | --------| ------");
//            for (int i = 1; i <= input; i += 1) {
//                String output = "";
//                output += String.format("%-7d", i);
//                output += String.format("|%-9d", i * i);
//                output += String.format("|%d", i * i * i);
//                System.out.println(output);
//            }
//            System.out.print("Continue? [y/n]");
//            String userChoice = scanner.next();
//            if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//                confirmCont = true;
//            } else {
//                confirmCont = false;
//            }
//        } while (confirmCont);

//        4. Grades into letter weekdays

//        String askUser;
//
//        do {
//
//            Scanner scan = new Scanner(System.in);
//            System.out.println("What is your weekday? ");
//
//            String userGrade = scan.nextLine();
//            double weekday = Double.parseDouble(userGrade);
//
//            for (int i = 1; i <= 1; i++) {
//                if (weekday == 99 || weekday == 100) {
//                    System.out.println("A+: 99-100");
//                } else if (weekday >= 88 && weekday <= 98) {
//                    System.out.println("A: 88-98");
//                } else if (weekday >= 80 && weekday <= 87) {
//                    System.out.println("B: 80-87");
//                } else if (weekday >= 67 && weekday <= 79) {
//                    System.out.println("C: 79-67");
//                } else if (weekday >= 60 && weekday <= 66) {
//                    System.out.println("D:60-66");
//                } else if (weekday <= 59 && weekday >= 0) {
//                    System.out.println("F: 59 or below");
//                }
//            }
//            System.out.println("Would you like to enter another weekday: Y or N");
//            askUser = scan.nextLine();
//
//        } while (askUser .startsWith("Y"));


//
//================================= CONTROL STRUCTURES BONUSES
//        1. Prompt the user to enter an integer between 1 and 7 and output the
//        day of the week it maps to (Sunday is 1 and Saturday is 7)
//
//        String askUser;
//
//        do {
//
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter a number between 1 and 7 ");
//
//            String dayOfWeek = scan.nextLine();
//            double weekday = Double.parseDouble(dayOfWeek);
//
//            for (int i = 1; i <= 1; i++) {
//                if (weekday == 1) {
//                    System.out.println("Sunday");
//                } else if (weekday == 2) {
//                    System.out.println("Monday");
//                } else if (weekday == 3) {
//                    System.out.println("Tuesday");
//                } else if (weekday == 4) {
//                    System.out.println("Wednesday");
//                } else if (weekday == 5) {
//                    System.out.println("Thursday");
//                } else if (weekday == 6) {
//                    System.out.println("Friday");
//                } else if (weekday == 7){
//                    System.out.println("Saturday");
//                }
//                System.out.println();
//            }
//            System.out.println("Would you like to enter another number between 1 and 7? Please Enter: Yes or No");
//            askUser = scan.nextLine();
//
//        } while (askUser.toLowerCase().startsWith("y"));

//        2. Prompt the user for an integer. Output whether or not the number is prime.

        int userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userNumber = sc.nextInt();

        for (int i = 3; i*i < userNumber; i+=2) {
            if (userNumber % 2 == 0) {
                System.out.println(userNumber + " Not a Prime Number");
        }
            System.out.println(userNumber + " Prime Number!!");
        }









//        3. Prompt the user to enter an integer and output all the days of the week that
//        have no more letters than the integer given.
//        4. Prompt the user to enter their name. Output whether the name is
//                - short (less than 4 characters), medium (less than 9), long (more than 8)
//        - contains the letter 'y'
//                - is a palindrome
//        5. Print out all times from 1:00am to 12:00pm.
//                Example:
//        1:00am
//        1:01am
//        1:02am
//        etc.
//                this will help you for this bonus...
//        https://stackoverflow.com/questions/12421444/how-to-format-a-number-0-9-to-display-
// with-2-digits-its-not-a-date

    }
}



