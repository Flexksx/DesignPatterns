package flexksx.smarthome.car;

public class ElectricCar implements Car {
    private boolean isLocked;
    private String name;

    public ElectricCar(String name) {
        this.name = name;
        this.isLocked = true;
    }

    @Override
    public void lock() {
        this.isLocked = true;
    }

    @Override
    public void unlock() {
        this.isLocked = false;
    }

    @Override
    public boolean isLocked() {
        return this.isLocked;
    }
}
