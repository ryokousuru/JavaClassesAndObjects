package com.fundamentals.java;
/*
* demonstrating how to work with static members
* patterned after example on pages 60 and 61
* */

import java.rmi.StubNotFoundException;

public class Hand {

    private int quantity;
    public String palm;
    public static int Abacus=0;

    public void ShowIt()
    {
        System.out.println("The number of fingers is " + this.quantity + ".");
        System.out.println("The palm is " + this.palm + ".");
    }

    public Hand() {
        System.out.println("The constructor can use either hand.");
        this.quantity = 5;
        this.palm = "outstretched";
    }

    public Hand(int qu, String pa) {
        this.quantity = qu;
        this.palm = pa;
    }
}
