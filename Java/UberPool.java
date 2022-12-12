
public class UberPool extends Car{
    private String brand;
    private String model;
    
    public UberPool(Integer id, String license, Account driver, Integer passenger, String brand, String model) {
        super(id, license, driver, passenger);
        this.brand = brand;
        this.model = model;
    }
    public UberPool(Integer id, String license, Account driver, String brand, String model) {
        super(id, license, driver);
        this.brand = brand;
        this.model = model;
    }
    public UberPool(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    

    
    
    
    
    
}
