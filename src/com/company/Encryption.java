package com.company;

public class Encryption {

    public static String encryption(String s) {
        // Write your code here
        double squared = Math.sqrt(s.length());
        int row = (int) Math.floor(squared);
        int column = (int) Math.ceil(squared);
        String result = "";

        if(row * column < s.length()){
            row++;
        }
        for(int j = 0; j < column; j++){
            for(int i = j; i< s.length(); i+= column){
                System.out.println("t1 "+ s.charAt(i));
                result+= s.charAt(i);
            }
            result += " ";
        }

        return result;
    }

}
