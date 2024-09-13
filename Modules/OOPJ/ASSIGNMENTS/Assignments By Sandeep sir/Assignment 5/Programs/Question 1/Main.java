package org.example.instancecounter;

public class Main {
	
	public static void main( String[] args ) {
		InstanceCounter i1 = new InstanceCounter();
		InstanceCounter i2 = new InstanceCounter();
		InstanceCounter i3 = new InstanceCounter();		
		
		System.out.println("Number of instances created : " + InstanceCounter.getInstanceCount() );
	}														  

}
