package hm1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter password");
        String pass = scaner.nextLine();
        switch (pass) {
            case "123":
                System.out.println("Пароль авторизований");
                break;
            case "Admin":
                System.out.println("Авторизований як адмін");
                break;
            default:
                System.out.println("Неправильний пароль");
        }
    }
}




