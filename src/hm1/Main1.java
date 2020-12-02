package hm1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a'");
        int a = scanner.nextInt();

        System.out.println("Enter 'b'");
        int b = scanner.nextInt();

        System.out.println("Enter 'c'");
        int c = scanner.nextInt();
        //int a = 4; 2
        //int b = 3; 4
        //int c = 1; 1
        int d;

        d = (b * b) - (4 * a * c);
        if (d > 0) {
            System.out.println(" x1 = " + (-b + Math.sqrt(d)) / (2 * a));
            System.out.println(" x2 = " + (-b - Math.sqrt(d)) / (2 * a));
        } else {
            System.out.println("D < 0");
        }
    }
}