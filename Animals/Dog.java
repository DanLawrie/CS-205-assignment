package edu.monmouth.Animals;

	public class Dog implements Animal{
		protected String furColor = "";
		private static final String bark = "Woof";
		
		
		/*
		 * accepts in a String and sets that string to the fur color
		 */
		Dog(String furColor){
			setFurColor(furColor);
		}
		
		
		/*
		 * this returns a string that is called fur color
		 */
		public String getFurColor() {
			return furColor;
		}
		
		/*
		 * accepts a string and sets the fur color to the string parameter
		 */
		public void setFurColor(String furColor) {
			this.furColor = furColor;
		}
		
		/*
		 * prints out you have moved everytime method is called
		 */
		@Override
		public void move(){
			System.out.println("You have moved");
		}
		/*
		 * prints out what is in bark when the method is called
		 */
		@Override
		public void makeSound() {
			System.out.println(bark);
		}
		
		/*
		 * returns a string with the fur color
		 */
		public String toString() {
			return "fur color: " + getFurColor();
			
		}
	
	}