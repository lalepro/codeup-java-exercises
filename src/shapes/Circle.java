package shapes;

import util.Input;

public class Circle {

    Input uI = new Input();

    private double radius;
    private static int numberOfCircles = 0;
    private double userInput;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;
    }


    public void setUserInput() {
        this.userInput = uI.getDouble("Enter a Number: ");
    }

    public double getUserInput() {
        return userInput;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static int getNumberOfCircles(){
        return numberOfCircles;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double userArea(){
        return this.getUserInput() * getArea();

    }

    public double userCircumference(){
        return this.getUserInput() * 2 * Math.PI * radius;
    }





}
