package ex_1_Fundamentals.ex_1_BasicProgrammingModel;

public class Ex_17_ExR2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String exR2(int n) {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }

}
