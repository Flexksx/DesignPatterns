package flexksx.smarthome.device.light.bulb.manufacturer;

public enum LightBulbManufacturer {
    XIAOMI,
    PHILIPS;

    public static LightBulbManufacturer fromString(String manufacturer) {
        switch (manufacturer.toLowerCase()) {
            case "xiaomi":
                return XIAOMI;
            case "philips":
                return PHILIPS;
            default:
                return null;
        }
    }

    public static String toString(LightBulbManufacturer manufacturer) {
        switch (manufacturer) {
            case XIAOMI:
                return "Xiaomi";
            case PHILIPS:
                return "Philips";
            default:
                return null;
        }
    }

}
