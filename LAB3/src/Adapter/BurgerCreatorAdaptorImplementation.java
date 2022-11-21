package Adapter;

//Class that implements the interface that convert the normal burger in a vegetarian burger
//This class implements the logic of converting the burger
public class BurgerCreatorAdaptorImplementation implements BurgerCreatorAdaptor {
    private BurgerCreator burger;

    public BurgerCreatorAdaptorImplementation(BurgerCreator burger) {
        this.burger = burger;
    }


    @Override
    public String getVegetarianIngredients() {
        return ConvertMeat();
    }

    public String ConvertMeat() {
        String meatType = burger.getBurger();
        if (meatType.equals("chicken") || meatType.equals("pork")) {
            meatType = "becomes burger with tofu";
        } else if (meatType.equals("beef")) {
            meatType = "becomes burger with quinoa";
        }
        return meatType;
    }
}

