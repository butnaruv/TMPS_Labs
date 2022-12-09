package Strategy;

import ListOfItems.BurgerType;

public class Burger implements BuildItemStrategy {
    int price;
    BurgerType type;
    public Burger(BurgerType type){
        this.type = type;
        setPrice();
    }

    public void setPrice() {
        if(type.equals("vegan"))
        this.price = 40;
        else this.price = 25;
    }

    public String getType() {
        return type.toString();
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void execute() {
        System.out.println("The " + type + " burger is added to the list!");
        System.out.println("The price is : " + price);
    }


}
