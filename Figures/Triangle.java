package Figures;
import Exception.IncorrectSideException;
public class Triangle extends Polygon {

    public Triangle (double side1, double side2, double side3) throws IncorrectSideException {

        super (new double [] {side1,side2,side3});
        if ( side1+side2 <= side3 || side2+side3 <= side1 || side1+side3 <= side2 || side1 <=0 || side2 <=0 || side3 <=0)
                throw new IncorrectSideException("Некорректно заданы стороны треугольника");
    }
            
    @Override
    public double area() {
        double p = super.perimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    public double getFirstSide(){
        return sides[0];
    }

    public double getSecondSide(){
        return sides[1];
    }

    public double getThirdSide(){
        return sides[2];
    }
}

