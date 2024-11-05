package flexksx.smarthome.device.light.bulb;

public interface LightBulbAdapter {
    void turnOn();

    void turnOff();

    void setBrightness(int brightness);

    int getBrightness();

    boolean isOn();
}
