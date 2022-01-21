package com.company;

public class FizzBuzz {


    public StringBuilder fizzBuzz(Integer n){

        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0)
                result.append("FizzBuzz\n");
            else if(i % 3 == 0 && i % 5 != 0)
                result.append("Fizz\n");
            else if(i % 5 == 0 && i % 3 != 0)
                result.append("Buzz\n");
            else
                result.append(i+"\n");
        }
        return result;
    }
}
