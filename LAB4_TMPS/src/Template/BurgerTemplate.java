package Template;

public abstract class BurgerTemplate {
    public final void buildBurger(){
        bakeBread();
        makeSauce();
        fryBase();
        cutVegetables();
        addIngredients();

    }
    public abstract void fryBase();
    public void bakeBread(){
        System.out.println("-> Bread is ready!");
    }
    public void makeSauce(){
        System.out.println("-> Sauce is ready!");
    }
    public void cutVegetables(){
        System.out.println("-> Vegetables are ready!");
    }
    public void addIngredients(){
        System.out.println("------Your burger is ready!------");
    }

}
