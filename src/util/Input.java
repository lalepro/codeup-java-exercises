package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public Input() {
        scanner = new Scanner (System.in);

    }

    public String getString(){
        return scanner.next();
    }

    public String getNextLine(){
        return scanner.nextLine();
    }
//
    public String getString(String prompt){
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;

    }

//    public boolean yesNo(String prompt){
//        System.out.println(prompt);
//        if
//    }

    public boolean yesNo() {
        String userInput = getString();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }

//    public int getInt(){
//        return scanner.nextInt();
//
//    }

    public int getInt(String prompt){
        System.out.println(prompt);
        String intInput = scanner.nextLine();
    try {
        return Integer.valueOf(intInput);
        }catch (NumberFormatException e) {
            System.out.println("Error- Input number be an Integer!");
            return getInt(prompt);
        }
    }


    public int getInt(String prompt, int min, int max) {

        int userInt = getInt(prompt);

        if (userInt > max || userInt < min) {
            return getInt(prompt, min, max);
        } else {
            System.out.println("Error--Integer must be between" + min + " & " + max);
            return userInt;
        }
    }

//    public int getInt(int min, int max, String prompt) {
//        System.out.println(prompt);
//        return getInt(min, max);
//    }


    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();

    }


    public double getDouble(double min, double max){
        double number = getDouble();
        if (number > max || number < min) {
            return getDouble(min, max);
        } else {

            return number;
        }
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        return getDouble(min, max);
    }

//    public double getSum(){
//        return scanner.nextDouble();
//    }
//
//    public double getSum(){
//        System.out.println(prompt);
//        return getSum;
//    }

    public double getSum(double x, double y) {
        return x + y;
    }

}
