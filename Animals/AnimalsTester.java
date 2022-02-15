package edu.monmouth.Animals;

public class AnimalsTester {
	public static final int numAnimals = 6;
	public static void main(String[] args) {
		//creates an empty array of animals
		Animal[] arrayOfAnimals = new Animal[numAnimals];
		
		//declares animals
		arrayOfAnimals[0] = new Dog("white");
		arrayOfAnimals[1] = new Fish("purple");
		short meanness = 5;
		arrayOfAnimals[2] = new GuardDog("black", meanness);
		arrayOfAnimals[3] = new ShowDog("brown", "shih Tzu");
		arrayOfAnimals[4] = new GuardDog("brown", meanness);
		arrayOfAnimals[5] = new Fish("green");
		
		
		//goes through each animal in the array and calls tostring and has it move and make a sound
		for(int i = 0; i< arrayOfAnimals.length;i++) {
			if(arrayOfAnimals[i] != null) {
			System.out.println(arrayOfAnimals[i].toString());
			arrayOfAnimals[i].move();
			arrayOfAnimals[i].makeSound();
			}
		}

	}

}
