package com.company;


import java.util.Arrays;

public class PriceCheck {

    public int priceCheck(String[] products, String[] productPrices, String[] productSold, Float[] soldPrice){
        int result = 0;
        for(int i = 0; i < products.length; i++){
            for(int j = 0; j < productSold.length; j++){
                if(productSold[j].equals(products[i]) && !soldPrice[j].toString().equals(productPrices[i]))
                    result++;
            }
        }
        return result;
    }
}
