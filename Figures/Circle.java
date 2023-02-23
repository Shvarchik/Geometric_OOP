package Figures;
import Exception.IncorrectRadiusException;

public class Circle implements IFigure, ILengthable{
    private double radius;

    public Circle(double radius) throws IncorrectRadiusException {
        if (radius <= 0){
            throw new IncorrectRadiusException("incorrect");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double length() {
        return 2 * Math.PI * radius;
    }
}
