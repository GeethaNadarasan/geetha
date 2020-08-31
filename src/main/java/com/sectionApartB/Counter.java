package com.sectionApartB;


public class Counter {

	public static void main(String[] args) {

		int flyCount = 0;
		int swimCount = 0;
		int walkCount = 0;
		int singCount = 0;

		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolhpin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};

		for(int i = 0 ; i< animals.length; i++){
			System.out.println("Animal name:"+animals[i]);
			if(animals[i].fly()){
				flyCount = flyCount + 1;
			}
			if(animals[i].sing()){
				singCount = singCount + 1;
			}
			if(animals[i].walk()){
				walkCount = walkCount + 1;
			}
			if(animals[i].swim()){
				swimCount = swimCount + 1;
			}
		}
		System.out.println("Flying Animals:"+flyCount);
		System.out.println("Singing Animals:"+singCount);
		System.out.println("Walking Animals:"+walkCount);
		System.out.println("Swimming Animals:"+swimCount);

	}



}
