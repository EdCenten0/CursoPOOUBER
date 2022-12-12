

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passenger;

    
    public Car(Integer id, String license, Account driver, Integer passenger) {
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    


    public Car(Integer id, String license, Account driver) {
        this.id = id;
        this.license = license;
        this.driver = driver;
    }




    public Car() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getLicense() {
        return license;
    }


    public void setLicense(String license) {
        this.license = license;
    }


    public Account getDriver() {
        return driver;
    }


    public void setDriver(Account driver) {
        this.driver = driver;
    }


    public Integer getPassenger() {
        return passenger;
    }


    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passenger = passenger;
        }
        else{
            System.out.println("Necesitas tener 4 pasajeros");
        }
    }

    void printDataCar() {
        if(passenger != null){
            System.out.println("License: " + license + " Name Driver: " + this.driver.getNombre() + " Passengers: " + this.passenger);
        }
        
    }
    
    

    
}
