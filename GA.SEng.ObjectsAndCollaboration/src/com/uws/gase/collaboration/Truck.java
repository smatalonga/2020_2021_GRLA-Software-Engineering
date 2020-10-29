package com.uws.gase.collaboration;

public class Truck extends Vehicle
{
    public Truck(final String name) {
        super(name);
    }
    
    
    public void doNothing() {
    	
    }
    
    public void moveWheels() {
        System.out.println("Moving Wheels");
    }
    
    public void action() {
        this.moveWheels();
    }
}
