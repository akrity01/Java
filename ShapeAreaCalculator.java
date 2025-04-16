import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}

// Area class implementing Shape
class Area extends Shape {
    @Override
    void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Runtime polymorphism
        Shape shape = new Area();

        System.out.print("Enter length and breadth of rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        shape.rectangleArea(length, breadth);

        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        shape.squareArea(side);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        shape.circleArea(radius);

        scanner.close();
    }
}
