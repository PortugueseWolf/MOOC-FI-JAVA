package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean power;

    public TemperatureSensor() {
        this.power = false;
    }

    public boolean isOn() { // It's always on
        return power;
    }

    public void setOn() { // It's always on, has no effect
        power = true;
    }

    public void setOff() { // It's always on, has no effect
        power = false;
    }

    public int read() {
        if (power) {
            return new Random().nextInt(61) - 30; // Return value between -30 and 30
        }
        throw new IllegalStateException();
    }
}
