package ex_1_basics.ex_1_BasicProgrammingModel;

import StdLib.In;
import StdLib.StdIn;

import java.util.Arrays;

public class Ex_29_Equivalent {


    public static void main(String[] args) {
        int[] whitelist = In.readInts("../data/largeW.txt");

        System.out.println("加载文件完成， list.length === " + whitelist.length);
        Arrays.sort(whitelist);

        int[] testArray = {0,0,0,1,1,1,2,2,2,3,4,5,6,7};

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int r = rank(key, testArray);
            System.out.println("largeW中小于 " +key+ " 的值的数量为 === " + r);
            int c = count(key, testArray);
            System.out.println("largeW中等于 " +key+ " 的值的数量为 === " + c);
        }

    }




    public static int rank(int key, int[] a) {
        //同样使用二分法查找key的位置
        int lo = 0;
        int hi = a.length-1;

        if (key > a[a.length-1])
            return a.length;
        if (key < a[0])
            return 0;

        while (lo <= hi){
            int mid = lo + (hi -lo)/2;

            if (key < a[mid]) hi = mid - 1;
            if (key > a[mid]) lo = mid + 1;
            if (key == a[mid]) {
                while (--mid >= 0 && a[mid] == key);
                return ++mid;
            }
        }
        return 0;
    }



    public static int count(int key, int[] a) {
       int c = 0;
       for (int i = rank(key, a); i< a.length && a[i] == key; i++) {
           ++c;
       }

        return c;
    }



}
