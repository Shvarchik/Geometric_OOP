package Dialog;
import java.util.Scanner;

public class RectangleDialog implements IDialog{
    public double[] showDialog(){
        double[] array = new double[4];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("First side: ");
            double firstSide = scanner.nextDouble();
            array[0] = firstSide;
            array[2] = firstSide;
            System.out.println(("Second side: "));
            double secondSide = scanner.nextDouble();
            array[1] = secondSide;
            array[3] = secondSide;
            
        }
        return array;
        
    }
}
