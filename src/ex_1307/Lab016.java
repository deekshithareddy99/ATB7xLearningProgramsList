package ex_1307;

public class Lab016 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);//false  (logical) && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false (bitwise) & true = false
        System.out.println(a);//11 because second condition is checked
    }
}
