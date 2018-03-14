package com.droomek;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Vehicle {
    private String name;
    private String modelName;
    private String[] vehicleSpeed = {"0", "1", "5", "10", "20", "30"};

    Vehicle() {
    }

    Vehicle(String name) {
        this.name = name;
    }

    Vehicle(String name, String modelName) {
        this.name = name;
        this.modelName = modelName;
    }

    public void start() throws InterruptedException {
        System.out.println ( name + " has started." );
        Vehicle vehicle = new Vehicle ();
        vehicle.vehicleSpeed ( vehicleSpeed );

    }

    public void stop() throws InterruptedException {
        System.out.println ( name + " has stopped." );
    }

    public void checkVehicle(String[] checkVehicleTab) throws InterruptedException {

        System.out.println ( "Checking procedure:" );
        for (String tab : checkVehicleTab) {
            TimeUnit.MILLISECONDS.sleep ( 400 );
            System.out.print ( "checking " + tab );
            for (int k = 0; k < 5; k++) {
                TimeUnit.MILLISECONDS.sleep ( 200 );
                System.out.print ( "." );
            }
            System.out.println ( "\tOK" );
            TimeUnit.MILLISECONDS.sleep ( 400 );
        }
    }

    public void vehicleSpeed(String[] vehicleSpeed) {
        boolean flag = true;
        int speed = 0;
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Current speed " + vehicleSpeed[speed]+" km/h." );
        while (flag) {
            System.out.println ( "Faster write \"+\" \n" +
                    "Slower write \"-\" " );
            String sign = scanner.nextLine ();
            if (sign.equals ( "+" )) {
                if (speed == 0 || speed <5){
                speed++;
                System.out.println ( "Current speed " + vehicleSpeed[speed] + "km/h." );
                }
                else
                    System.out.println ( vehicleSpeed [speed] + "km/h is the highest speed.");
            } else if (sign.equals ( "-" )){
                if (speed !=0) {
                    speed--;
                    System.out.println ( "Current speed " + vehicleSpeed[speed] + "km/h." );
                }else {
                    System.out.println ( "Current speed " + vehicleSpeed[speed] + "km/h." );
                    flag = false;
                }
            }
            else{
                System.out.println ("Incorrect value");
            }

        }
    }


    public String getName() {
        return name;
    }

    public String getModelName() {
        return modelName;
    }
}
