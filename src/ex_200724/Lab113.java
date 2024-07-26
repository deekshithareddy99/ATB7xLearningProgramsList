package ex_200724;

import java.util.Scanner;

public class Lab113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for (int i= 1; i <=n; i++) {
            if(i%3==0)
            {
                System.out.println("FIZZ");
            }
            else if(i%5==0)
            {
                System.out.println("buzz");
            }
            else if(i%3==0 && i%5==0)
            {
                System.out.println("FIZZ BUZZ");
            }
            else{
                System.out.println(i);
            }

        }

    }
}
