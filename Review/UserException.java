package Review;

class InvalidUserException extends Exception {// Error1

    public InvalidUserException() {
        super("�û������������");
    }
}

public class UserException {
    public void login(String username, String password) throws InvalidUserException/* Error2 */ {
        if (username.trim().equals("admin") == false || password.equals("123456") == false) {
            throw new InvalidUserException(); // Error3
        }
    }
}

