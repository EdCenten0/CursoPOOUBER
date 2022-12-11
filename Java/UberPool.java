import CursoPOOUBER.Java.Car;

public class UberPool extends Car{
    private String brand;
    private String model;
    
    

    public UberPool(String license, Account driver, Integer passenger, String brand, String model) {
        super(license, driver, passenger);
        this.brand = brand;
        this.model = model;


    }

    public UberX() {
    }

    
}
