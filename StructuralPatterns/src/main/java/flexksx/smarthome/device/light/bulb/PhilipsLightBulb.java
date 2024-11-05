package flexksx.smarthome.device.light.bulb;

public class PhilipsLightBulb {
    private boolean isOn;
    private float colorTemperature;

    public PhilipsLightBulb() {
        this.isOn = false;
        this.colorTemperature = 6500;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public float getColorTemperature() {
        return colorTemperature;
    }

    public void setColorTemperature(float colorTemperature) {
        this.colorTemperature = colorTemperature;
    }

}
