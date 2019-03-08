package za.ac.cput;

public class Car {
    private String brand;
    private String make;
    private String color;

    public Car(String brand, String make, String color) {
        this.brand = brand;
        this.make = make;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                "}\n";
    }
}
