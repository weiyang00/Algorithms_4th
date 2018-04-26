package ex_1_basics.ex_1_BasicProgrammingModel;

import StdLib.StdIn;
import StdLib.StdOut;
import StdLib.StdRandom;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex_39_RandomFit {

    static int count = 0;
    static int total = 0;
    static double[] average = new double[4];

    public static void main(String[] args) {
        //同时存在于两个数组中的整数数量
        count = 0;
        //四个n对应的四个平均值 = total / count
        average = new double[4];
        //总值
        total = 0;

        int[] ns = {1000, 10000, 100000, 1000000};



        while (!StdIn.isEmpty()) {
            int t = StdIn.readInt();
            //average(平均值)的角标
            int num = 0;

        for (int n : ns) {
            for (int i = 0; i < t; i++) {
                fit(n);
                total += count;
            }
            average[num++] = (double) total / t;
        }

        //打印数组
        for(double d : average)
        System.out.println(d);
    }
    }



    public static void fit(int n ) {

            int[] array1 = new int[n];
            int[] array2 = new int[n];

            for (int j =0; j< n; j++){
                array1[j] = 100000 + StdRandom.uniform(1000000 - 100000);
                array2[j] = 100000 + StdRandom.uniform(1000000 - 100000);
            }

            Arrays.sort(array1) ;

            for (int arrayContent : array2) {
               if (Ex_22_BinarySearch.rank(arrayContent, array1) != -1){
                   count++;
               }
            }


    }




}
