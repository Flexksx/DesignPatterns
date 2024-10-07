package employees;

public class Barman implements Employee {
    private String name;

    public Barman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void work() {
        System.out.println("I'm a barman, I'm working");
    }

}
