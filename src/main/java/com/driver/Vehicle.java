package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed = 0;
    private int currentDirection = 0;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void steer(int direction) {
        // direction is in degrees, add it to the current direction
        setCurrentDirection(getCurrentDirection() + direction);
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        // set the values of currentSpeed and currentDirection
        this.setCurrentSpeed(speed);
        this.setCurrentDirection(direction);
        System.out.println("move method called - The speed is changed to: " + currentSpeed
                + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop() {
        setCurrentSpeed(0);
        System.out.println("stop method called - The vehicle is stopped");
    }

}
   
