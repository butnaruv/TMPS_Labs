package Factory;

public class FlowersInBouquet implements FlowersInterface {
    @Override
    public String createProduct(int number, String type) {
        String bouquet = "Bouquet of " + number + " " + type;
        return bouquet;
    }
}
