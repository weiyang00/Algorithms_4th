package ex_1_Fundamentals.ex_2_DataAbstraction;

import StdLib.StdIn;

public class Ex_6_CircularRotationTest {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String t = StdIn.readString();
            String s = StdIn.readString();

            //将其中一个字符串和自己相连，生成的字符串是否包含了另一个字符串
            if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0) {
                System.out.println(s + " is the circular rotation of " + t);
            } else {
                System.out.println(s + " is not the circular rotation of " + t);
            }
        }
    }

}
