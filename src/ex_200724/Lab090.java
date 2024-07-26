package ex_200724;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Day number from 1-7");
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Monday");
               break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no idea");
                break;
        }
        System.out.println("--outside of loop---");
    }
}
