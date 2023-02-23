package Exception;

public class IncorrectRadiusException extends FigureException{
    public IncorrectRadiusException(String msg) {
        super("entered radius less than zero");
    }
}
