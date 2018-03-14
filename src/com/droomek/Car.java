package com.droomek;


public class Car extends Vehicle {
    private String engineCapacity;
    private String[] checkCarTab = {"computer", "engine", "fluids","brakes"};
    private String[] speedCarTab = {"0","20","80", "100","120","180"};


    Car(String name, String modelName, String engineCapacity) {
        super ( name, modelName );
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() throws InterruptedException {
        super.checkVehicle ( checkCarTab );
        System.out.println ();
        System.out.println ( getName () + " " + getModelName () + " " + engineCapacity + " has started.\n" );
        super.vehicleSpeed ( speedCarTab );
    }

    @Override
    public void stop() {
        System.out.println ( getName () + " " + getName () + " " + engineCapacity + " has stopped." );
    }
}