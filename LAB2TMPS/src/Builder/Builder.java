package Builder;

import Builder.Feature.Color;
import Builder.Feature.ProductType;
import Builder.Feature.Flower;
import Builder.Feature.SurpriseType;

public interface Builder {
    void setSurpriseType(SurpriseType surpriseType);
    void setProductType(ProductType product);
    void setNumberOfFlowers(int number);
    void setColorOfFlowers(Color color);
    void setTypeOfFlowers(Flower flower);
}
