package pl.mpatron;

/*
Noteworthy concepts:
 - method overriding
 - method overloading
 - polymorphism
 - dynamic dispatch
 - abstract class vs. interface
 */

abstract class Animal {
    // 1. Notice that abstract class doesn't need to have abstract methods
    // 2. Abstract class can have fields whereas interface cannot (interfaces are stateless)

    void makeSound() {
        System.out.println("Animal sound");
    }

    // method overloading = having method with the same name, but different parameters
    void abc() {
    }

    void abc(int b) {
    }
    // notice that return type MUST be the same; the following won't compile
    // int abc() { return 5; }
}

class Animal2 extends Animal {
}

abstract class Animal3 extends Animal2 {}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Hau hau");
    }
}

class Cat extends Animal {
    // What access modifier can the following method have? Why?
    @Override
    public void makeSound() {
        System.out.println("Miau miau");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        Animal dogAsAnimal = dog;
        Animal catAsAnimal = cat;
        dogAsAnimal.makeSound();
        catAsAnimal.makeSound();
    }
}