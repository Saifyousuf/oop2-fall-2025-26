package Practice;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Saif", 101, 20, "CSE", 3.75);
        Teacher t1 = new Teacher("Rahim Sir", 501, "Java", 10, 55000);
        Product p1 = new Product("Laptop", 1001, 65000, 5, "Electronics");
        Car c1 = new Car("Toyota", "Corolla", 2020, "White", 1.8);
        Animal a1 = new Animal("Mammal", "Tiger", 5, 220.5, "Forest");

        System.out.println("Student Name: " + s1.name);
        System.out.println("Teacher Name: " + t1.name);
        System.out.println("Product Name: " + p1.productName);
        System.out.println("Car Brand: " + c1.brand);
        System.out.println("Animal Name: " + a1.name);
    }
}
