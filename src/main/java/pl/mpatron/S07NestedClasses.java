package pl.mpatron;

class ChangePasswordUseCase {
    public class Input {
        private String username;
        private String newPassword;
    }

    // or since Java 16:
    public record InputRecord( // records are static by default
                               String username,
                               String newPassword
    ) {
        void recordsCanHaveMethodsToo() {
            System.out.println("method in a record");
        }
    }
}

class NestedClasses {
    public static void main(String[] args) {
        // a non-static nested class/record can only be created through the instance of a parent
        new ChangePasswordUseCase().new Input();

        // a static class/record can be created without having an instance of the parent
        new ChangePasswordUseCase.InputRecord("username", "password");
    }
}