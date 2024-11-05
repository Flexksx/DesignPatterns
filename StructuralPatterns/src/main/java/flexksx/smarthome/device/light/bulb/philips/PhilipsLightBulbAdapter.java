package flexksx.smarthome.device.light.bulb.philips;

import flexksx.smarthome.device.light.bulb.LightBulbAdapter;

public class PhilipsLightBulbAdapter implements LightBulbAdapter {
    private final PhilipsLightBulb philipsLightBulb;

    public PhilipsLightBulbAdapter(PhilipsLightBulb philipsLightBulb) {
        this.philipsLightBulb = philipsLightBulb;
    }

    @Override
    public void turnOn() {
        philipsLightBulb.setOn(true);
        System.out.println(this.philipsLightBulb.getName() + " is turned on");
    }

    @Override
    public void turnOff() {
        philipsLightBulb.setOn(false);
        System.out.println(this.philipsLightBulb.getName() + " is turned off");
    }

    @Override
    public void setBrightness(int brightness) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                this.philipsLightBulb.getName() + " does not support brightness control");
    }

    @Override
    public int getBrightness() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                this.philipsLightBulb.getName() + " does not support brightness control");
    }

    @Override
    public boolean isOn() {
        return philipsLightBulb.isOn();

    }

}
