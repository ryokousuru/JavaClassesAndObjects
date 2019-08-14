package com.fundamentals.java;
    /*
    * Demonstrates the use of multiple objects
    * patterned after example on pages 54 & 55h
    * */
public class Kittens {
    private String name;
    public String color;
    public int length;
    public void ComeOut() {
        System.out.println("This " + this.color + " kitten is named " + this.name +
                " and is " + this.length + " inches long.\n");
    }
    public void ComeIn(String na, String cl, int le) {
        this.name = na;
        this.color = cl;
        this.length = le;
    }
}
