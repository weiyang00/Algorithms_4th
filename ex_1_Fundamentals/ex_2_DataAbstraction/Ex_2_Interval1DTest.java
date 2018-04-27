package ex_1_Fundamentals.ex_2_DataAbstraction;

import StdLib.Interval1D;
import StdLib.StdIn;


//未完成
public class Ex_2_Interval1DTest {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int t = StdIn.readInt();

        }
    }



    public static void interval1D(int n) {
        Interval1D[] intervals = new Interval1D[n];
        for (int i = 0; i < n; i++) {
            intervals[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }
    }






}
