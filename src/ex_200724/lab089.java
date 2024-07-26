package ex_200724;
import java.util.Scanner;
public class lab089 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
       String grade = "";
        if(marks>=90 & marks<=100)
        {
            //System.out.println("A");
            grade="A";
            
        } else if (marks>=80 & marks<=89) {
           // System.out.println("B");
            grade="B";
        }
        else if (marks>=70 & marks<=79) {
            //System.out.println("C");
            grade="c";
        }
        else if (marks>=60 & marks<=69) {
            //System.out.println("D");
            grade="D";
        }

        else {
            System.out.println("fail");
        }
          System.out.println("your grade="+grade);

    }
}
