package flexksx.smarthome.device.light.bulb.xiaomi;

import flexksx.smarthome.device.light.bulb.LightBulb;
import flexksx.smarthome.device.light.bulb.manufacturer.LightBulbManufacturer;

public class XiaomiLightBulb extends LightBulb {
    private int brightness;

    public XiaomiLightBulb(String name) {
        super(LightBulbManufacturer.XIAOMI, name);
        this.brightness = 50;
    }

    public XiaomiLightBulb() {
        super(LightBulbManufacturer.XIAOMI);
        this.brightness = 50;
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

}
