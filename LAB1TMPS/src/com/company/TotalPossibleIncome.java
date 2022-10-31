package com.company;

import java.util.*;


class TotalPossibleIncome {
    static Integer ComputeIncome(Integer nrOfUnits, Integer price){
        return nrOfUnits * price;
    }
    static Integer ComputeTotalIncome(HashMap<Integer, Integer> listOfPrices){
        int sum = 0;
        Set<Map.Entry<Integer, Integer>> setList = listOfPrices.entrySet();
        for (Map.Entry<Integer,Integer> value : setList) {
            sum += (value.getValue() * value.getKey());
        }
        return sum;
    }
}
