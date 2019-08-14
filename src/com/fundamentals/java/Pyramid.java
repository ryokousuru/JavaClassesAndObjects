package com.fundamentals.java;

/*
* demonstrating the use of member functions
* patterned after example on pages 46-47
* */
public class Pyramid {

    public int height;
    public int sidelength;
    public String color;
    public String location;

    public void Showme()  //a class method
    {
        System.out.println("The pharoah\'s pyramid is " + this.height + " feet tall and has a base area of " +
                this.sidelength * this.sidelength + " square feet.");
        System.out.println("It\'s " + this.color + " in color and is located in " + this.location + ".\n");
    }
}
