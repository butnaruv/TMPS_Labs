package Factory;

public class FlowersFactory {
    public static FlowersInterface GetTypeOfProduct(String typeOfProduct){
        FlowersInterface product = null;
        if(typeOfProduct == "Basket"){
            product = new FlowersInBasket();
        } else if(typeOfProduct == "Bouquet"){
            product = new FlowersInBouquet();
        }else {
            return null;
        }
        return product;
    }
}
