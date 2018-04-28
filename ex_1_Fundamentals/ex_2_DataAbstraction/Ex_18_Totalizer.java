package ex_1_Fundamentals.ex_2_DataAbstraction;

import StdLib.StdIn;

public class Ex_18_Totalizer {

    private double m;
    private double s;
    private int N;

    public void addDataValue(double x) {
        N++;
        s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }

    public double mean() {
        return m;
    }

    public double var() {
        return s / (N - 1);
    }

    public double stddev() {
        return Math.sqrt(this.var());
    }

    public static void main(String[] args) {
        Ex_18_Totalizer accumulator = new Ex_18_Totalizer();
        while(!StdIn.isEmpty()) {
            accumulator.addDataValue(StdIn.readDouble());
        }
        System.out.println("Mean: " + accumulator.mean());
        System.out.println("Var: " + accumulator.var());
        System.out.println("Stddev: " + accumulator.stddev());
    }

}
