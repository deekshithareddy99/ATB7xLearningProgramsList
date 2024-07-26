package ex_200724;

import java.util.Scanner;

public class Lab111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int fact=1;//1=1,2!=1*2,3!=3*2*1,4!=4*3*2*1--->f=f*i f=2
        //3!=f*i==2*3=6  , 4!=f*i ;6*4=24
        for(int i=1;i<=n;i++)
        {
            fact=fact*i; //1*
        }
        System.out.println(fact);
    }
}
