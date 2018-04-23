package ex_1_basics.ex_1_BasicProgrammingModel;

public class ex_20_Recursion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int N = 3;
        System.out.println(N + "的阶乘 === " + factorial(N));

        System.out.println("计算ln("+N+"!) === " + calculateLnN(N));

    }

    //计算ln(N!) = log N! / log e;
    public static double calculateLnN(int N) {
    return calculateLogN(factorial(N) /calculateLogN(Math.E));
    }

    //求阶乘 ；
    public static  long  factorial(int N) {
        if(N == 0 || N == 1) {
            return  1;
        }
        return factorial(N-1)*N;
    }

    //计算log N ；使用了Math库，本人暂时没想出怎么自己写
    public static  double  calculateLogN(double N) {
        return Math.log(N);
    }




}
