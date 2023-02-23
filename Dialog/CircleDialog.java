package Dialog;

import java.util.Scanner;

public class CircleDialog implements IDialog{

    @Override
    public double[] showDialog() {
        double[] array = new double[1];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the circle radius");
            double radius = scanner.nextDouble();
            array[0] = radius;
            
        }
        return array;
    }
}
