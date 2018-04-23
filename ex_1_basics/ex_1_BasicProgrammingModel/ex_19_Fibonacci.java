package ex_1_basics.ex_1_BasicProgrammingModel;


public class ex_19_Fibonacci {

    public static  long F(int N) {
        if(N == 0) {
            return 0;
        }
        if(N == 1) {
            return 1;
        }
        return F(N-1) + F(N-2);
    }

    public static void main(String[] args) {
        for (int N=0; N < 100; N++) {
            System.out.println("N = " + N + " , F(N) = " + newF(N));

        }
    }


    public static long newF(int N) {
        long[] f = new long[N+1];
        return newF(N, f);
    }

    public static long newF(int N, long[] f) {
        if(N == 0) {
            f[0] = 0;
            return 0;
        }
        if(N == 1) {
            f[1] = 1;
            return 1;
        }
        f[N] = newF(N-1, f) + newF(N-2, f);
        return f[N];
    }


}

