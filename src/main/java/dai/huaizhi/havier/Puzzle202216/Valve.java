package dai.huaizhi.havier.Puzzle202216;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Valve {
    private final String id;
    private int index;
    private final List<String> connectedValves = new ArrayList<>();
    private final int pressure;
    private HashMap<String, Integer> minutesNeeded = new HashMap<>();

    Valve(String id, int pressure) {
        this.id = id;
        this.pressure = pressure;
    }

    public void addConnectedValve(String valveId){
        connectedValves.add(valveId);
    }


    public int getPressure() {
        return pressure;
    }

    public void setMinutesNeededOfOneOtherValve(String id, int minutes) {
        minutesNeeded.put(id, minutes);
    }

    public String getId() {
        return id;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public List<String> getConnectedValves() {
        return connectedValves;
    }

}
