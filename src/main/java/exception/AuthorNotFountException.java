package exception;

public class AuthorNotFountException extends RuntimeException {
    public AuthorNotFountException(String message) {
        super(message);
    }
}
