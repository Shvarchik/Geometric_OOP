package Figures;
import Exception.IncorrectSideException;
public class Rectangle extends Polygon{
    public Rectangle(double length, double width) throws IncorrectSideException {
        super(new double[] {length, width, length, width});
        if (length <= 0 || width <= 0){
            throw new IncorrectSideException("incorrect");
        }
    }

    public double getLength(){
        return sides[0];
    }

    public double getWidth(){
        return sides[1];
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }
}
