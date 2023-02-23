package Figures;
import Exception.IncorrectSideException;
public class Square extends Rectangle{

    public Square(double side) throws IncorrectSideException {
        super(side, side);
        if (side <= 0){
            throw new IncorrectSideException("entered side less than zero");
        }
    }

    @Override
    public double area() {
        return sides[0] * sides[0];
    }

    public double getSide(){
        return sides[0];
    }
}
