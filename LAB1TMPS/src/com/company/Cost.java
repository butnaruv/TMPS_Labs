package com.company;

public interface Cost {
    public Integer ComputeNormalSalePercentage(Integer nrOfUnits);
    public Integer PriceAfterSale(Integer price,Integer percentage);

}
