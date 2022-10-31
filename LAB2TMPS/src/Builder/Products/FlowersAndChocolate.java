package Builder.Products;

import Builder.Feature.Color;
import Builder.Feature.Flower;
import Builder.Feature.ProductType;
import Builder.Feature.SurpriseType;

public class FlowersAndChocolate {
    private final SurpriseType surpriseType;
    private final ProductType productType;
    private final int numberOfFlowers;
    private final Color color;
    private final Flower flower;

    public FlowersAndChocolate(SurpriseType surpriseType, ProductType productType, int numberOfFlowers, Color color, Flower flower, int numberOfSurprises) {
        this.surpriseType = surpriseType;
        this.productType = productType;
        this.numberOfFlowers = numberOfFlowers;
        this.color = color;
        this.flower = flower;
    }
    public SurpriseType getSurpriseType(){
        return surpriseType;
    }

    public ProductType getProductType(){
        return productType;
    }

    public int getNumberOfFlowers(){
        return numberOfFlowers;
    }

    public Color getColorOfFlowers(){
        return color;
    }

    public Flower getTypeOfFlowers(){
        return flower;
    }
}
