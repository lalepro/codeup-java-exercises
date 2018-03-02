package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public String prompt = "Enter a number";


    public Input() {
        scanner = new Scanner (System.in);

    }

    public String getString(String prompt){
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput + " ";

    }

//    public boolean yesNo(String prompt){
//        System.out.println(prompt);
//        if
//    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String answer = scanner.nextLine();
        return (answer.toLowerCase().startsWith("y"));
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " & "+ max + " : ");
        int number = scanner.nextInt();
        if (number > max || number < min) {
            return getInt(min, max);
        } else {

            return number;
        }
    }


    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " & " + max + " : ");
        double number = scanner.nextInt();
        if (number > max || number < min) {
            return getDouble(min, max);
        } else {

            return number;
        }
    }

    public double getDouble(){
        System.out.println(prompt);
        double number = scanner.nextDouble();
        return number;
    }

}
