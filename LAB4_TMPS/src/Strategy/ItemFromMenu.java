package Strategy;

import ListOfItems.BurgerType;

public class ItemFromMenu {
    private BuildItemStrategy strategy;

    public void setStrategy(BuildItemStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildItem(){
        strategy.execute();
    }

    public int getPrice(){
        int price = strategy.getPrice();
        return price;
    }

    public String getType(){
        return strategy.getType();
    }
}
