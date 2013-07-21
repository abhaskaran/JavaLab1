/*
 * This is the Main class for this project
 */
package org.ashwini.basics;

public class Main {

	public static void main(String[] args) {
		
		Horse h1 = new Horse();		
		printObject(h1);
		System.out.println();
		Horse h2 = new Horse();
		printObject(h2);

	}
//Private utility method to print Horse Object details
	private static void printObject(Horse MyHorse) {
		
		System.out.println("The Breed of horse is: " + MyHorse.breed);
		System.out.println("The color of horse is: " + MyHorse.color);
		System.out.println("The height of horse is :" + MyHorse.height);
		System.out.println("The weight of horse is: " + MyHorse.weight);
		System.out.println("The purpose of horse is: " + MyHorse.purpose);
		System.out.println("Hash code for String object: " + MyHorse.hashCode());
	}
	
}
