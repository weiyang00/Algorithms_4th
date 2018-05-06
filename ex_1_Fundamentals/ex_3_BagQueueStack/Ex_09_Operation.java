package ex_1_Fundamentals.ex_3_BagQueueStack;

import StdLib.StdIn;

public class Ex_09_Operation {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            System.out.println(operation(s));
        }
    }

    public static String operation(String initial) {
        Stack<String> ops  = new Stack<String>();
        Stack<String> vals = new Stack<String>();

        for  (int i = 0; i < initial.length(); i++) {
            String c = String.valueOf(initial.charAt(i));
            if (c.equals("("));
            else if(c.equals("+") ||
                    c.equals("-") ||
                    c.equals("*") ||
                    c.equals("/") ||
                    c.equals("sqrt")) ops.push(c);
            else if(c.equals(")")) {
                String op = ops.pop();
                String va = vals.pop();

                if (c.equals("+") ||
                    c.equals("-") ||
                    c.equals("*") ||
                    c.equals("/"))
                    va = String.format("( %s %s %s )", vals.pop(), op, va);
                if (c.equals("sqrt"))
                    va = String.format("( %s %s )",  op, va);

                vals.push(va);
            }
            else vals.push(c);
        }
        return vals.pop();
    }

}
