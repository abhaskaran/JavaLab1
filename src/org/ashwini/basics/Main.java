package org.ashwini.basics;

public class Main {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.breed = "Arabian Quarter";
		h1.color = "White";
		h1.height = 9;
		h1.weight = 540;
		h1.purpose = "Racing";
		printObject(h1);
		System.out.println();
		Horse h2 = new Horse();
		printObject(h2);

	}

	public static void printObject(Horse MyHorse) {
		
		System.out.println("The Breed of horse is: " + MyHorse.breed);
		System.out.println("The color of horse is: " + MyHorse.color);
		System.out.println("The height of horse is :" + MyHorse.height);
		System.out.println("The weight of horse is: " + MyHorse.weight);
		System.out.println("The purpose of horse is: " + MyHorse.purpose);
		System.out.println("Hash code for String object: " + MyHorse.hashCode());
	}
	
}
