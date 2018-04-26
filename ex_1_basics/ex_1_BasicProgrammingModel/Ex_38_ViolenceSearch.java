package ex_1_basics.ex_1_BasicProgrammingModel;

import StdLib.In;
import StdLib.StdIn;
import StdLib.StdOut;

import java.util.Arrays;

public class Ex_38_ViolenceSearch {

    public static void main(String[] args) {
        int[] whitelist = In.readInts("../data/largeT.txt");

        System.out.println("加载文件完成， list.length === " + whitelist.length);
        Arrays.sort(whitelist);

        // read key; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            long timeStart = System.currentTimeMillis();
            int res = rank(key, whitelist);
            long timeEnd = System.currentTimeMillis();
            System.out.println("本次搜索耗时"+ (timeEnd -timeStart));
            if (res == -1)
                StdOut.println(key+ " is not in the array");
            else System.out.println(key + " in " + res);
        }
    }


    public static int rank(int key, int[] a) {
        for (int i= 0; i< a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }


}
