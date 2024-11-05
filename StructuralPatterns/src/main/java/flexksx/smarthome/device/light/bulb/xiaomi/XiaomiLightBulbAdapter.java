package flexksx.smarthome.device.light.bulb.xiaomi;

import flexksx.smarthome.device.light.bulb.LightBulbAdapter;

public class XiaomiLightBulbAdapter implements LightBulbAdapter {
    private final XiaomiLightBulb xiaomiLightBulb;

    public XiaomiLightBulbAdapter(XiaomiLightBulb xiaomiLightBulb) {
        this.xiaomiLightBulb = xiaomiLightBulb;
    }

    @Override
    public void setBrightness(int brightness) {
        xiaomiLightBulb.setBrightness(brightness);
    }

    @Override
    public int getBrightness() {
        return xiaomiLightBulb.getBrightness();
    }

    @Override
    public void turnOn() {
        xiaomiLightBulb.setBrightness(100);
        System.out
                .println(xiaomiLightBulb.getName() + " is turned on - brightness: " + xiaomiLightBulb.getBrightness());
    }

    @Override
    public void turnOff() {
        xiaomiLightBulb.setBrightness(0);
        System.out
                .println(xiaomiLightBulb.getName() + " is turned off - brightness: " + xiaomiLightBulb.getBrightness());
    }

    @Override
    public boolean isOn() {
        return xiaomiLightBulb.getBrightness() > 0;
    }

}
