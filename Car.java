public class Car extends Vehicle {
//Created a Java class named Car that extends Vehicle

    String brand;
    //Added an attribute

    public Car(int numberOfWheels, String color, float engineSize, String fuelType) {
        super(numberOfWheels, color, engineSize, fuelType);

        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }
    //Created a method named honk that prints "Honk, honk!"

    public void displayInfo() {
        System.out.println("Number Of Wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Brand: " + brand);
        //Created methods named displayInfo that prints all the attributes
    }
}
