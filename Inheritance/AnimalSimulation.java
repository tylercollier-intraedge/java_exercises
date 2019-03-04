/**
 * Assume you are coding an animal related game where you dump some random animals 
 * in the middle of the screen and they run to their resting places to eat and sleep.
 * Assume that these animals have common properties like weight and runningSpeed.
 * 
 * Write a program to create 20 random animals from this list:
 * Lion - stays in a den, eats meat
 * Tiger - stays in a den, eats meat
 * Hippo - stays in water, eats plants
 * Cat - stays at home, eats meat
 * Rooster - stays at cage, eats plants
 * Rabbit - stays in a burrow, eats plants
 * 
 * First create your inheritance hierarchy (superclasses and subclasses)
 * Then instantiate an array to hold 20 animals (Animal[] animals = new Animal[20])
 * Write code to generate a random number between 1 and 6
 * 1 represents a Lion
 * 2 represents a Tiger
 * 3 represents a Hippo
 * 4 represents a Cat
 * 5 represents a Rooster
 * 6 represents a Rabbit
 * Loop this random number generation logic 20 times, and in every iteration, pick the 
 * animal according to the number generated and add it to the animals array.
 * 
 * For example you may get something like this:
 * 5 lions, 3 cats, 4 roosters, 7 tigers, and 1 Hippo
 * 
 * Now loop through the array calling the appropriate superclass/subclass methods to print an output like this:
 * 
 * A lion weighing 150 pounds runs at a speed of 20 mph to it's den and eats meat
 * A cat weighing 20 pounds runs at a speed of 2 mph to it's home and eats meat
 * A rooster weighing 6 pounds runs at a speed of 1 mph to it's cage and eats plants
 * A tiger weighing 150 pounds runs at a speed of 20 mph to it's den and eats meat
 * A lion weighing 140 pounds runs at a speed of 25 mph to it's den and eats meat
 * A tiger weighing 130 pounds runs at a speed of 20 mph to it's den and eats meat
 * A rooster weighing 4 pounds runs at a speed of 2 mph to it's cage and eats plants
 * A tiger weighing 147 pounds runs at a speed of 20 mph to it's den and eats meat
 * A lion weighing 143 pounds runs at a speed of 23 mph to it's den and eats meat
 * A tiger weighing 123 pounds runs at a speed of 21 mph to it's den and eats meat
 * A cat weighing 15 pounds runs at a speed of 3 mph to it's home and eats meat
 * A rooster weighing 5 pounds runs at a speed of 1 mph to it's cage and eats plants
 * A lion weighing 120 pounds runs at a speed of 35 mph to it's den and eats meat
 * A tiger weighing 145 pounds runs at a speed of 17 mph to it's den and eats meat
 * A hippo weighing 200 pounds runs at a speed of 2 mph to the water and eats plants
 * A tiger weighing 150 pounds runs at a speed of 20 mph to it's den and eats meat
 * A lion weighing 135 pounds runs at a speed of 18 mph to it's den and eats meat
 * A rooster weighing 4 pounds runs at a speed of 2 mph to it's home and eats plants
 * A tiger weighing 134 pounds runs at a speed of 20 mph to it's den and eats meat
 * A cat weighing 18 pounds runs at a speed of 3 mph to it's home and eats meat
 */
public class AnimalSimulation {
	public static void main(String[] args) {
    	System.out.println("Hello from AWS Cloud9!");
	}
}