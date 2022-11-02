package Builder.ConcreteBuilders;

import Builder.Builder;
import Builder.Feature.*;
import Builder.Products.FlowersAndChocolate;
import Builder.Products.FlowersAndPlushToy;

public class FlowersAndPlushToyBuilder implements Builder {
    private SurpriseType surpriseType;
    private ProductType productType;
    private int numberOfFlowers;
    private Color color;
    private Flower flower;
    private ChocolateType chocolateType;
    private PlushToy plushToy;
    private Book book;
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

    @Override
    public void setTypeOfPlushToy(PlushToy plushToy) {
        this.plushToy = plushToy;

    }

    @Override
    public void setTypeOfChocolate(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public void setTypeOfBook(Book book) {
        this.book = book;
    }

    public FlowersAndPlushToy getResult(){
        return new FlowersAndPlushToy(surpriseType, productType, numberOfFlowers, color, flower, plushToy);
    }


}
