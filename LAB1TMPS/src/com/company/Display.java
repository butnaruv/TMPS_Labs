package com.company;

import java.util.HashMap;

class Display {
    static void DisplayPercentage(String name, Integer nrOfUnits) {
        SummerSale cost1 = new SummerSale();
        var percentage = cost1.ComputeNormalSalePercentage(nrOfUnits);
        System.out.println("The discount for the " + name + " will be of " + percentage);
    }

    static void DisplayPriceAfterSale(String name, Integer nrOfUnits, Integer price) {
        SummerSale cost1 = new SummerSale();
        System.out.println(name + " will cost after sale " + cost1.PriceAfterSale(price, cost1.ComputeNormalSalePercentage(nrOfUnits)));
        System.out.println();
    }

    static void DisplayTotalIncome(HashMap<Integer, Integer> listOfPrices){
        System.out.print("The total possible income of the store is ");
        System.out.println(TotalPossibleIncome.ComputeTotalIncome(listOfPrices));
        System.out.println();
    }
}
