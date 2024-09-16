package pl.mpatron;

/* Noteworthy concepts:
 - diamond problem
 */

interface Vehicle {
    default void makeSound() {
        System.out.println("Sound of a vehicle");
    }
}

interface Car extends Vehicle {
    @Override
    default void makeSound() {
        System.out.println("Sound of a car");
    }
}

interface Motorcycle extends Vehicle {
    @Override
    default void makeSound() {
        System.out.println("Sound of a motorcycle");
    }
}

class Quad implements Car, Motorcycle {

    @Override
    public void makeSound() {
        Car.super.makeSound();
        Motorcycle.super.makeSound();
        System.out.println("Sound of a quad");
    }
}

class DiamondProblem {
    public static void main(String[] args) {
        new Quad().makeSound();
    }
}

interface A1 {
    default void a() {
        System.out.println("A1");
    }
}

interface A2 {
    default void a() {
        System.out.println("A2");
    }
}

// won't compile
// notice that "full" diamond is not required, i.e., 3 types are enough
// class A implements A1, A2 {
//
// }