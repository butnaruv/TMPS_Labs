package Builder.Products;

import Builder.Feature.*;

public class FlowersAndChocolate {
    private final SurpriseType surpriseType;
    private final ProductType productType;
    private final int numberOfFlowers;
    private final Color color;
    private final Flower flower;
    private final ChocolateType chocolateType;

    public FlowersAndChocolate(SurpriseType surpriseType, ProductType productType, int numberOfFlowers, Color color, Flower flower, ChocolateType chocolateType) {
        this.surpriseType = surpriseType;
        this.productType = productType;
        this.numberOfFlowers = numberOfFlowers;
        this.color = color;
        this.flower = flower;
        this.chocolateType = chocolateType;
    }

    public SurpriseType getSurpriseType() {
        return surpriseType;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    public Color getColorOfFlowers() {
        return color;
    }

    public Flower getTypeOfFlowers() {
        return flower;
    }

    public ChocolateType getTypeOfChocolate() {
        return chocolateType;
    }

    public void print() {
        System.out.println();
        System.out.println("----Details about your choice----");
        System.out.println("Surprise type: " + getSurpriseType());
        System.out.println("Presentation of flowers: " + getProductType());
        System.out.println("Number of flowers: " + getNumberOfFlowers());
        System.out.println("Color of flowers: " + getColorOfFlowers());
        System.out.println("Type of flowers: " + getTypeOfFlowers());
        System.out.println("Type of chocolate: " + getTypeOfChocolate());

    }

}
