package org.example.instancecounter;

public class InstanceCounter {
	private static int increment;

	public InstanceCounter() {
		increment++;		
	}
	public static int getInstanceCount() {
		return increment;
	}
}
