package com.company;

class ProductDetails {
    static void IsEnough(Integer nrOfUnits, String name) {
        if (nrOfUnits < 10) {
            System.out.println("The stock of " + name+ "s is full");
        } else System.out.println("The stock of " + name + "s need to be supplied");
    }

}
