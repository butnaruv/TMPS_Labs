import Factory.FlowersFactory;
import Factory.FlowersInterface;
import Singleton.Item;
import Singleton.SingeltonItem;

public class Main {
    public static void main(String[] args) {

        //Test singelton design pattern
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

    }
}