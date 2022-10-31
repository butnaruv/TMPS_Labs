package com.company;

class SummerSale implements Cost {
    @Override
    public Integer ComputeNormalSalePercentage(Integer nrOfUnits){
        if (nrOfUnits > 30){
            return 25;
        } else if(nrOfUnits % 10 == 0) {
            return (nrOfUnits % 9) + 5;
        } else {
            return (nrOfUnits % 10) + 5;
        }
    }

    @Override
    public Integer PriceAfterSale(Integer price,Integer percentage) {
        return price - (price * percentage / 100);
    }
}
