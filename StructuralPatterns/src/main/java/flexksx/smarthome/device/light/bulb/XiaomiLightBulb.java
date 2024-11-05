package flexksx.smarthome.device.light.bulb;

public class XiaomiLightBulb {
    private int brightness;
    private float colorTemperature;

    public XiaomiLightBulb() {
        this.brightness = 0;
        this.colorTemperature = 6500;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;
        }
    }

    public float getColorTemperature() {
        return colorTemperature;
    }

    public void setColorTemperature(float colorTemperature) {
        this.colorTemperature = colorTemperature;
    }
}
