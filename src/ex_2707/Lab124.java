package ex_2707;

public class Lab124 {
    public static void main(String[] args) {
        int [] salary={7,9,26,5,12,89,23};
        int max=1; //for comparing
        for(int i=0;i<salary.length;i++)
        {
           if(salary[i]>max){
               max=salary[i];
           }
        }
        System.out.println("max salary is"+ max);
    }
}
