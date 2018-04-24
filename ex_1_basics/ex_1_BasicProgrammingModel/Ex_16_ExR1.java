package ex_1_basics.ex_1_BasicProgrammingModel;

public class Ex_16_ExR1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //依次计算 1/2/3/4/5/6会更简单
        System.out.println(exR1(1));
        System.out.println(exR1(2));
        System.out.println(exR1(3));
        System.out.println(exR1(4));
        System.out.println(exR1(5));
        System.out.println(exR1(6));
    }

    public static String exR1(int n){
        if ( n<= 0 )
            return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }


}
