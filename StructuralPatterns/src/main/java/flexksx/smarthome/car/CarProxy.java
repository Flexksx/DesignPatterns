package flexksx.smarthome.car;

import java.util.Set;

import flexksx.smarthome.user.User;
import flexksx.smarthome.user.UserRole;

public class CarProxy implements Car {
    private final ElectricCar car;
    private final User user;
    private Set<UserRole> allowedRoles = Set.of(UserRole.ADMIN, UserRole.CAR_OWNER);

    public CarProxy(ElectricCar car, User user) {
        this.car = car;
        this.user = user;
    }

    @Override
    public void lock() {
        if (allowedRoles.contains(user.getRole())) {
            car.lock();
        } else {
            System.out.println("You are not allowed to lock the car.");
        }
    }

    @Override
    public void unlock() {
        if (allowedRoles.contains(user.getRole())) {
            car.unlock();
        } else {
            System.out.println("You are not allowed to stop the car.");
        }
    }

    @Override
    public boolean isLocked() {
        return car.isLocked();
    }

}
