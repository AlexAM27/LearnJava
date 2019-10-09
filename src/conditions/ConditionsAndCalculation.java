package conditions;

import java.util.Scanner;

public class ConditionsAndCalculation {
    public static void main(String[] args) {
        exercise36(56);
    }

    private static void exercise37(float a, float b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    private static void exercise36(int numOfMonth) {
        switch (numOfMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("There is no month like that");
        }
    }

    private static void exercise35(int num) {
        if (num < 7) {
            System.out.println("Yes");
        }

        if (num > 10) {
            System.out.println("No");
        }

        if (num == 9) {
            System.out.println("Error");
        }
    }

    private static void exercise34(double num) {
        if (num <= 3) {
            num += 10;
        } else {
            num -=10;
        }
        System.out.println(num);

    }

    private static void exercise33() {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        int x = scan.nextInt();
        readNumber(x);
        System.out.println("\nSecond number: ");
        int y = scan.nextInt();
        readNumber(y);
        System.out.println(Math.sqrt(x - Math.sqrt(y)));
    }

    private static int readNumber(int num) {
        Scanner scan = new Scanner(System.in);
        boolean hasSqrt = true;
        while(hasSqrt) {
            if (!checkNumHasIntegerSqrt(num)) {
                System.out.println("Number has't sqrt\nTry one more time");
                num = scan.nextInt();
            } else {
                hasSqrt = false;
            }
        }
        return num;
    }

    private static boolean checkNumHasIntegerSqrt(int num) {
        int temp = (int) Math.round(Math.sqrt(num));
        return num == Math.pow(temp, 2);
    }
}
