package Figures;

public abstract class Polygon implements IPerimeterable, IFigure{
    protected double[] sides;

    protected Polygon(double[] sides) {
        this.sides = sides;
    }

    public abstract double area();


    public double perimeter(){
        double perimeter = 0;
        for (Double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
