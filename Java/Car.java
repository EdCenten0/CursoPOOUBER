package CursoPOOUBER.Java;

public class Car {
    private Integer id;
    private String license;
    private String driver;
    private Integer passenger;

    
    public Car(Integer id, String license, String driver, Integer passenger) {
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
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


    public String getDriver() {
        return driver;
    }


    public void setDriver(String driver) {
        this.driver = driver;
    }


    public Integer getPassenger() {
        return passenger;
    }


    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }
    
    

    
}
