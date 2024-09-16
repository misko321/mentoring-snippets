package pl.mpatron;

/*
Noteworthy concepts:
 - dynamic dispatch
 - static dispatch
 */

class Parent {
    static void doSomething() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void doSomething() {
        System.out.println("Child");
    }
}

class StaticVsDynamicDispatch {
    public static void main(String[] args) {
        Child child = new Child();
        child.doSomething();

        Parent childAsParent = child;
        childAsParent.doSomething();
        // static method cannot be overridden
    }
}
