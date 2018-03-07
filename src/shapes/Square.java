package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;

    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * length;
    }
}




































//
//
//
//    private double side;
//    public Square(double side) {
//        super(side, side);
//
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * side;
//    }