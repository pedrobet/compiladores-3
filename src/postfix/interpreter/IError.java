package postfix.interpreter;

public class IError extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public IError(String msg) {
        super(msg);
    }
}
