public class EmailValidation {
    public static void main(String[] args) {
        String email = "test@gmail.com";

        if (email.contains(" ") ||
            email.indexOf('@') != email.lastIndexOf('@') ||
            email.indexOf('@') < 1 ||
            email.indexOf('.') == -1) {

            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
