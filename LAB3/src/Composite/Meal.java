package Composite;


public class Flower implements ComplexSurprise {
    private String flowerName;
    private int price;
    private int nrOfFlowers;

    public Flower(String flowerName, int price, int nrOfFlowers) {
        this.flowerName = flowerName;
        this.price = price;
        this.nrOfFlowers = nrOfFlowers;
    }

    @Override
    public int calculatePrice() {
        int totalPrice = nrOfFlowers * price;
        System.out.println(nrOfFlowers + " " + flowerName + " are " + totalPrice + " euros.");
        return totalPrice;
    }
}
