package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Value:");
//        String string = scan.nextLine();
//        Integer integer = scan.nextInt();
//                  CHALLENGE 1
//        LastLetters lastLet = new LastLetters();
//        System.out.println(lastLet.lastLetters(string));

        //          CHALLENGE 2
//        FizzBuzz fb = new FizzBuzz();
//        System.out.println(fb.fizzBuzz(integer));

        //          CHALLENGE 3

//       **** my attempt, not sure if correct. ****
//        ^[a-z]{2,6}$[_][0-9]+^@hackerrank.com$



        //          CHALLENGE 4
//            ClosedPath closed = new ClosedPath();
//        System.out.println(closed.closedPath(integer));

        //          CHALLENGE 5
//        String[] prod = {"milk", "eggs", "bread"};
//        String[] price = {"2.99", "3.15", "1.55"};
//        String[] soldProd = {"milk", "bread"};
//        Float[] soldPrice =  {2.99f, 1.57f};
//            PriceCheck pcheck = new PriceCheck();
//        System.out.println(pcheck.priceCheck(prod, price, soldProd, soldPrice));


        //         CHALLENGE 6
//        int n = 4;
//        String[] related = {"1100", "1110", "0110", "0001"};

        //         CHALLENGE 7
        WagonR wagonR = new WagonR(70);
        wagonR.getMileage();
        HondaCity hondaCity = new HondaCity(89);
        hondaCity.getMileage();
        InnovaCrysta innovaCrysta = new InnovaCrysta(95);
        innovaCrysta.getMileage();

        //         CHALLENGE 8
//        Customer Credit Limit
//
//        SELECT id, name FROM customers WHERE country = 'USA' AND credits >= 100000 ORDER BY id;


    }



}