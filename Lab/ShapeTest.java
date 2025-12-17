abstract class Shape {

    abstract void calculateArea();

    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(5, 4);
        s1.displayShape();
        s1.calculateArea();

        Shape s2 = new Circle(3);
        s2.displayShape();
        s2.calculateArea();
    }
}
