package _06_duck;

public class DuckRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		
		Dog daisy = new Dog("chewtoy",5);
		daisy.bark();
		daisy.tailWag();
	}
}
