package com.company;

import java.util.Scanner;

public class LastLetters {

    public String lastLetters(String word){
        char[] wordArray = word.toCharArray();
        return wordArray[word.length() - 1] + " " + wordArray[word.length() - 2];
    }
}
