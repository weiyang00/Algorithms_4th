package ex_1_basics.ex_1_BasicProgrammingModel;

public class ex_22_BinarySearch {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0 ,a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
      if(lo > hi)
          return -1;
      int mid = lo + (hi -lo)/2;
      if (key < a[mid])
          return rank(key, a, lo, mid - 1);
      if (key > a[mid])
          return rank(key, a, mid + 1, hi);
      return mid;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

}
