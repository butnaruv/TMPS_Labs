package Builder;

import Builder.Feature.*;

public interface Builder {
    void setSurpriseType(SurpriseType surpriseType);

    void setProductType(ProductType productType);

    void setNumberOfFlowers(int numberOfFlowers);

    void setColorOfFlowers(Color color);

    void setTypeOfFlowers(Flower flower);

    void setTypeOfPlushToy(PlushToy plushToy);

    void setTypeOfChocolate(ChocolateType chocolateType);

    void setTypeOfBook(Book book);
}
