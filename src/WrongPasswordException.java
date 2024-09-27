public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super("Wrong Password");
    }
}