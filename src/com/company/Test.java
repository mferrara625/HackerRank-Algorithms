package com.company;

import java.time.LocalDate;

public class Test {

    public Test(){}

    public long test1(){
        return LocalDate.now().toEpochDay();
    }
}
