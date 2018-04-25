package ex_1_basics.ex_1_BasicProgrammingModel;

import StdLib.StdIn;

public class Ex_30_Created2DArray {

    public static void main(String[] args) {

        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            //打印二维数组
            Ex_11_TwoDimensionBooleanArray.printArray(created(n));
        }
    }


    //两个数的最大公约数等于1的数互质
    public  static  boolean[][] created(int n) {
        boolean[][] booleans = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(Ex_24_GCD.oujilide(i, j) == 1)
                    booleans[i][j] = true;
            }
        }

        return booleans;
    }


}
