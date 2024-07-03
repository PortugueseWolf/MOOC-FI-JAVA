package application;

public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value) {

        this.value = value;
    }

    public boolean isOn() { // It's always on
        return true;
    }

    public void setOn() { // It's always on, has no effect
        
    }

    public void setOff() { // It's always on, has no effect

    }

    public int read() {
        return value;
    }
}
