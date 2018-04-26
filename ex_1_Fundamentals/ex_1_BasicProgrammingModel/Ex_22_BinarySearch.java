package ex_1_Fundamentals.ex_1_BasicProgrammingModel;

import StdLib.*;

import java.util.Arrays;

public class Ex_22_BinarySearch {

    static int account = 0;//递归深度计数器

    // precondition: array a[] is sorted ，循环实现
    public static int rank1(int key, int[] a) {
        System.out.println("开始排序， key === " + key);
        int lo = 0,//低地址
            hi = a.length - 1,//高地址
            indent = 0;
        while (lo <= hi) {
            StdOut.printf("%s%-4d%d\n", repeat(4*indent++, ' '), lo, hi);

            // Key is in a[lo..hi] or not present.
            //此处的lo 作为索引初始的初始值，所以必须加，mid 表示数组中间值的索引（剩余有效元素的中间值），无效的元素并没有被删除
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    private static String repeat(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
            s += c;
        return s;
    }

    public static void main(String[] args) {
       int[] whitelist = In.readInts("../data/largeW.txt");

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


    //递归实现
    public static int rank(int key, int[] a) {
        account = 0;
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
    //如果key在a[]中， 它的索引不会小于lo且大于hi
        ++account;

        if(lo > hi)
            return  -1;
        int mid = lo + (hi - lo)/2;
        if (key < a[mid])
            return rank(key, a, lo, mid -1);
        if (key > a[mid])
            return rank(key, a, mid + 1, hi);
        return mid;
    }

}
