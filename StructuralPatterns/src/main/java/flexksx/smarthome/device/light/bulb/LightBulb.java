package flexksx.smarthome.device.light.bulb;

import flexksx.smarthome.device.light.bulb.manufacturer.LightBulbManufacturer;

public class LightBulb {
    private LightBulbManufacturer manufacturer;
    private String name;

    public LightBulb(LightBulbManufacturer manufacturer, String name) {
        this.manufacturer = manufacturer;
        this.name = name;
    }

    public LightBulb(LightBulbManufacturer manufacturer) {
        this.manufacturer = manufacturer;
        this.name = "Light Bulb";
    }

    public LightBulbManufacturer getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

}
