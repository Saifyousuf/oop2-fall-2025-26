abstract class ShapeTest1 {

    abstract void calculateArea();

    void displayShape() {
        System.out.println("This is a shape.");
    }

    static class Rectangle extends ShapeTest1 {
        double length, width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        void calculateArea() {
            System.out.println("Area of Rectangle: " + (length * width));
        }
    }

    static class Circle extends ShapeTest1 {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        void calculateArea() {
            System.out.println("Area of Circle: " + (Math.PI * radius * radius));
        }
    }

    public static void main(String[] args) {

        ShapeTest1 rectangle = new Rectangle(10, 5);
        rectangle.displayShape();
        rectangle.calculateArea();

        ShapeTest1 circle = new Circle(7);
        circle.displayShape();
        circle.calculateArea();
    }
}
