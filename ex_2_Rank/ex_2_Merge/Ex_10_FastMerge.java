package ex_2_Rank.ex_2_Merge;

import StdLib.StdIn;
import StdLib.StdOut;
import ex_2_Rank.ex_1_Primary.Example;

/**
 * Created by weiyang on 2018/5/24.
 *
 * @Author: weiyang
 * @Package ex_2_Rank.ex_2_Merge
 * @Project: Algorithms_4th
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/5/24 16:36
 */
public class Ex_10_FastMerge {

    private static Comparable[] aux;

    public static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo, j = mid+1;

        for ( ; i<mid; i++)
            aux[i] = a[i];

        for (; j < hi; j++)
            aux[j] = a[hi - j + mid + 1];

        i = lo ;
        j = hi;
        for (int k = lo; k<= hi; k++){
            if (Example.less(aux[i] , aux[j])){
                a[k] = aux[i];
                i++;
            }else {
                a[k] = aux[j];
                j--;
            }
        }

    }


    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
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
        System.out.println("input fast merge demo String : ");
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
