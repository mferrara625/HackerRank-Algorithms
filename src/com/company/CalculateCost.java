package com.company;

import java.util.HashSet;
import java.util.Set;

public class CalculateCost {

    static long getCost(int X, int k, int[] price, int N){
        Set<Integer> numSet = new HashSet<>();
        for(int i : price){
            numSet.add(i);
        }
        long numForgotten = numSet.size() - k;
        if(numForgotten >= 0)
            return numForgotten * X;

        return 0;
    }
}
