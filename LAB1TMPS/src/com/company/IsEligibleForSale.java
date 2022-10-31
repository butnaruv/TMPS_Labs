package com.company;

public class IsEligibleForSale {
    public boolean EligibleForSummerSale(Integer nrOfUnits, String name){
        if(nrOfUnits > 10 && ( name.equals("T-shirt" )|| name.equals("Dress"))){
            return true;
        }else {
            return false;
        }
    }
    public boolean EligibleForWinterSale(Integer nrOfUnits, String name){
        if(nrOfUnits > 10 && ( name.equals("Coat" )|| name.equals("Jeans"))){
            return true;
        }else {
            return false;
        }
    }
}
