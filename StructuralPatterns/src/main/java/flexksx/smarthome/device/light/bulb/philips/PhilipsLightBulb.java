package flexksx.smarthome.device.light.bulb.philips;

import flexksx.smarthome.device.light.bulb.LightBulb;
import flexksx.smarthome.device.light.bulb.manufacturer.LightBulbManufacturer;

public class PhilipsLightBulb extends LightBulb {
    private boolean isOn;

    public PhilipsLightBulb(String name) {
        super(LightBulbManufacturer.PHILIPS, name);
        this.isOn = false;
    }

    public PhilipsLightBulb() {
        super(LightBulbManufacturer.PHILIPS);
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

}
