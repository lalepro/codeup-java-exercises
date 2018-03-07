package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Square square = new Square(1);
//        Rectangle rectangle = new Rectangle(5, 4);

//    Measurable myShape = new Measurable(); abstract classes cant be instanciated.

        Measurable myShape = new Rectangle(8, 9);
        System.out.println("Interface (measurable) set to rectangle perimeter. " + myShape.getArea());

        Measurable yourShape = new Square(5);

        myShape = new Square(5);
        System.out.println(myShape.getArea());

    }



}


























//        Rectangle box1 = new Rectangle(4,5);
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter() + " " + box2.getArea());
////        System.out.println(box1.getPerimeter()+ " " + box1.getArea());
//        System.out.println(box2.getArea() + " " + box2.getPerimeter());