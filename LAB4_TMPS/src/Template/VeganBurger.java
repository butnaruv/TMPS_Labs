package Template;

public class VeganBurger extends BurgerTemplate {
    @Override
    public void fryBase() {
        System.out.println("-> The vegan meatball is ready!");
    }
}
