package flexksx.smarthome.user;

public enum UserRole {
    ADMIN, USER, GUEST, CAR_OWNER;

    public static UserRole fromString(String role) {
        switch (role) {
            case "ADMIN":
                return ADMIN;
            case "USER":
                return USER;
            case "GUEST":
                return GUEST;
            case "CAR_OWNER":
                return CAR_OWNER;
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }

    public static String toString(UserRole role) {
        switch (role) {
            case ADMIN:
                return "ADMIN";
            case USER:
                return "USER";
            case GUEST:
                return "GUEST";
            case CAR_OWNER:
                return "CAR_OWNER";
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }
}
