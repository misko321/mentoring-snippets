package pl.mpatron;

/*
Noteworthy concepts:
 - checked & unchecked exceptions
 */

class MyCustomException extends Exception {}

class MyCustomRuntimeException extends RuntimeException {}

class Exceptions {

    public static void main(String[] args) {
    }

    // If this method could be overridden in a subclass, what "throws" clause could it have, e.g., throws <what>? Why?
    void throwsException() throws MyCustomException {
        throw new MyCustomException();
    }

    void throwsRuntimeException() throws MyCustomRuntimeException {
        throw new MyCustomRuntimeException();
    }
}
