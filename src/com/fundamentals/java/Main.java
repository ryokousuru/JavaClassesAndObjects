package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {
	/*
	* page 45 example; an object of the class
	*/

	Cloud cl = new Cloud();  //object name is cl
    //assign values to the properties of the Cloud object
    cl.width = 4;
    cl.length = 5;
    cl.height = 7;
    cl.color = "white";
    cl.direction = "westbound";

    //display property values of the Cloud object
    System.out.println("That cloud is " + cl.width + " feet wide and " +
            cl.length + " feet long and " + cl.height + " feet tall.");
    System.out.println("It\'s a " + cl.color + " cloud and it\'s direction is " + cl.direction + ".\n");


    //pages 46-47 example demonstrates use of member function
    Pyramid py = new Pyramid(); //object creation; object name = py; is for the Pyramid class
        py.height = 500;
        py.sidelength = 900;
        py.color = "gold";
        py.location = "Alexandria";

        py.Showme();  //calling the method

        //An object for the Cone class
        Cone co = new Cone();
        co.Into(1.5, 5, .3333, 3.14159, "beige", "ice cream", "waffle");

        co.Ad();   //Calling the Ad method of the Cone class

        Bottle bo = new Bottle();   //bo is a new object of the Bottle class
        bo.Enter(7, "A&W");

        bo.Read();  //calling the "Read" method in the Bottle class/

        TennisBall te = new TennisBall();   // an object of the TennisBall class
        te.In(1.25, 3.14159, 1.3333, "mint", "wool");
        te.Output();

        Basketball ba = new Basketball();
        ba.radius = 4.75;
        ba.pi = 3.14159;
        ba.fourthirds = 1.3333;
        ba.color = "yellow";
        ba.material = "rubber";
        ba.Output();

        // 2 objects lfor the Kittens class
        Kittens kit = new Kittens();
        kit.ComeIn("Adele", "white and black", 8);
        kit.ComeOut();

        Kittens kit1 = new Kittens();
        kit1.ComeIn("Amelie", "white and brown", 9);
        kit1.ComeOut();

        //an object of the Pup class
        Pup puppy = new Pup();
        puppy.BarkOut();

        //an object of the TrafficSignal class
        TrafficSignal tf = new TrafficSignal(19, "yellow", "17th & Walnut", "Southwest");
        tf.ShineOut();

        //an object of the Hand class
        Hand hd = new Hand(5, "flat");
        Hand.Abacus+=4;
        hd.ShowIt();
        System.out.println("The number of fingers is " + Hand.Abacus + " and one thumb.");


    } //end of the main method
} // end of the Main class
