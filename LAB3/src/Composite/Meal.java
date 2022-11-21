package Composite;

//Meal class (leaf) is a basic element of a tree that does not have sub-elements.
// Since the leaf component has no one to delegate the work to, it ends up doing most of the real work.
public class Meal implements ComplexMeal {
    private String mealName;
    private int price;

    public Meal(String mealName, int price) {
        this.mealName = mealName;
        this.price = price;
    }

    @Override
    public int calculatePrice() {
        System.out.println(mealName + " is " + price +  " euros.");
        return price;
    }
}
