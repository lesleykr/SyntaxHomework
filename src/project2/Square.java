package project2;

public class Square implements Shape {
    @Override
    public void calculateArea(double num) {
        System.out.println(num * num);
    }

    @Override
    public void calculatePerimeter(double num) {
        System.out.println(4 * num);
    }
}
