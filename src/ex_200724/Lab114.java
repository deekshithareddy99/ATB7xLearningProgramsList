package ex_200724;

public class Lab114 {
    public static void main(String[] args) {
       // functions=block of code which can reuse
       // 1-inbuilt Math.max(10,8)
        //2-user defined
        //2 components -->define,call
        //define
        for (int i = 0; i <8 ; i++) {
            greet(); // calling

        }
    }

    private static void greet() {
        System.out.println("hi");// should define outside main method
    }
}
