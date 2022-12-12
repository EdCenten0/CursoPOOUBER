

public class UberX  extends Car{
    private String brand;
    private String model;
    
    

    public UberX(Integer id,String license, Account driver, Integer passenger, String brand, String model) {
        super(id, license, driver, passenger);
        this.brand = brand;
        this.model = model;


    }

    

    public UberX(Integer id, String license, Account driver, String brand, String model) {
        super(id, license, driver);
        this.brand = brand;
        this.model = model;
    }



    public UberX() {
    }

    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.print("Modelo " + this.model);
    }
    
}
