package ex_1_basics.ex_1_BasicProgrammingModel;

public class ex_27_Binomial {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(" 二项式 === "+ binomial(40, 5, 0.5));
        System.out.println(account);
    }

    static int account = 0;

    public static double binomial(int N, int k, double p){
        if(N == 0 && k ==0)
            return 1.0;
        if(N < 0 || k < 0)
            return 0.0;
        account++;
        return (1.0 - p) * binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }

}
