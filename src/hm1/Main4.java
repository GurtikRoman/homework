package hm1;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int y;
        int x=2;
        //int n;
        y=n % x;
        if (y == 0) {
            System.out.println("N - парне число");
        }else{
            System.out.println("N - не парне число");
        }
    }
}





