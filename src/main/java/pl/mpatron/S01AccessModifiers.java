package pl.mpatron;

class SomeClass {

    // What does each of the following do?

    public String publicValue = "publicValue";
    protected String protectedValue = "protectedValue";
    String defaultValue = "defaultValue";
    private String privateValue = "privateValue";

    final String finalValue = "finalValue";
    // const String constValue = "constValue"; // reserved by Java language, although doesn't do anything

    public static final String STATIC_FINAL_VALUE = "STATIC_FINAL_VALUE";

    public static String staticMethod() {
        return "staticMethod";
    }
}

class AccessModifiers {
    public static void main(String[] args) {
        // static methods can be accessed through an instance, but that's not recommended
        System.out.println(new SomeClass().staticMethod());
        // it's better to call in on the class
        System.out.println(SomeClass.staticMethod());
    }
}