package ex_200724;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1= sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        //System.out.println(Math.max(num1,num2));
        if(num1 >num2)
        {
            System.out.println("num1 is greater");
        }
        else {
            System.out.println("num2 is greater");
        }
    }
}
