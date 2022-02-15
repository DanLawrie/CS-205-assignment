package edu.monmouth.Animals;

public class Fish implements Animal{
	protected String color = "";
	private static final String fishNoise = "bwah";
	private Byte move = 0;
	
	Fish(String color){
		setColor(color);
	}
	
	//prints out how far the fish has moved
	@Override
	public void move() {
		move++;
		System.out.println("The fish has moved: "+ move);
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
