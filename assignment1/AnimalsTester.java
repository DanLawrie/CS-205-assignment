package edu.monmouth.assignment1;

public class AnimalsTester {
	public static final int numAnimals = 6;
	private static short meanness = 5;
	public static void main(String[] args) {
		//creates an empty array of animals
		Animal[] arrayOfAnimals = new Animal[numAnimals];
		
		//declares animals
		arrayOfAnimals[0] = new Dog("white");
		arrayOfAnimals[1] = new Fish("purple");
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
		//goes through each animal in the array and calls tostring and has it move and make a sound
		for(Animal animals: arrayOfAnimals) {
			if(animals != null) {
			System.out.println(animals);
			animals.move();
			animals.makeSound();
			}
		}
		//goes through each animal in the array and calls tostring and has it move and make a sound
		int i = 0;
		while(i<arrayOfAnimals.length)
		{
			if(arrayOfAnimals[i] != null) {
				System.out.println(arrayOfAnimals[i].toString());
				arrayOfAnimals[i].move();
				arrayOfAnimals[i].makeSound();
				i++;
			}
		}
	//	System.out.println(getName());
		/*
		 * 2. An abstract method is a method that cannot be instantiated directly. This is useful because it hides irrelevant information.
		 * 
		 * 3. A class can be instantiated while interfaces cannot be instantiated.
		 * 
		 * 4. It cannot be instantiated directly because you will be defying the object oriented model
		 * 
		 * 5. This is because GaurdDogs extends to dog which implements animal and fish also implements animal.
		 * 
		 * 6. The methods that get executed are the ones called from the main method or constructor.
		 * 
		 * 7. It will cause an error.
		 * 
		 * 8. fur color and meanness
		 * 
		 * 9.fur color and breed
		 * 
		 * 10.Abstract
		 * 
		 */
	}

}
