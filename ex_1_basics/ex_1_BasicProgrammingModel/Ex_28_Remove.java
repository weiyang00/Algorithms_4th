package ex_1_basics.ex_1_BasicProgrammingModel;

import StdLib.In;
import StdLib.StdIn;
import StdLib.StdOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_28_Remove {

    public static void main(String[] args) {
        int[] whitelist = In.readInts("../txt/largeW.txt");

        System.out.println("加载文件完成， list.length === " + whitelist.length);
        Arrays.sort(whitelist);

        System.out.println("去重后的数组大小为 === " + remove(whitelist).length  );

    }


    public static int[] remove (int[] ints) {
        List intList = new ArrayList();
        intList.add(ints[0]);
        if(ints.length == 1)
            return new int[0];

        for (int i = 1; i< ints.length - 1; i++){
            if(ints[i] != (int)intList.get(intList.size()-1)) {
                intList.add(ints[i]);
            }
        }
        return toArray(intList);
    }

    //集合转数组
    public static int[] toArray(List list) {

        if (list.size() == 1) {
            return new int[0];
        }

        int[] ints = new int[list.size()];
        for (int i = 0; i< list.size()-1; i++){
            ints[i] = (int)list.get(i);
        }

        return ints;
    }


}
