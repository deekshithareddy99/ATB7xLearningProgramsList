package ex_2707;

public class Lab125 {
    public static void main(String[] args) {
        int [] salary={7,9,26,5,12,89,23};
        int min=salary[0]; //for comparing
        for(int i=0;i>salary.length;i++)
        {
            if(salary[i]<min){
                min=salary[i];
            }
        }
        System.out.println("min salary is"+ min);
    }
}
