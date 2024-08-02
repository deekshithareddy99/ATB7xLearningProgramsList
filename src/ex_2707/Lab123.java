package ex_2707;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[]marks=new float[5];
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("enter the marks of sub "+ (i+1) );// as index starts with 0
            marks[i]=sc.nextFloat();
        }
        float avg=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("avg is"+ avg);



        //System.out.println("enter marks sub1 marks");
       // marks[0]=sc.nextFloat();
       // float avg=marks[0]+marks[1]/2;



    }
}
