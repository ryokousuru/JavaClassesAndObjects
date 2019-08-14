package com.fundamentals.java;
/*
* Demonstrating how to use private access modifiers
* patterned after example on page 50
* and the one on pages 51-52
* */
public class Bottle {
    private int stature;
    public String label;
    public void Read() {   //class method declaration
        System.out.println("The bottle is " + this.stature + " inches tall.");
        System.out.println("The front of the bottle reads \'" + this.label + "\'.\n");
    }

    public void Enter(int tall, String reads) {
        /*
        * since this private variable is accessed here within
        * the Bottle class, can avoid the following error:
        * "stature has private access in Bottle"
        * */
        this.stature = tall;
        this.label = reads;
    }
}
