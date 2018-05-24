package ex_2_Rank.ex_2_Merge;

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
public class Ex_10_Fast {

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


}
