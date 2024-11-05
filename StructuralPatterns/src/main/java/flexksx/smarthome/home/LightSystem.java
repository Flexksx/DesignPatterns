package flexksx.smarthome.home;

import java.util.ArrayList;
import java.util.HashSet;

import flexksx.smarthome.device.light.bulb.LightBulb;
import flexksx.smarthome.device.light.bulb.LightBulbAdapter;
import flexksx.smarthome.device.light.bulb.LightBulbAdapterFactory;

public class LightSystem {
    private HashSet<LightBulb> lightBulbs;

    public LightSystem() {
        this.lightBulbs = new HashSet<>();
    }

    public void addLightBulbs(ArrayList<LightBulb> lightBulbs) {
        for (LightBulb lightBulb : lightBulbs) {
            this.addLightBulb(lightBulb);
        }
    }

    public void addLightBulb(LightBulb lightBulb) {
        this.lightBulbs.add(lightBulb);
        System.out.println("Added " + lightBulb.getName());
    }

    public void removeLightBulb(LightBulb lightBulb) {
        this.lightBulbs.remove(lightBulb);
    }

    public void turnOnAll() {
        for (LightBulb lightBulb : lightBulbs) {
            LightBulbAdapter adapter = LightBulbAdapterFactory.getAdapter(lightBulb);
            adapter.turnOn();
        }
    }

    public void turnOffAll() {
        for (LightBulb lightBulb : lightBulbs) {
            LightBulbAdapter adapter = LightBulbAdapterFactory.getAdapter(lightBulb);
            adapter.turnOff();
        }
    }

    public void setBrightnessAll(int brightness) {
        for (LightBulb lightBulb : lightBulbs) {
            LightBulbAdapter adapter = LightBulbAdapterFactory.getAdapter(lightBulb);
            try {
                adapter.setBrightness(brightness);
            } catch (Exception e) {
                System.out.println("Error setting brightness for " + lightBulb.getName());
            }
        }
    }

    public void printStatus() {
        for (LightBulb lightBulb : lightBulbs) {
            LightBulbAdapter adapter = LightBulbAdapterFactory.getAdapter(lightBulb);
            String message = "";
            String bulbName = lightBulb.getName();
            message += bulbName + " is ";
            boolean isOn = adapter.isOn();
            if (isOn) {
                message += "on";
            } else {
                message += "off";
            }
            try {
                int brightness = adapter.getBrightness();
                message += " - brightness: " + brightness;
            } catch (Exception e) {
                System.out.println("Error getting brightness for " + lightBulb.getName());
            }
            System.out.println(message);
        }
    }
}