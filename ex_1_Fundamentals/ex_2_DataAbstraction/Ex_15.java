package ex_1_Fundamentals.ex_2_DataAbstraction;

import StdLib.In;
import StdLib.StdIn;

public class Ex_15 {
    public static int[] readInts(String name) {
        String[] words = name.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }

    public static void main(String[] args) {

        while (!StdIn.isEmpty()) {
            String t = StdIn.readString();
            int[] ints = readInts(t);
            for (int i = 0; i < ints.length; i++) {
                System.out.println(ints[i]);
            }
        }


    }
}
