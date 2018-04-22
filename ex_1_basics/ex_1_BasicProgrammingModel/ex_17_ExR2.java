package ex_1_basics.ex_1_1_BasicProgrammingModel;

public class ex_17_ExR2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String exR2(int n) {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }

}
