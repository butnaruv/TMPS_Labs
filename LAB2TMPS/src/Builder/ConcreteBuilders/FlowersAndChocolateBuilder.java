package Builder.ConcreteBuilders;

import Builder.Builder;
import Builder.Feature.Color;
import Builder.Feature.Flower;
import Builder.Feature.ProductType;
import Builder.Feature.SurpriseType;

public class FlowersAndChocolateBuilder implements Builder {
    private SurpriseType surpriseType;
    private ProductType productType;
    private int numberOfFlowers;
    private Color color;
    private Flower flower;

    @Override
    public void setSurpriseType(SurpriseType surpriseType) {
        this.surpriseType = surpriseType;
    }

    @Override
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public void setNumberOfFlowers(int numberOfFlowers) {
        this.numberOfFlowers = numberOfFlowers;
    }

    @Override
    public void setColorOfFlowers(Color color) {
        this.color = color;
    }

    @Override
    public void setTypeOfFlowers(Flower flower) {
        this.flower = flower;
    }

}
