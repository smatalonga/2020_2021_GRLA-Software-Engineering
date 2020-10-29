package com.uws.gase.collaboration;
 

public class GarbageTruck extends Truck implements IRepairableEntity
{
    public GarbageTruck(final String name) {
        super(name);
    }
    
    @Override
    public void action() {
        this.hookBin();
        this.lift();
    }
    
    protected void hookBin() {
        System.out.println("\tHooking Bin");
    }
    
    protected void lift() {
        System.out.println("\tLifting Bin");
    }
    
    /*public void fix() {
        System.out.println("doing fix");
    }*/
    
    @Override
    public void repair() {
        System.out.println("Repairing"+this.getName());
    }
}
