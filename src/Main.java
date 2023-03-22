
class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void deliver(int numCars) {
        this.quantity += numCars;
    }

    public void sell(int numCars) {
        if (numCars > this.quantity) {
            System.out.println("Not enough cars in stock");
        } else {
            this.quantity -= numCars;
        }
    }

    public String toString() {
        return "Model: " + this.model +
                ", Brand: " + this.brand +
                ", Year: " + this.year +
                ", Price: " + this.price +
                ", Color: " + this.color +
                ", Quantity: " + this.quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Camry", "Toyota", 2022, 25000.0, "Red", 10);
        System.out.println(car1.toString());

        car1.sell(3);
        System.out.println(car1.toString());

//        System.out.println("Model: " + car1.getModel());
//        System.out.println("Brand: " + car1.getBrand());
//        System.out.println("Year: " + car1.getYear());
//        System.out.println("Price: " + car1.getPrice());
//        System.out.println("Color: " + car1.getColor());
//        System.out.println("Quantity: " + car1.getQuantity());

        car1.setPrice(26000.0);
        car1.setColor("Blue");
        System.out.println(car1.toString());
    }
}