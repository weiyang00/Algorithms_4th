package ex_1_Fundamentals.ex_2_DataAbstraction;

import StdLib.StdIn;
import ex_1_Fundamentals.ex_1_BasicProgrammingModel.Ex_24_GCD;

public class Ex_16_Rational {

    private final double number;
    private final long numerator, denominator;


    public static void main(String[] args) {

        while (!StdIn.isEmpty()) {
            long t = StdIn.readLong();
            long n = StdIn.readLong();



            System.out.println("t = " + t + "  , n = " + n);
            Ex_16_Rational r = new Ex_16_Rational(t, n);


            Ex_16_Rational r2 = r.plus(r);
            System.out.println(r2.toString());
            r2 = r.minus(r);
            System.out.println(r2.toString());
             r2 = r.times(r);
            System.out.println(r2.toString());
             r2 = r.divides(r);
            System.out.println(r2.toString());

            System.out.println(r.equals(r));
        }


    }


    public Ex_16_Rational(long numerator, long denominator) {
        delCommonFactor(numerator, denominator);
        System.out.println("开始初始化r");
        this.number = (double) numerator/ (double) denominator;
        this.denominator = denominator;
        this.numerator = numerator;


    }

    //去公因子
    public void delCommonFactor(long a, long b){
        long GCD = Ex_24_GCD.oujilide(a, b);
        System.out.println("GCD == " + GCD);
        if (GCD == 1)
            return;
        if (GCD != 1){
            a /= GCD;
            b /= GCD;
        }
        delCommonFactor(a ,b);
    }


    public Ex_16_Rational plus(Ex_16_Rational r) {

        return new Ex_16_Rational(this.numerator * r.denominator + this.denominator * r.numerator , this.denominator * r.denominator);
    }

    public Ex_16_Rational minus(Ex_16_Rational r) {
        return new Ex_16_Rational(this.numerator * r.denominator - this.denominator * r.numerator , this.denominator * r.denominator);
    }

    public Ex_16_Rational times(Ex_16_Rational r) {
        return new Ex_16_Rational(this.numerator * r.numerator , this.denominator * r.denominator);
    }

    public Ex_16_Rational divides(Ex_16_Rational r) {
        return new Ex_16_Rational(this.numerator * r.denominator , this.denominator * r.numerator);
    }

    public boolean equals(Ex_16_Rational r) {
        return this.numerator == r.numerator && this.denominator == r.denominator;
    }


    public String toString() {
        return "numerator 分子为： "+ numerator+" ， denominator 分母为： " + denominator+" ，详细为： "+ number;
    }




}



