package ex_1_basics.ex_1_BasicProgrammingModel;

import StdLib.StdRandom;

public class Ex_35_Throw {

    static int SIDES = 6;
    static int i = 0;

    public static void main(String[] args) {
        double[] doubles1 =  throwDiceProbability();

        int j= 0;
        while (j <= 2*SIDES) {
            doubles1[j] = getNumberInN(doubles1[j], 3);
            j++;
        }

    for (int i = 1 ; ; i++){
        double[] doubles2 = initial(i);
        System.out.println("投掷"+i+"次后");

        //数组去小数点之后三位；
        int k= 0;
        while (k <= 2*SIDES) {
            doubles2[k] = getNumberInN(doubles2[k], 3);
            k++;
        }

        //比对试验结果和理论结果，如果一致（小数点后三位相同），则试验结束
        if (compareArray(doubles1,doubles2)) {
            return;
        }
    }

    }

    //最终结果是i达到了52741、67514次后，所有点数的概率才能达到小数点后三位的精确度






    //投色子概率分布
    public  static double[] throwDiceProbability() {

        double[] dist = new double[2*SIDES + 1];
        for (int i = 1; i<= SIDES; i++)
            for (int j = 1; j<=SIDES; j++)
                dist[i+j] += 1.0;

        for (int k = 2; k<= 2*SIDES; k++)
            dist[k] /= 36.0;

        for (double d : dist)
            System.out.println(d);

        return dist;
    }


    //投骰子
    public static int throwDice() {
         return StdRandom.uniform(1, SIDES+1) + StdRandom.uniform(1, SIDES+1);
    }


    //开始投掷
    public static double[] initial(int n) {
        double[] dices = new double[13];

        for (int i = 0; i < n; i++) {
            int res = throwDice();
            dices[res]++;
        }

        for (int i = 0; i< 13; i++)
            dices[i] = dices[i] /n;

        return dices;
    }

    //求绝对值
    public static double  absolute(double d) {
        if(d < 0)
            return -d;
        return d;
    }

    //取第n位小数
    public static int getNumberInN(double d, int n) {
        int result = 1;
        for(int i = 0; i < n; i++)
            result *= 10;

        return (int)(result*d);
    }


    //比较两个数组的值
    public static boolean compareArray(double[] d1, double[] d2) {
        if (d1.length != d2.length)
            return false;
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] != d2[i])
                return false;
        }
        return true;
    }




}
