package com.droomek;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Vehicle vehicle1 = new Vehicle("Furmanka");
        Vehicle vehicle2 = new Vehicle ( "Hulajnoga" );
        Bike bike1 = new Bike ( "Romet","Wigry 4" );
        Car car1 = new Car ( "Mitsubishi", "ASX","1,6" );
        Plane plane1 = new Plane ( "Boening","777" );
        Plane plane2 = new Plane ("Boening", "JumboJet");


        //vehicle1.start ();
        //vehicle1.stop ();
        //bike1.start ();
        //bike1.stop ();
        //car1.start ();
        //car1.stop ();
        //plane1.start ();
        //plane1.stop ();
        //vehicle2.start ();
        //vehicle2.stop ();
        plane2.start ();
        plane2.stop ();

    }
}
