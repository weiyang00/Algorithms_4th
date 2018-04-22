package ex_1_basics.ex_1_1_BasicProgrammingModel;

public class ex_15_Histogram {

    public static void main(String[] args) {
        int[] array = {1,4,0,5};
        System.out.println("Hello World!");
        int[] res = histogram(array, 4);

       System.out.println("返回的数组的length === " + res.length);
        System.out.println("返回的数组如下： ");
        for (int i: res ) {
            System.out.print(i+ " ");
        }
    }


    public static int[] histogram(int[] ar, int number) {
        int[] resArray = new int[number];
        for (int i = 0 ; i < number; i++) {
            resArray[i]= getNumberInArray(ar, i);
        }
        return resArray;
    }


    //获取某个值number在一个数组ar中出现的次数
    public static int getNumberInArray (int[] ar, int number) {
        int res = 0;
        for (int i = 0 ; i< ar.length; i++) {
            if(ar[i] == number) {
                ++res;
                System.out.println("result === " + res);
            }
        }
        return res;
    }



}
