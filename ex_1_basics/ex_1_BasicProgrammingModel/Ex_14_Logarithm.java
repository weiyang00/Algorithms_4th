package ex_1_basics.ex_1_BasicProgrammingModel;

public class Ex_14_Logarithm {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("不大于log2N的最大整数是 === " + lg2(34));

    }

    public static int lg(int number) {
        if (number < 2) {
            return 0;
        }

        int resultNumber = 2;
        int i = 1;
        //分别求i = 1/2/3/4……时的2^i的值；如果number位于两个i所求的number之间，则为所求值；
        for (; ; i++) {
            for (int j = 1; j < i; j++) {
                resultNumber = resultNumber * 2;
                System.out.println("i === " + i + " resultNumber === " + resultNumber);
                if (resultNumber > number) {
                    System.out.println("nubmer is === " + number);
                    System.out.println("resultNumber is === " + resultNumber);
                    return i - 1;
                } else if (resultNumber == number) {
                    return i;
                }
            }

        }
    }

    //简化
    public static int lg2(int number) {
        if (number < 2) {
            return 0;
        }
        for (int i = 1; ; i++) {
            if (getPower(2, i) > number) {
                return i-1;
            }
        }
    }

    //求次方
    public static double getPower(double n, int x) {
        double resultNumber = n;
        for (int j = 1; j < x; j++) {
            resultNumber = resultNumber * n;
        }
        System.out.println(n+"的"+ x +"次方为 === "+ resultNumber);
        return resultNumber;
    }

}
