package Factory;

public class FlowersInBasket implements FlowersInterface {

    @Override
    public String createProduct(int number, String type) {
        String basket = "Basket with " + number + " " + type;
        return basket;
    }
}
