package edu.monmouth.assignment1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class AnimalsTester {
	//creates an empty array of animals
	static Animal[] arrayOfAnimals = new Animal[Constants.NUMANIMALS];
	private static short meanness = 5;
	
	public static void main(String[] args) {
		//changing output to HW1 text and making sure itdoes not pass through with file not found exception
		final String LOGFILENAME = "C:\\Users\\dlawr\\eclipse-workspace\\Cs-205L\\src\\edu\\monmouth\\assignment1\\HW1.txt";
		
		try {    
	        PrintStream stout = new PrintStream(LOGFILENAME); 
	        System.setOut(stout); 
	        System.setErr(stout); 
		} catch(FileNotFoundException ioe) { 
	        System.err.println("Cannot redirect stderr and stdout " + ioe.getMessage()); 
	        ioe.printStackTrace(); 
	        System.exit(-1); 
	} 
		
		

		//declares animals
		arrayOfAnimals[0] = new Dog("white");
		arrayOfAnimals[1] = new Fish("purple");
		arrayOfAnimals[2] = new GuardDog("black", meanness);
		arrayOfAnimals[3] = new ShowDog("brown", "shih Tzu");
		
		meanness = 9;
		arrayOfAnimals[4] = new GuardDog("brown", meanness);
		arrayOfAnimals[5] = new Fish("green");
		
		
		//goes through each animal in the array and calls tostring and has it move and make a sound
		for(int i = 0; i< arrayOfAnimals.length;i++) {
			if(arrayOfAnimals[i] != null) {
			System.out.println(arrayOfAnimals[i].toString());
			arrayOfAnimals[i].move();
			arrayOfAnimals[i].makeSound();
			System.out.println();
			}
		}
		//goes through each animal in the array and calls tostring and has it move and make a sound
		for(Animal animals: arrayOfAnimals) {
			if(animals != null) {
			System.out.println(animals);
			animals.move();
			animals.makeSound();
			System.out.println();
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
				System.out.println();
			}
		}
		
		

	}
	
	
	//iterates through array and prints it out
	public void arrayPrint() {
		for(int i = 0; i< arrayOfAnimals.length;i++) {
			if(arrayOfAnimals[i] != null) {
			System.out.println(arrayOfAnimals[i]);
			}
		}
	}
	
}
