package project2;

public class ShapesTester {
    public static void main(String[] args) {
        Circle circ=new Circle();
        Square squa=new Square();

        circ.calculatePerimeter(10);
        circ.calculateArea(10);
        squa.calculatePerimeter(10);
        squa.calculateArea(10);
    }
}
