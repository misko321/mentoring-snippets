package pl.mpatron;

import java.util.List;
import java.util.function.Predicate;

/*
Noteworthy concepts:
 - functional interface = SAM (Single Abstract Method) interface
 - well-known functional interfaces: Consumer, Supplier, Function, Predicate, etc.
 */

class FunctionalInterfaces {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // an implementation of a functional interface can be assigned to a variable:
        Predicate<Integer> predicate = value -> value % 2 == 0;

        // it could be also implemented with an anonymous class, but that's less efficient than the above:
        Predicate<Integer> predicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };

        var list2 = list.stream().filter(new IsEvenPredicate()).toList();
        System.out.println(list2);
    }
}

// functional interface is an interface like any other, so it can be implemented by a class
class IsEvenPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}

// must have only one abstract method
@FunctionalInterface
interface MyConsumer<T> {
    void accept(T element);

    // default methods don't count (they have a body, so they're not abstract)
    default void accept2(T element) {
    }
}
