package com.fundamentals.java;

/*
* Another way of using methods apart from the example of the Pyramid class
* patterned after example on pages 48-49
 */

public class Cone {
    public double radiusOfBase;    //1.5 inches
    public int height;          //5 inches  / cone volume will be 1/3 x H x pi (3.14159) x r x r
    public double onethird;     //part of the formula for the volume of a cone; 1/3
    public double pi;           //another part of the formula for the volume of a cone
    public String color;
    public String type;
    public String material;

    public void Ad() {  //class method
        System.out.println("The volume of the cone is " + this.onethird * this.height *
                this.pi * (Math.pow(this.radiusOfBase, 2)) + " cubic inches.");
        System.out.println("It\'s a " + this.color + " " + this.type + " cone.");
        System.out.println("This particular " + this.type + " cone is a " + this.material + " cone.\n");
    }

    public void Into(double ra, int he, double on, double pie, String col, String ic, String wa)
    {
        this.radiusOfBase = ra;
        this.height = he;
        this.onethird = on;
        this.pi = pie;
        this.color = col;
        this.type = ic;
        this.material = wa;
    }
}