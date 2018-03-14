package com.droomek;

public class Plane extends Vehicle {
    private String[] checkStartPlain = {"computer", "engines", "wings  ","tightness", "brakes"};
    private String[] getCheckStopPlain = {"computer", "engines"};
    private String[] speedPlaneTab = {"0", "200", "500","800","1000","1200"};

    Plane(String name, String modelName) {
        super ( name, modelName );
    }

    @Override
    public void start() throws InterruptedException {
        super.checkVehicle ( checkStartPlain );
        System.out.println ();
        System.out.println ( getName () + " " + getModelName () + " has started.\n" );
        super.vehicleSpeed ( speedPlaneTab );
    }

    @Override
    public void stop() throws InterruptedException {
        Vehicle vehicle2 = new Vehicle ();
        vehicle2.checkVehicle ( getCheckStopPlain );
        System.out.println ();
        System.out.println ( getName () + " " + getModelName () + " has stopped." );
    }
}
