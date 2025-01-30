public class Vehicle {
//Created a Java class named Vehicle

    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;
    //Added the following attributes

    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }
    //Created constructors that set all the attributes

    public int getnumberOfWheels() {
        return numberOfWheels;

    }

    public void setnumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }


    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }


    public float getengineSize () {
        return engineSize;
    }

    public void setengineSize(float engineSize){
        this.engineSize = engineSize;
    }

    public String getfuelType() {
        return fuelType;
    }


    public void setfuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
//Created getters and setters for each attribute