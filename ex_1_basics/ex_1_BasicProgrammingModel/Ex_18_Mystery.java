package ex_1_basics.ex_1_BasicProgrammingModel;

public class Ex_18_Mystery {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("mystery(2, 25) === " + mystery(2, 25));
        System.out.println("mystery(3, 11) === " + mystery(3, 11));
        System.out.println();
        System.out.println("mystery2(2, 25) === " + mystery2(2, 10));
        System.out.println("mystery2(3, 11) === " + mystery2(1, 8));

    }

    public static int mystery(int a , int b) {
      if (b == 0)
          return 0;
      if (b % 2 == 0)
          return mystery(a + a, b/2);//偶数

      return mystery(a+a, b/2) + a;//奇数
    }


    public static int mystery2(int a , int b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0)
            return mystery2(a * a, b/2);//偶数

        return mystery2(a * a, b/2) * a;//奇数
    }

}
