package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Square square;
        Rectangle rectangle;


        Measurable myShape = new Measurable() {

            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };



    }
}


























//        Rectangle box1 = new Rectangle(4,5);
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter() + " " + box2.getArea());
////        System.out.println(box1.getPerimeter()+ " " + box1.getArea());
//        System.out.println(box2.getArea() + " " + box2.getPerimeter());