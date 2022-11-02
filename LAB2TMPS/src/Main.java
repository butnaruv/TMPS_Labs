import Builder.Builder;
import Builder.ConcreteBuilders.FlowersAndBookBuilder;
import Builder.ConcreteBuilders.FlowersAndChocolateBuilder;
import Builder.ConcreteBuilders.FlowersAndPlushToyBuilder;
import Builder.Director;
import Builder.Feature.*;
import Builder.Products.FlowersAndBook;
import Builder.Products.FlowersAndChocolate;
import Builder.Products.FlowersAndPlushToy;
import Factory.FlowersFactory;
import Singleton.Item;
import Singleton.SingeltonItem;

public class Main {
    public static void main(String[] args) {

        //Test singleton design pattern
        SingeltonItem firstPurchase = SingeltonItem.getInstance();
        firstPurchase.AddItems(new Item("11 white roses", 15));
        firstPurchase.AddItems(new Item("15 yellow dahlia", 18));

        SingeltonItem secondPurchase = SingeltonItem.getInstance();
        secondPurchase.AddItems(new Item("18 red roses", 24));
        secondPurchase.AddItems(new Item("19 white lily", 20));

        System.out.println(firstPurchase.Count());
        System.out.println(secondPurchase.Count());

        //Test factory method design pattern
        var product = FlowersFactory.GetTypeOfProduct("Basket");
        if (product != null) {
            System.out.println(product.createProduct(15, "roses"));
        } else {
            System.out.println("No such a product in stock");
        }
        //Test builder design pattern
        Director director = new Director();
        FlowersAndChocolateBuilder _FlowersAndChocolateBuilder = new FlowersAndChocolateBuilder();
        director.createSurpriseWithChocolate(_FlowersAndChocolateBuilder, ProductType.Basket, 15, Color.purple, Flower.Iris, ChocolateType.Milk);
        FlowersAndChocolate flowersAndChocolate = _FlowersAndChocolateBuilder.getResult();
        flowersAndChocolate.print();

        FlowersAndBookBuilder _FlowersAndBookBuilder = new FlowersAndBookBuilder();
        director.createSurpriseWithBookBuilder( _FlowersAndBookBuilder, ProductType.Bouquet, 19, Color.white, Flower.Dahlia, Book.Pe_aripile_vantului);
        FlowersAndBook flowersAndBook = _FlowersAndBookBuilder.getResult();
        flowersAndBook.print();

        FlowersAndPlushToyBuilder _FlowersAndPlushToyBuilder = new FlowersAndPlushToyBuilder();
        director.createSurpriseWithPlushToyBuilder(_FlowersAndPlushToyBuilder, ProductType.Plant_with_Flowers, 1,Color.yellow, Flower.Tulips, PlushToy.Bear);
        FlowersAndPlushToy flowersAndPlushToy = _FlowersAndPlushToyBuilder.getResult();
        flowersAndPlushToy.print();

    }
}