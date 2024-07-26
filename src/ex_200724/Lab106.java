package ex_200724;

public class Lab106 {
    public static void main(String[] args) {
        for (int i= 0; i< 10; i++) {
            System.out.println(i);
            if(i==5){ // when condition becomes true it will break and go back to for
                continue;
            }
            System.out.println("After");

        }
    }
}
