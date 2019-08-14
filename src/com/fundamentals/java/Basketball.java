package com.fundamentals.java;
    /*
    * classes TennisBall and Basketball demonstrate the use
    *of multiple classes - example pages 52-32
    * */
public class Basketball {
    public double radius;
    public double pi;
    public double fourthirds;
    public String color;
    public String material;

    public void Output() {
        System.out.println("The volume of the basketball is " + this.fourthirds *
                this.pi * (Math.pow(radius, 3)) + " cubic inches.");
        System.out.println("It\'s color is " + this.color + " and it's made of " +
                this.material + ".\n");
    }

}
