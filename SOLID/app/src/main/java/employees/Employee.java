package employees;

import food.items.MenuItem;

public interface Employee {
    public String getName();

    public void giveRequest(MenuItem menuItem);

    public void work();
}
