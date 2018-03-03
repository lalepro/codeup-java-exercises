package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        Input uI = new Input();

//        System.out.println(userInput.getString("Do you want to continue?") + userInput.yesNo("Y/N"));
//        System.out.println(userInput.getString("Where did you see a UFO?") + userInput.yesNo("Are you sure " + "yes" + " or" + " no?") +
//        userInput.getInt(1,10));
//        System.out.println(userInput.getDouble());
//        System.out.println(userInput.getInt());
//        System.out.println(userInput.getInt());

        int num1 = uI.getInt(1, 10, "Type a # between 1 & 10: ");

        System.out.print("Your number " +" " + num1);
//        System.out.println();
        System.out.println("Do you have another number to input? y/n");

        boolean choice = uI.yesNo();

        System.out.println();

          if (choice){
              int num2 = uI.getInt("Please input Any valid integer: ");
              System.out.println("You entered: " + " " + num2);
          }

          if (uI.yesNo("Wanna enter an integer?")){
              int num3 = uI.getInt("Please enter any integer");
              System.out.println("You entered: " + num3 );
          }

          double someDouble;
          someDouble = uI.getDouble("Please input any number");
          System.out.println("You input" + " " + someDouble);

          double doubleInRange;
          doubleInRange = uI.getDouble(2.2,11.4,"Input a number between " + 2.2 + " & " + 11.4);

        System.out.println(doubleInRange);
//       System.out.println(uI.yesNo("Would you like to continue" + uI.getInt()));



    }
}
