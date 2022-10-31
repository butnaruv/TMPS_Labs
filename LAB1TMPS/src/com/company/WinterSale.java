package com.company;

public class WinterSale implements Cost {
    @Override
    public Integer ComputeNormalSalePercentage(Integer nrOfUnits){
        if (nrOfUnits > 30){
            return 40;
        } else if(nrOfUnits % 10 == 0) {
            return (nrOfUnits % 9) + 10;
        } else {
            return (nrOfUnits % 10) + 10;
        }
    }
    @Override
    public Integer PriceAfterSale(Integer price,Integer percentage) {
        return price - (price * percentage  / 100) - 50;
    }
}
