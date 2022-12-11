package CursoPOOUBER.Java;

import java.util.ArrayList;

public class Route {
    private Integer id;
    private ArrayList<Double> start;
    private ArrayList<Double> end;
    
    public Route() {
    }

    public Route(Integer id, ArrayList<Double> start, ArrayList<Double> end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Double> getStart() {
        return start;
    }

    public void setStart(ArrayList<Double> start) {
        this.start = start;
    }

    public ArrayList<Double> getEnd() {
        return end;
    }

    public void setEnd(ArrayList<Double> end) {
        this.end = end;
    }
    
    
}
