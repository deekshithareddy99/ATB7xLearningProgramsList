package ex_200724;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Browser name");
        String Browser= sc.next();
        switch(Browser)
        {
            case "chrome":
                System.out.println("i can use chrome");
                break;
            case "internet explorer":
                System.out.println("i can use ie");
            case"edge":
                System.out.println("i acn use edge");
            default:
                System.out.println("dont know to use");
                break;

        }
        sc.close();


    }
}
