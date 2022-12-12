import java.util.ArrayList;
import java.util.Map;

public class UberVan  extends Car{

    private Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    

    public UberVan(Integer id, String license, Account driver, Integer passenger,
            Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(id, license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(Integer id, String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(id, license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(Integer passenger) {
        // TODO Auto-generated method stub
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas 6 pasajeros");
        }
            


    }
    

}