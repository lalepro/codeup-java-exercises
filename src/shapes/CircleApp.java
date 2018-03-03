package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        returnNumOfCircles();
        System.out.println("Inside the Main " + returnNumOfCircles() + " circles.");
    }
    public static int returnNumOfCircles() {
        Input uI = new Input();
        System.out.println("Start with " + Circle.getNumberOfCircles() + " circles");
        Circle circle = new Circle(6);
        do {
            int num1 = uI.getInt("Enter a number: ");
            circle.setRadius(num1);
//            System.out.println("The Radius is: " + num1);
//            System.out.println("The Area of " + num1 + " is  " + circle.getArea());
//            System.out.println("The Circumference of " + num1 + " is " + circle.getCircumference());
            circle.getNumberOfCircles();
            System.out.println("Inside Do " + circle.getNumberOfCircles() + " Circles.");
            circle.getRadius();
        }
        while (uI.yesNo("Do you want to input a differenct number? y/n"));
        {
            System.out.println("In the While " + circle.getNumberOfCircles() + " circles.");
        }
        return circle.getNumberOfCircles();
            }

}












//        if (choice) {
//            int num2 = uI.getInt(1, 10, "Type a # between 1 & 10: ");
//            circle.setRadius(num1);
//            System.out.println("The Radius is: " + num2);
//            System.out.println("The Area of " + num2 + " is  " + circle.getArea());
//            System.out.println("The Circumference of " + num2 + " is " + circle.getCircumference());
//        }
//


