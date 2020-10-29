package com.uws.gase.collaboration;
// 
// Decompiled by Procyon v0.5.36
// 

public abstract class Vehicle
{
    private String name;
    
    public Vehicle(final String aName) {
        this.name = aName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void startEngine() {
        System.out.println("Starting engine");
        this.moveWheels();
        this.action();
    }
    
    public abstract void moveWheels();
    
    public abstract void action();
    
    @Override
    public String toString() {
        return this.getName();
    }
}
