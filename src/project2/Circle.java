package project2;

public class Circle implements Shape {
    final double PI = 3.14;

    @Override
    public void calculateArea(double num) {
        System.out.println(PI * (num * num));
    }

    @Override
    public void calculatePerimeter(double num) {
        System.out.println(PI * (2 * num));
    }
}
