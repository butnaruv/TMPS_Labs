import ListOfItems.BurgerType;
import ListOfItems.CocktailsType;
import ListOfItems.SaladType;
import Memento.SelectSaladIngredients;
import State.Order;
import Strategy.*;
import Template.BurgerTemplate;
import Template.NormalBurger;
import Template.VeganBurger;

import java.util.ArrayList;

import static Memento.CareTakerSalad.doBackup;
import static Memento.CareTakerSalad.undo;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listOfPrices = new ArrayList<>();

        //Strategy
        ItemFromMenu cocktail = new ItemFromMenu();
        BuildItemStrategy cocktailStrategy = new Cocktails(CocktailsType.mojito);
        cocktail.setStrategy(cocktailStrategy);
        cocktail.buildItem();
        listOfPrices.add(cocktail.getPrice());

        ItemFromMenu burger = new ItemFromMenu();
        BuildItemStrategy burgerStrategy = new Burger(BurgerType.chicken);
        burger.setStrategy(burgerStrategy );
        burger.buildItem();
        listOfPrices.add(burger.getPrice());

        ItemFromMenu salad = new ItemFromMenu();
        BuildItemStrategy saladStrategy = new Salad(SaladType.greek);
        salad.setStrategy(saladStrategy);
        salad.buildItem();
        listOfPrices.add(salad.getPrice());

        System.out.print("You have to pay : ");
        ComputePrice.computeTotalPrice(listOfPrices);

        System.out.println();


        //Memento
        SelectSaladIngredients saladIngredients = new SelectSaladIngredients(saladStrategy.getType());
        saladIngredients.getIngredients();
        doBackup(saladIngredients);
        saladIngredients.setGreens("rocket leaves");
        saladIngredients.getIngredients();
        undo(saladIngredients);
        saladIngredients.getIngredients();


        //State
        Order order = new Order();
        order.printStatus();

        //Template
        if(burgerStrategy.getType().equals("vegan")){
            BurgerTemplate burgerTypeNr1 = new VeganBurger();
            burgerTypeNr1.buildBurger();
        } else {
            BurgerTemplate burgerTypeNr2 = new NormalBurger();
            burgerTypeNr2.buildBurger();
        }

        System.out.println();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();

    }
}