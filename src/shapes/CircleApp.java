
package shapes;

import util.Input;

//public class CircleApp {
//    public static void main(String[] args) {
//
//        Input uI = new Input();
//        System.out.println("You start with this many circles " + Circle.getNumberOfCircles());
//        int countCircles = 0;
//        do {
//            Circle circle = new Circle(6);
//            countCircles++;
//            int num1 = uI.getInt("Enter a number: ");
//            circle.setRadius(num1);
//            System.out.println("DO" + circle.getNumberOfCircles());
//            System.out.println("The Radius is: " + num1);
//            System.out.println("The Area of " + num1 + " is  " + circle.getArea());
//            System.out.println("The Circumference of " + num1 + " is " + circle.getCircumference());
//        }
//        while (uI.yesNo("Do you want to input a differenct number? y/n"));
//        {
//            System.out.println("You now have this many circles " + countCircles);
//        }
//    }
//}


public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        int countCircles = 0;

        do {
            Circle circle = new Circle(1);
            circle.getNumberOfCircles();
            countCircles++;
            circle.setUserInput();
            System.out.println("Radius: " + circle.getUserInput() +
                    "\n" + "Area: " + circle.userArea() +
                    "\n" + "Circumference: " + circle.userCircumference() +
                    "\n" + "You made " + circle.getNumberOfCircles() + " circles");


        }
        while (input.yesNo("Do you want to input a difference number? y/n"));
        {
            System.out.println("You made " + countCircles + " circles");
        }
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


