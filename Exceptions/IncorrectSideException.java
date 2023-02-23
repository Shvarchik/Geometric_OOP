package Exception;

public class IncorrectSideException extends FigureException {

    public IncorrectSideException(String msg) {
        super("entered the wrong side");
    }
}
