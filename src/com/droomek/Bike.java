package com.droomek;

public class Bike extends Vehicle {
    private String[] bikeSpeedTab = {"0","5","10","20","30","40"};

    Bike(String name, String modelName) {
        super ( name, modelName );
    }

    @Override
    public void start(){
        System.out.println ( getName () + " " + getModelName () + " has started." );
        super.vehicleSpeed (bikeSpeedTab);
    }

    @Override
    public void stop() throws InterruptedException {
        super.stop ();
    }
}
