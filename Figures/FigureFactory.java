package Figures;

import Exception.*;

public class FigureFactory {

    public IFigure createFigure(int figureType, double [] parameters) throws IncorrectSideException, IncorrectRadiusException {

        return switch (figureType) {
            case 1 -> new Triangle(parameters[0], parameters[1], parameters[2]);
            case 2 -> new Rectangle(parameters[0], parameters[1]);
            case 3 -> new Square(parameters[0]);
            case 4 -> new Circle(parameters[0]);
            default -> throw new IllegalStateException("Unexpected value: " + figureType);
        };

    }
}