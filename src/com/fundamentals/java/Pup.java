package com.fundamentals.java;
/*
* demonstrates how to define constructors
* patterned after page 56 example
* */

public class Pup {
    private int numberOfFleas;
    public String name;
    public String color;
    public void BarkOut() {
        //define a class method
        System.out.println(this.name + " has " + this.color + " fur; he also has " +
                this.numberOfFleas + " fleas since he\'s wearing a new flea collar.\n");
    }
    public void ChowIn(int nf, String na, String cr) {
        this.numberOfFleas = nf;
        this.name = na;
        this.color = cr;
    }
    //Constructor creation:
    public Pup() {          //constructors have the same name as the class
        System.out.println("The constructor is being barked at.");
        this.numberOfFleas = 0;   //construction initializes the fields
        this.name = "Ruff";       //of object to default values
        this.color = "beige";
    }
}
