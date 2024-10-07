package employees;

import food.MenuItem;

public interface Employee {
    public String getName();

    public void giveRequest(MenuItem menuItem);

    public void work();
}
