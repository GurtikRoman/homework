package hm1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int numbr= 5;
        System.out.println("Enter day in week");
        String day = scaner.nextLine();
        switch (day){
            case "Monday":
                System.out.println("Dancing,");
                break;
            case "Tusday":
                System.out.println("Reading");
                break;
            case "Wensday":
                System.out.println("Footbol");
                break;
            case "Thursday":
                System.out.println("Swiming");
                break;
            case  "Friday":
                System.out.println("Geography");
                break;
            case "Saturday":
                System.out.println("Watch TV");
                break;
            case "Sunday":
                System.out.println("Beach");
                break;

        }



    }

}
