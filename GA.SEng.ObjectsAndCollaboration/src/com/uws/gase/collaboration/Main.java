package com.uws.gase.collaboration;
// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    public static void main(String[] args) {
        //example();
    	//exampleInClass();
    	exampleInterfaceInuse();
    }
    
    private static void example() {
        Vehicle truck = (Vehicle)new Truck("Truck");
        Vehicle gt = (Vehicle)new GarbageTruck("GT");
        Vehicle tt = (Vehicle)new TowTruck("TT");
        
        truck.startEngine();
        gt.startEngine();
        tt.startEngine();
        
        GarbageTruck aux = (GarbageTruck)gt;
        aux.repair();
    }
    
    
    private static void exampleInClass() {
    	//Vehicle v = new Vehicle();
    	
    	Truck firstTruck = new Truck("My Frist Truck");
    	Vehicle v = new Truck("My second Truck");
    	
    	//firstTruck.startEngine();
    	
    	GarbageTruck gt = new GarbageTruck("My GT");
    	gt.doNothing();
    	
    	
    	Vehicle v2 = firstTruck;
    	Vehicle v3 = gt;
    	
    	v2.startEngine();
    	v3.startEngine();
    	
    	
    	
    }
  
    
    private static void exampleInterfaceInuse() {
    	GarbageTruck t1 = new GarbageTruck("My GT");
    	
    	t1.startEngine();
    	
    	t1.repair();
    	
    	IRepairableEntity myRepairableEntity = t1;
    	
    	myRepairableEntity.repair();
    	
    	
    	
    	//Truck t2 = new Truck("My Truck");
    	//IRepairableEntity myRepairableEntity2 = (IRepairableEntity) t2;//CAST
    	//myRepairableEntity2.repair();//Explotes at runtim
    	
    	
    }
}
