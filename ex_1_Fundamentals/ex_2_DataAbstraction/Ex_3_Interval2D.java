package ex_1_Fundamentals.ex_2_DataAbstraction;

import StdLib.*;

public class Ex_3_Interval2D {


    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int t = StdIn.readInt();

            double max = StdIn.readInt();
            double min = StdIn.readInt();

            initInterval2d(t, max, min);
        }
    }




    public static void initInterval2d(int n, double max, double min) {
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        Point2D[] leftTopPoints = new Point2D[n];
        Point2D[] rightBottomPoints = new Point2D[n];
        Interval2D[] intervals = new Interval2D[n];

        for (int i= 0; i< n; i++){
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);
            double left, right, top, bottom;
            Interval1D x, y;
            if (a < b) {
                left = a;
                right = b;
            } else {
                left = b;
                right = a;
            }

            x = new Interval1D(left, right);

            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);
            if (a < b) {
                top = a;
                bottom = b;
            } else {
                top = b;
                bottom = a;
            }
            y = new Interval1D(top, bottom);

            leftTopPoints[i] = new Point2D(left, top);
            rightBottomPoints[i] = new Point2D(right, bottom);

            intervals[i] = new Interval2D(x, y);
            intervals[i].draw();
        }
    }



}
