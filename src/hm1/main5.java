package hm1;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m");
        double m = scanner.nextDouble();

        System.out.println("Enter n");
        double n = scanner.nextDouble();

        double y;
        double x = 10;
        y = Math.abs(10 - n);
        double z;
        z = m - 10;
        if (y < 10) {
            System.out.println(+(n));
        } else {
            System.out.println(+(m));
        }
    }
}
