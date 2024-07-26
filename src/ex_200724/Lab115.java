package ex_200724;

public class Lab115 {
    public static void main(String[] args) {
        //functions without parameter and no return type
        //without para, with RT
        //With Para, without RT
        //with para, with RT

        functon_type1();

        String name=functon_type2();
        System.out.println(name);

        functon_type3("amith");

        int sum=functon_type2(6, 7);
        System.out.println(sum);


    }
    //1
    static void functon_type1()
    {
        System.out.println("without para, without RT");
    }
    //2
    static String functon_type2()
    {
        System.out.println("without para, with RT");
        return "pramod";
    }
    //3
    static void functon_type3(String name1)
    {
        System.out.println("With Para, without RT");
        System.out.println("you printed"+name1);

    }
    static int functon_type2(int a, int b)
    {
        System.out.println("with para, with RT");
        return a+b;
    }

}

