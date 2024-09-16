package pl.mpatron;

interface AnimalInterface {
    void someMethod();
}

enum DayOfWeek implements AnimalInterface { // enums can implement interfaces
    MONDAY(1) {
        @Override // each value can override an inherited method
        public void someMethod() {

        }
    },
    TUESDAY(2) {
        @Override
        public void someMethod() {

        }
    },
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    DayOfWeek(int index) {
        this.index = index;
    }

    private final int index;

    public int getIndex() {
        return index;
    }

    public String describe() {
        return this.name() + " is the " + this.index + ". day of the week.";
    }

    public static void main(String[] args) {
        System.out.println(FRIDAY.describe());
    }

    @Override
    public void someMethod() {
    }

    // abstract method are allowed too
    // abstract void someMethod2();
}

