package Strategy;

import ListOfItems.SaladType;

public class Salad implements BuildItemStrategy {
    int price = 10;
    SaladType saladName;

    public Salad(SaladType saladName){
        this.saladName = saladName;
    }

    @Override
    public void execute() {
        System.out.println( "The " + saladName + " salad is added to the list!");
        System.out.println("The price is : " + price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return saladName.toString();
    }
}
