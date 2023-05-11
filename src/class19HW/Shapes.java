package class19HW;

public class Shapes {
    int length;
    int width;
    void calculateArea(int length, int width){
        this.length=length;
        this.width=width;
        System.out.println(length*width);
    }
}
class ShapesTester {
    public static void main(String[] args) {
        Shapes square=new Shapes();
        square.calculateArea(5,5);
        Shapes rectangle=new Shapes();
        rectangle.calculateArea(5,9);
    }
}