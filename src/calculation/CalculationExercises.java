package calculation;

import java.util.Scanner;

public class CalculationExercises {

    public static void main(String[] args) {
        bank();
    }

    private static void bank() {
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();
        double proz = scan.nextDouble();
        for (int i = 0; i < 5; i++) {
            sum = sum + sum * proz/100;
        }
        System.out.println(sum);
    }

    private static void change2(int a, int b, int c) {
        int temp_a = a;
        int temp_b = b;
        a = a + b;
        b = c - temp_a;
        c = temp_a + temp_b + c;
        System.out.println("a = " + a +"\nb = " + b + "\nc = " + c);

    }

    private static void change(int a, int b) {
        int t = a;
        a = b;
        b = t;
        System.out.println(a + " und " + b);
    }

    private static void exercise24(int day, int rabatt, double depo) {
        double sum = depo + day * 3;
        sum = sum + sum * rabatt / 100;
        System.out.println(sum);
    }

    //Celcius in Fahrenheit
    private static void exercise22(double grad) {
        double temp = 9.0 * grad / 5.0 + 32;
        System.out.println(temp);
    }

    // find square, perimeter and hypothenuse of right-angle triangle
    private static void exercise21(double c1, double c2) {
        double square = (c1 * c2) / 2;
        System.out.println(square);
        double hyp = Math.sqrt(c1 * c1 + c2 * c2);
        System.out.println(hyp);
        double per = c1 + c2 + hyp;
        System.out.println(per);
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
