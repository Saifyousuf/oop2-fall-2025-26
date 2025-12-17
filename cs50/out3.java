package cs50;

class Vehicle {
    private String model;
    private int speed;
    static int count = 0;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
        count++;
        System.out.println("Vehicle " + model + " added");
    }

    String getModel() { return model; }
    int getSpeed() { return speed; }
}

class Car extends Vehicle {
    private String type;

    public Car(String model, int speed, String type) {
        super(model, speed);
        this.type = type;
        System.out.println("Car " + model + " prepared");
    }

    void showInfo() {
        System.out.print(getModel().toUpperCase().substring(0, 4) + " - ");
        System.out.print(type + " - ");
        System.out.println(getSpeed() * 2);
    }

    public static void main(String[] args) {
        Car[] list = {
            new Car("Corolla", 120, "Sedan"),
            new Car("Mustang", 150, "Sport"),
            new Car("Civic", 110, "Sedan")
        };

        for (int i = 0; i < list.length; i++) {
            list[i].showInfo();
        }

        System.out.println("Total Vehicles: " + Vehicle.count);
    }
}
 
