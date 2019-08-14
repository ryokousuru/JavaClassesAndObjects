package com.fundamentals.java;
/*
* demonstrating how to wrok with  parameterized constructors
* patterned after example on pages 58-59
* */
public class TrafficSignal {
    private int distance;
    public String color;
    public String intersection;
    public String corner;

    public void ShineOut() {
        System.out.println("The traffic signal that\'s lit up " + this.color +
                " is " + this.distance + " feet above the ground.");
        System.out.println("It\'s over there on the " + this.corner + " of "
                + this.intersection + ".\n");
    }

    public void DriveIn(int ds, String co, String in, String cn) {
        this.distance = ds;
        this.color = co;
        this.intersection = in;
        this.corner = cn;
    }

    public TrafficSignal() {
        System.out.println("The constructor is being shined on."); //object in Main class has parameters,
        this.distance = 20;                                     //so the parameters here are not returned
        this.color = "yellow";
        this.intersection = "10th & Main";
        this.corner = "Northwest";
    }

    public TrafficSignal(int ds, String co, String in, String cn)  //Constructor takes in parameters
    {
        this.distance = ds;
        this.color = co;
        this.intersection = in;
        this.corner = cn;
    }
}