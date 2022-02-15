package edu.monmouth.assignment1;

public class ShowDog extends Dog{
	private String breed;
	/*
	 * Calls super class and puts in a furColor string to Constructor and sets bread to parameter
	 */
	ShowDog(String furColor, String breed){
		super(furColor);
		setBreed(breed);
	}
	/*
	 * gets a String called bread
	 */
	
	
	public String getBreed() {
		return breed;
	}
	/*
	 * sets bread to what is in the String parameters
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/*
	 * returns string with fur color and breed
	 */
	public String toString() {
		return "fur color: " + getFurColor() + ", breed: " + getBreed();
		
	}

}