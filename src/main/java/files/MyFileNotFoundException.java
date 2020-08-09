package files;

/**
 * @author Evgeny Borisov
 */
public class MyFileNotFoundException extends RuntimeException {

    public MyFileNotFoundException() {
    }

    public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException(Throwable cause) {
        super(cause);
    }
}
