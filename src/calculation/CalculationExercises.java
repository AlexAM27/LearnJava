package calculation;

import java.util.Scanner;

public class CalculationExercises {

    public static void main(String[] args) {
        exercise20();
    }

    // find square, perimeter and hypothenuse
    private static void exercise21(double c1, double c2) {

    }

    private static void exercise20() {
        double timeInSeconds = inputDouble();
        double distanceInKm = inputDouble();
        System.out.println("Speed: " + (distanceInKm * 1000)/(timeInSeconds*60));
    }

    private static void exercise19() {
        double candysPreise = inputDouble();
        double cockiePreise = inputDouble();

        double threeHundertPreiseCand = candysPreise * 0.3;
        double fourHundertPreiseCoockie = cockiePreise * 0.4;
        System.out.println(threeHundertPreiseCand + fourHundertPreiseCoockie);

        System.out.println((candysPreise * 1.8 + fourHundertPreiseCoockie * 2));
    }

    private static void exercise18() {
        int side = inputInt();
        System.out.println("perimeter: " + (4 * side));
        System.out.println("square: " + side*side);
    }

    private static void exercise14() {
        System.out.println("First number:");
        int first = inputInt();
        System.out.println("Second number:");
        int second = inputInt();
        System.out.println("Summa: " + sum(first, second));
        System.out.println("Product: " + product(first, second));
    }

    private static void exercise15() {
        int num = inputInt();
        System.out.println(Math.pow(num, 2));
        System.out.println(Math.pow(num, 3));
    }

    private static void exercise16() {
        int num1 = inputInt();
        int num2 = inputInt();
        int num3 = inputInt();

        double f = num1 * 2;
        double s = num2 / 3.0;
        double t = num3 * num3;

        System.out.println(f + s + t);
    }

    private static void exercise17() {
        int num1 = inputInt();
        int num2 = inputInt();
        int num3 = inputInt();

        System.out.println("sr: " + (num1 + num2 + num3)/3.0);
        System.out.println((num1+num3)*2.0/(num2*3));
    }

    private static int product(int num1, int num2) {
        return num1 * num2;
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    private static int inputInt() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num;
    }

    private static double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        return num;
    }
}
