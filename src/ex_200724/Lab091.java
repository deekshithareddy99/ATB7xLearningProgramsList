package ex_200724;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any alphabet");
        int alphabet =sc.next().charAt(0);
        switch(alphabet)
        {
            //int chrome;
            case 'a','e','i','o','u':
                System.out.println("vowels");
                break;
            default:
                System.out.println("not vowels");
        }
    }
}
