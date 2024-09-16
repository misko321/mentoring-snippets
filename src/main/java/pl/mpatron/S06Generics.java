package pl.mpatron;

import java.util.List;

/*
Noteworthy concepts:
 - type erasure
 - variance (invariance, covariance, contravariance)
 - boxing/unboxing of primitive types
 */

class Box<T> {              // type T can be bounded -> <T : Interface1 & Interface2>
    private final T value;

    Box(T value) {
        this.value = value;
    }

    T value() {
        return value;
    }
}

class Generics {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(123); // Why cannot a primitive int be used?
        var stringBox = new Box<>("stringBox");

        System.out.println(integerBox.value());
        System.out.println(stringBox.value());

        var list1 = List.of("abc");  // Java knows it's a list of Strings
        var list2 = List.<Integer>of();  // list is empty and var is used, so Java cannot infer the type of elements; it must be given on the right-side
        List<Integer> list3 = List.of(); // list is empty, but type is given on the left-side

        // I have a List<?>; how can I determine that <?> at runtime?
        //  whatTypeDoesItHave(list1);
        //  whatTypeDoesItHave(list2);
        // -> cannot be done due to type erasure
        //    Class<T> class must be explicitly passed:
        //    whatTypeDoesItHave(list1, String.class);
    }

    private static <T> void whatTypeDoesItHave(List<T> list1) {
    }

    private static <T> void whatTypeDoesItHave(List<T> list1, Class<T> clazz) {
    }
}