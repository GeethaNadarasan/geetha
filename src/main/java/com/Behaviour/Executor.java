package com.Behaviour;

public class Executor {

	public static void main(String[] args) {
		
		Fish fish = new Shark();
		fish.sing();
		fish.swim();
		fish.walk();

		Shark s = new Shark();
		s.setFishBehaviour(new SharkBehaviour());
		s.getFishBehaviour();
		s.getFishColor();
		Fish clownfish = new Clownfish();
		clownfish.sing();
		clownfish.swim();
		clownfish.walk();
		
		Clownfish c = new Clownfish();
		c.setFishBehaviour(new ClownfishBehaviour());
		c.getFishBehaviour();
		c.getFishColor();

		SwimBehaviourIF d = new Dolphin();
		d.swim();
	}

}
