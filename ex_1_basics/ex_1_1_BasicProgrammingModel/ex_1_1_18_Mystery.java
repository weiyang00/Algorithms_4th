package ex_1_basics.ex_1_1_BasicProgrammingModel;

public class ex_1_1_18_Mystery {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("mystery(2, 25) === " + mystery(2, 25));
        System.out.println("mystery(3, 11) === " + mystery(3, 11));

    }

    public static int mystery(int a , int b) {
      if (b ==0)
          return 0;
      if (b % 2 == 0)
          return mystery(a + a, b/2);
      return mystery(a+a, b/2) + a;
    }

}
