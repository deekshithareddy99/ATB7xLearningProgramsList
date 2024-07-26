package ex_200724;

import java.util.Scanner;

public class lab087 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x");
        int x= sc.nextInt();
        if(x%2==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
