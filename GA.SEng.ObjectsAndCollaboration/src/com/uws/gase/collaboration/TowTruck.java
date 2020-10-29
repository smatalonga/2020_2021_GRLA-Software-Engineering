package com.uws.gase.collaboration;


public class TowTruck extends Truck
{
    public TowTruck(final String name) {
        super(name);
    }
    
    public void action() {
        this.hookCar();
        this.tow();
    }
    
    protected void hookCar() {
        System.out.println("Hooking Car");
    }
    
    protected void tow() {
        System.out.println("Towing Car");
    }
}
