package Dialog;
import java.util.Scanner;

public class SquareDialog implements IDialog {

    @Override
    public double [] showDialog() {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите сторону: ");
            double s = in.nextDouble();
            return new double[]{s, s, s, s};
        }
    } 
}
