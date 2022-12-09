package Strategy;

import ListOfItems.CocktailsType;

public class Cocktails implements BuildItemStrategy {
    int price = 15;
    CocktailsType cocktailType;

    public Cocktails(CocktailsType cocktailType){
        this.cocktailType = cocktailType;
    }

    public int getPrice() {
        return price;
    }

    public String getType(){
        return cocktailType.toString();
    }

    @Override
    public void execute() {
        System.out.println("The " + cocktailType + " cocktail is added to the list!");
        System.out.println("The price is : " + price);
    }
}
