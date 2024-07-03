package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AverageSensor implements Sensor {
    private HashMap<String,Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new HashMap<>();
        this.readings = new ArrayList<>();
    }

    public boolean isOn() { // All sensors must be on, on first off it returns false;

        for(String check : sensors.keySet()) {
            if (!(sensors.get(check).isOn())) {
                return false;
            }
        }
        return true;
    }
    
    public void setOn() {
        for(String turn : sensors.keySet()) {
            sensors.get(turn).setOn();
        }
    }

    public void setOff() {
        for(String turn : sensors.keySet()) {
            sensors.get(turn).setOff();
        }
    }

    public int read() {
        if(!(isOn()) || sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum = 0;

        for(String calc : sensors.keySet()) {
            sum += sensors.get(calc).read();
        }
        int average = sum / sensors.size();
        readings.add(average);
        return average;
    }

    public void addSensor(Sensor toAdd) {
        sensors.put(toAdd.toString(), toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

}
