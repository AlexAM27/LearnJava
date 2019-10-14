package conditions;

import java.util.Scanner;

public class ConditionsAndCalculation {
    public static void main(String[] args) {
        exercise50(1, -1, 0);
    }

    private static void exercise50(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            System.out.println("yes");
        }
    }

    private static void exercise49() {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        int s = scan.nextInt();
        int t = scan.nextInt();
        int fourth = scan.nextInt();
        int max = 0;
        if (f > s) {
            max = f;
        } else {
            max = s;
        }
        if (max < t) {
            max = t;
        }
        if (max < fourth) {
            max = fourth;
        }
        if (max == s) {
            System.out.println("Not Found");
        } else {
            System.out.println(max);
        }
    }

    private static void findBiggestNum(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println(max);
        System.out.println(Math.max(Math.max(a,b), c));
    }

    private static void exercise46() {
        int sum = 0;
        boolean error = true;
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        int s = scan.nextInt();
        int t = scan.nextInt();
        if (checkIfNumberDivideOnFive(f)) {
            sum+=f;
            error = false;
        }
        if (checkIfNumberDivideOnFive(s)) {
            sum+=s;
            error = false;
        }

        if (checkIfNumberDivideOnFive(t)) {
            sum+=t;
            error = false;
        }

        if (error) {
            System.out.println("error");
        } else {
            System.out.println(sum);
        }

    }

    private static boolean checkIfNumberDivideOnFive(int i) {
        if (i == 0 ) {
            return false;
        } else if (i % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void exercise45() {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        if (checkNumbersMorethanTen(first, second, third) && checkNumbersDivideOnTwo(first, second)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static boolean checkNumbersMorethanTen(int f, int s, int t) {
        return ((f > 10 && s > 10) && t > 10);
    }

    private static boolean checkNumbersDivideOnTwo(int f, int s) {
        return (f % 2 ==0 && s % 2 == 0);
    }

    private static void exercise44() {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        int first = scan.nextInt();
        System.out.println();
        System.out.print("Second number: ");
        int second = scan.nextInt();
        System.out.println();
        if ((first != 10 && second != 10) && first % 2 == 0) {
            System.out.println( first + second);
        } else {
            System.out.println(first * second);
        }
    }

    private static void exercise43(int i) {
        if (i < 1 || i > 12) {
            System.out.println("This Month doesn't exist");
        } else if (i >= 3 && i <= 5) {
            System.out.println("spring");
        } else if (i >= 6 && i <= 8) {
            System.out.println("summer");
        } else if (i >= 9 && i <= 11) {
            System.out.println("authumn");
        } else {
            System.out.println("winter");
        }
    }

    private static void exercise42(int i) {
        if (i >= 2 && i <= 5) {
            i+=10;
        } else if (i >= 7 && i <= 40) {
            i-=100;
        } else if (i <= 0 || i >= 3000) {
            i*=3;
        } else {
            i=0;
        }
        System.out.println(i);
    }

    private static void exercise41(int i) {
        if (i < -100 || i > 100) {
            i = 0;
        } else {
            i+=1;
        }
        System.out.println(i);
    }

    private static void exercise40(int i) {
        if (i < 10 && i > -10) {
            i += 5;
        } else {
            i-=10;
        }
        System.out.println(i);
    }

    private static void exercise39(float a, float b) {
        if ( a > b) {
            System.out.println("yes");
        } else {
            changeVariablesValue(a, b);
        }
    }

    private static void changeVariablesValue(float a, float b) {
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    private static void exercise38(float a, float b) {
        if (Math.abs(a - b) >= 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
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
