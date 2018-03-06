package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        Square box2 = new Square(5);
        System.out.println(box2.getPerimeter() + " " + box2.getArea());
        System.out.println(box1.getPerimeter()+ " " + box1.getArea());
        System.out.println(box2.getArea() + " " + box2.getPerimeter());
    }
}
