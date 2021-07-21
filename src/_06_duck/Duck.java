package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	void quack() {
	}
	
	void waddle() {
	}
}

class Dog {
	int numberOfTreats;
	String favoriteToy;
	
	Dog (String favoriteToy, int numberOfTreats) {
		this.favoriteToy = favoriteToy;
		this.numberOfTreats = numberOfTreats;
	}
	
	void bark() {
		System.out.println("Dog barks.");
	}
	
	void tailWag() {
		System.out.println("Dog wags tail.");
	}
}
