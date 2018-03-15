package com.droomek;


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

    void vehicleSpeed(String[] vehicleSpeed) throws InterruptedException {
        boolean flag = true;
        int speed = 0;
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Current speed " + vehicleSpeed[speed]+" km/h." );
        while (flag) {
            System.out.println ( "Faster write \t \t : \"+\" \n" +
                    "Slower or stop write : \"-\" " );
            String sign = scanner.nextLine ();
            switch (sign) {
                case "+":
                    if (speed == 0 || speed < 5) {
                        speed++;
                        for (int i=0; i< 10 ; i++){
                            TimeUnit.MILLISECONDS.sleep ( 150 );
                            System.out.print ("- ");
                        }
                        System.out.println ();
                        System.out.println ( "Current speed " + vehicleSpeed[speed] + "km/h." );
                    } else
                        System.out.println ( vehicleSpeed[speed] + "km/h is the highest speed." );
                    break;
                case "-":
                    if (speed != 0) {
                        speed--;
                        for (int i=0; i< 10 ; i++){
                            TimeUnit.MILLISECONDS.sleep ( 150 );
                            System.out.print ("- ");
                        }
                        System.out.println ();
                        System.out.println ( "Current speed " + vehicleSpeed[speed] + "km/h." );
                    } else {
                        System.out.println ( "Current speed " + vehicleSpeed[speed] + "km/h." );
                        flag = false;
                    }
                    break;
                default:
                    System.out.println ( "Incorrect value" );
                    break;
            }

        }
    }


    String getName() {
        return name;
    }

    String getModelName() {
        return modelName;
    }
}
