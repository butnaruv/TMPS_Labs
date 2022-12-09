package Strategy;

import ListOfItems.BurgerType;

public interface BuildItemStrategy {
    public void execute();
    public int getPrice();

    String getType();
}
