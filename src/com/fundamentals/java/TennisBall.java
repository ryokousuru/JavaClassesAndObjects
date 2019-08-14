package com.fundamentals.java;
    /*
    * classes TennisBall and Basketball demonstrate the use
    * of multiple classes - example pages 52-32
    * */
public class TennisBall
    {
    private double radius;  // 1.25 inches
    private double pi; // 3.14159  part of formula for volume of a sphere
    private double fourthirds; // also part of formula for volume of a sphere
    public String color;
    public String material;


    public void Output() {
        System.out.println("The volume of the tennis ball is " + this.fourthirds *
                this.pi * Math.pow(this.radius, 3) + " cubic inches.");
        System.out.println(" The tennis ball is " + this.color + " and it\'s made of "
        + this.material + ".\n");
    }
    public void In(double ra, double p, double ft, String ma, String cr) {
        this.radius = ra;
        this.pi = p;
        this.fourthirds = ft;
        this.material = ma;
        this.color = cr;
    }
}
