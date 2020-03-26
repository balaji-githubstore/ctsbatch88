package com.google.inheritance;

class Animal {
	int a = 25;

	public Animal() {

	}

	public void talk() {
		System.out.println("What to talk?");
	}

	public void animaltest() {
		System.out.println("an test");
	}
}

class Dog extends Animal {
	int a = 45;

	public Dog() {
		super.a = 90;
	}

	public void talk() {
		System.out.println("Barks");
	}

	public void dogtest() {
		System.out.println("dog test");
	}
}

class Cat extends Animal {

}

public class MethodOverriding {
	public static void main(String[] args) {

//		Dog d=new Dog();
//		d.animaltest();
//		d.talk();
//		d.dogtest();
		
		
		
		Animal animal = new Dog();
		animal.talk();
		System.out.println(animal.a);

		System.out.println(((Dog) animal).a);
		animal.animaltest();
		animal.talk();
		Animal a =new Cat();
		a.talk();
		a.animaltest();
		
//		Cat c =(Cat)animal;
//		
//		c.talk();

//		Dog temp=(Dog) animal;
//		temp.dogtest();
//		
//		((Dog) animal).dogtest();
	}
}
