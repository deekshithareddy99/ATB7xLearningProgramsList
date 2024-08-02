package ex_2707;

public class Lab121 {
    public static void main(String[] args) {
        int[]marks=new int[3];
        System.out.println(marks[0]);
        marks[0]=10;
        marks[1]=34;
        marks[2]=78;
        //marks[3]=89;
        System.out.println(marks[1]);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(i +"-->" +marks[i]);
        }
    }

}
