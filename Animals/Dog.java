package edu.monmouth.Animals;

	public class Dog implements Animal{
		protected String furColor = "";
		
		Dog(String furColor){
			setFurColor(furColor);
		}
		
		public String getFurColor() {
			return furColor;
		}
		public void setFurColor(String furColor) {
			this.furColor = furColor;
		}
		public void move(){
			System.out.println("You have moved");
		}
		public void makeSound() {
			System.out.println("Woof");
		}
	
	}