import CursoPOOUBER.Java.Car;

public class UberX  extends Car{
    private String brand;
    private String model;
    
    

    public UberX(Integer id,String license, Account driver, Integer passenger, String brand, String model) {
        super(id, license, driver, passenger);
        this.brand = brand;
        this.model = model;


    }

    public UberX() {
    }

    
}
