package ex_1_Fundamentals.ex_3_BagQueueStack;

import StdLib.StdRandom;

/**
 * Created by weiyang on 2018/5/14.
 *
 * @author weiyang
 * @Title: Please fill file name here
 * @Package
 * @Description: Please fill description of the file here
 * @date 2018/5/14
 */
public class ShuffleArray {

    //随机将double数组中的元素排序
    public static void shuffle (Object[] a) {
        int N = a.length;
        for (int i = 0; i<N; i++){
            //将a[i]和a[i..N-1] 中任意一个元素交换
            int r = i + StdRandom.uniform(N - i);
            Object temp = a[i];
            a[i] = a [r];
            a[r] = temp;
        }
    }

}
