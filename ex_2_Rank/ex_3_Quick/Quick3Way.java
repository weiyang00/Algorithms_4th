package ex_2_Rank.ex_3_Quick;

import StdLib.StdIn;
import StdLib.StdOut;
import StdLib.StdRandom;

/**
 * Created by weiyang on 2018/5/26.
 *
 * @Author: weiyang
 * @Package ex_2_Rank.ex_3_Quick
 * @Project: Algorithms_4th
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/5/26 17:01
 */
public class Quick3Way {

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo) return;
        int lt = lo, i = lo +1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt){
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt++);
            else i++;
        }
        sort(a, lo, lt -1);
        sort(a, gt + 1, hi);
    }



    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("input merge demo String : ");
        System.out.println("1,3,4,5,9,8,7,6,5,0,2");
        System.out.println("Correct result : 0 1 2 3 4 5 5 6 7 8 9");
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            String[] a = s.split(",");
            sort(a);
            assert isSorted(a);
            show(a);
        }
    }






}
