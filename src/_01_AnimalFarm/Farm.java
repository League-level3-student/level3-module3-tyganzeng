package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Pig());
		farm.add(new Cow());
		farm.add(new Horse());
		farm.add(new Duck());
		farm.add(new Pig());
		farm.add(new Cow());
		for (Animal a : farm) {
			a.makeNoise();
		}
	}
}
