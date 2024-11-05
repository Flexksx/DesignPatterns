package flexksx.smarthome;

import java.util.ArrayList;

import flexksx.smarthome.device.light.bulb.LightBulb;
import flexksx.smarthome.device.light.bulb.philips.PhilipsLightBulb;
import flexksx.smarthome.device.light.bulb.xiaomi.XiaomiLightBulb;
import flexksx.smarthome.home.LightSystem;

public class Main {
    public static void main(String[] args) {
        ArrayList<LightBulb> xiaomiLightBulb = new ArrayList<LightBulb>();
        xiaomiLightBulb.add(new XiaomiLightBulb("Xiaomi Light Bulb 1"));
        xiaomiLightBulb.add(new XiaomiLightBulb("Xiaomi Light Bulb 2"));
        ArrayList<LightBulb> philipsLightBulb = new ArrayList<LightBulb>();
        philipsLightBulb.add(new PhilipsLightBulb("Philips Light Bulb 1"));
        philipsLightBulb.add(new PhilipsLightBulb("Philips Light Bulb 2"));

        LightSystem lightSystem = new LightSystem();
        lightSystem.addLightBulbs(xiaomiLightBulb);
        lightSystem.addLightBulbs(philipsLightBulb);
        lightSystem.turnOnAll();
        lightSystem.turnOffAll();
        lightSystem.setBrightnessAll(50);
        lightSystem.printStatus();
    }
}