package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        HashMap<Integer, Integer> productsPrices = new HashMap();


        Product product1 = new Product();
        product1.name = "T-shirt";
        product1.price = 899;
        product1.gender = "Male";
        product1.nrOfUnits = 37;
        products.add(product1);
        productsPrices.put(product1.price, product1.nrOfUnits);
        Display.DisplayPercentage(product1.name, product1.nrOfUnits);
        Display.DisplayPriceAfterSale(product1.name, product1.nrOfUnits, product1.price);

        Product product2 = new Product();
        product2.name = "Jeans";
        product2.price = 850;
        product2.gender = "Female";
        product2.nrOfUnits = 18;
        products.add(product2);
        productsPrices.put(product2.price, product2.nrOfUnits);
        Display.DisplayPercentage(product2.name, product2.nrOfUnits);
        Display.DisplayPriceAfterSale(product2.name, product2.nrOfUnits, product2.price);

        Product product3 = new Product();
        product3.name = "Coat";
        product3.price = 775;
        product3.gender = "Male";
        product3.nrOfUnits = 10;
        products.add(product3);
        productsPrices.put(product3.price, product3.nrOfUnits);
        Display.DisplayPercentage(product3.name, product3.nrOfUnits);
        Display.DisplayPriceAfterSale(product3.name, product3.nrOfUnits, product3.price);

        Display.DisplayTotalIncome(productsPrices);
        ProductDetails.IsEnough(product3.nrOfUnits, product3.name);
    }
}

