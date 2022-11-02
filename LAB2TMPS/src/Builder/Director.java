package Builder;

import Builder.Feature.*;

import static Builder.Feature.SurpriseType.Book;

public class Director {
    public void createSurpriseWithChocolate(Builder builder, ProductType productType, int numberOfFlowers, Color color, Flower flower, ChocolateType chocolateType){
        builder.setSurpriseType(SurpriseType.Chocolate);
        builder.setProductType(productType);
        builder.setNumberOfFlowers(numberOfFlowers);
        builder.setColorOfFlowers(color);
        builder.setTypeOfFlowers(flower);
        builder.setTypeOfChocolate(chocolateType);
    }
    public void createSurpriseWithPlushToyBuilder(Builder builder, ProductType productType, int numberOfFlowers, Color color, Flower flower, PlushToy plushToy){
        builder.setSurpriseType(SurpriseType.PlushToy);
        builder.setProductType(productType);
        builder.setNumberOfFlowers(numberOfFlowers);
        builder.setColorOfFlowers(color);
        builder.setTypeOfFlowers(flower);
        builder.setTypeOfPlushToy(plushToy);

    }
    public void createSurpriseWithBookBuilder(Builder builder, ProductType productType, int numberOfFlowers, Color color, Flower flower, Book book){
        builder.setSurpriseType(SurpriseType.PlushToy);
        builder.setProductType(productType);
        builder.setNumberOfFlowers(numberOfFlowers);
        builder.setColorOfFlowers(color);
        builder.setTypeOfFlowers(flower);
        builder.setTypeOfBook(book);

    }

}
