package com.company;

public class Encryption {

    public static String encryption(String s) {
        // Write your code here
        int column = (int) Math.ceil(Math.sqrt(s.length()));
        String result = "";

        for(int j = 0; j < column; j++){
            for(int i = j; i< s.length(); i+= column){
                result+= s.charAt(i);
            }
            result += " ";
        }

        return result;
    }

}
