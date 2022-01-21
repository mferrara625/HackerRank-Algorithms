package com.company;

public class ClosedPath {

    public int closedPath(int number){
        char[] nums = Integer.toString(number).toCharArray();
        int result = 0;
        for(char num : nums){
            if(num == '0' || num == '4' || num == '6' || num == '9')
                result += 1;
            else if(num == '8')
                result += 2;

        }
        return result;
    }
}
