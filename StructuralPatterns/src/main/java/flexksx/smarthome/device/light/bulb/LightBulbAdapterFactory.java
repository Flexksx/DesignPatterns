package flexksx.smarthome.device.light.bulb;

import flexksx.smarthome.device.light.bulb.xiaomi.XiaomiLightBulb;
import flexksx.smarthome.device.light.bulb.xiaomi.XiaomiLightBulbAdapter;
import flexksx.smarthome.device.light.bulb.philips.PhilipsLightBulb;
import flexksx.smarthome.device.light.bulb.philips.PhilipsLightBulbAdapter;

public class LightBulbAdapterFactory {
    public static LightBulbAdapter getAdapter(LightBulb lightBulb) {
        switch (lightBulb.getManufacturer()) {
            case PHILIPS:
                return new PhilipsLightBulbAdapter((PhilipsLightBulb) lightBulb);
            case XIAOMI:
                return new XiaomiLightBulbAdapter((XiaomiLightBulb) lightBulb);
            default:
                return null;
        }
    }
}
