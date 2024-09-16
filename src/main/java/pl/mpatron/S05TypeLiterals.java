package pl.mpatron;

class TypeLiterals {
    public static void main(String[] args) {
        // 1 -> int
        // 1L -> long
        // 1.0 -> double
        // 1.0f -> float
        // 0xABCDEF -> int (in hex)
        // 0123 -> int (in oct)

        short num1 = 123;
        double num2 = 1.2f;
        method((short) 1); // doesn't work without downcasting
        System.out.println(0123);
    }

    private static void method(short s) {

    }
}