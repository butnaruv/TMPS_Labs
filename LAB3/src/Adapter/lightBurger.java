package Adapter;

//The sub-class of Burger creator that creats the burger based on the meat-type
public class lightBurger implements BurgerCreator {
    public static String meat;

    public lightBurger(meatType meat) {
        this.meat = String.valueOf(meat);
    }

    @Override
    public String getBurger() {
        System.out.println("Burger with " + meat + " meat!");
        return lightBurger.meat;
    }
}

