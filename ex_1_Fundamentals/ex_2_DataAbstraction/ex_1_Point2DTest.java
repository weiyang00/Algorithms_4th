package ex_1_Fundamentals.ex_2_DataAbstraction;

import StdLib.Point2D;
import StdLib.StdIn;
import StdLib.StdRandom;
import ex_1_Fundamentals.ex_1_BasicProgrammingModel.Ex_11_TwoDimensionBooleanArray;

public class ex_1_Point2DTest {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int t = StdIn.readInt();

            System.out.println(t+" 个点中，两点之间最近的距离是 === " + point2dTest(t));
        }
    }



    public static double point2dTest(int n) {
        if(n == 0 || n == 1){
            System.out.println("参数异常， 请输入大于 1 的值");
            return 0;
        }

        double x = 0;
        double y = 1;
        Point2D[] points = new Point2D[n];

        for(int i = 0; i< n; i++) {
            points[i] = randomPointXandY(x,y);
        }

        //因为排列组合时，使用了阶乘，导致n的值不能大于20，否则会超过long 的长度，导致报错；
        int[][] point2 = Ex_PermutationAndCombination.combination(n , 2);

        double dis = Math.sqrt(2);

        for (int i =0; i< point2.length; i ++){
            int a = 0;
            int b = 0;
            for (int j = 0; j< point2[0].length; j++)
                if (point2[i][j] ==1)
                    if (a == 0)
                    a = j;
            else b = j;

            double distance = point2dDIS(points[a], points[b]);
            System.out.println("各个点的距离分别是 === " + distance);
            if (distance < dis)
                dis = distance;
        }

    return dis;
    }



    //随机生成点的坐标
    public static Point2D randomPointXandY(double a, double b) {
        return new Point2D(StdRandom.uniform(a, b), StdRandom.uniform(a, b));
    }


    //计算两点之间的距离
    public static double point2dDIS(Point2D pointA, Point2D pointB) {
        //勾股定理，求两点之间的距离
       return Math.sqrt( (pointA.x() - pointB.x()) * (pointA.x() - pointB.x()) + (pointA.y() - pointB.y()) * (pointA.y() - pointB.y()) );
    }




}
