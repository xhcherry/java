package HomeWork;

class EmptyFieldException extends Exception {
    public EmptyFieldException(String which) {
        super(which);
    }
}

class LoginService {
    public void login(String name) throws EmptyFieldException {
        if (name == null) {
            throw new EmptyFieldException(" ");
        }
    }
}

public class HW3_1_2 {
}
