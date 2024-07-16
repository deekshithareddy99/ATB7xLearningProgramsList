package ex_1307;

public class Lab007 {
    public static void main(String[] args) {
        String s1= new String ("Pramod");
        String s2=new String("Pramod");// stores in heap
        String s3="pramod";// stores in string constant pool
        String s4="pramod";// both s3 and s4 refers to same element no new entry is created in pool
        System.out.println(s2);
        System.out.println(s1.toLowerCase());
        System.out.println(s3);
        System.out.println(s4);
    }

}
