import java.util.ArrayList;
import java.util.Map;

public class UberBlack  extends Car{

    private Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    public UberBlack(Integer id, String license, Account driver, Integer passenger,
            Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(id, license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    public UberBlack(Integer id, String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(id, license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    public UberBlack(Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    public Map<String, Map<String, Integer>> getTypeCarAccepted() {
        return typeCarAccepted;
    }
    public void setTypeCarAccepted(Map<String, Map<String, Integer>> typeCarAccepted) {
        this.typeCarAccepted = typeCarAccepted;
    }
    public ArrayList<String> getSeatsMaterial() {
        return seatsMaterial;
    }
    public void setSeatsMaterial(ArrayList<String> seatsMaterial) {
        this.seatsMaterial = seatsMaterial;
    }

    
    

}