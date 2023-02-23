package Dialog;

import java.util.Scanner;

public class TriangleDialog implements IDialog {
    Scanner in = new Scanner(System.in);

    @Override
    public double[] showDialog() {
        double[] sideArray = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите сторону " + Integer.valueOf(i + 1));
            double s = in.nextDouble();
            sideArray[i] = s;
        }
        return sideArray;
    }
}