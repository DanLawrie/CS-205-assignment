package edu.monmouth.Animals;

public class Fish implements Animal{
	protected String color = "";
	private static final String fishNoise = "bubble";
	
	/*
	 * accepts a String and sets color to that String
	 */
	Fish(String color){
		setColor(color);
	}
	
	//prints out how the fish has moved as a String
	@Override
	public void move() {
		System.out.println("The fish has moved");
	}
	
	
	//prints out a fishnoise from the fish
	@Override
	public void makeSound() {
		System.out.println(fishNoise);
	}
	//gets the color and returns it
	public String getColor() {
		return color;
	}
	// sets the color to what is in the paramter
	public void setColor(String color) {
		this.color = color;
	}
	// returns color
	public String toString() {
		return "Color: " + getColor();
	}
	
}
