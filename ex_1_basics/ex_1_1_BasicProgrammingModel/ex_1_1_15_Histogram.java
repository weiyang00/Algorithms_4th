package ex_1_basics.ex_1_1_BasicProgrammingModel;

public class ex_1_1_15_Histogram {
    public static void main(String[] args) {
        int[] array = {1,1,1,1};
        System.out.println("Hello World!");
        int[] res = histogram(array, 4);

        System.out.println("返回的数组的length === " + res.length);

        for (int i: res ) {
            System.out.println(i);
        }


    }

    public static int[] histogram(int[] ar, int number) {
        int[] resArray = new int[number];
        for (int i = 0 ; i < number; i++) {
            resArray[i]= getNumberInArray(ar, i);
        }
        return resArray;
    }

    //获取某个值在一个数组中出现的次数
    public static int getNumberInArray (int[] ar, int number) {
        int res = 0;
        for (int i = 0 ; i< number; i++) {
            if(ar[i] == i) {
                ++res;
            }
        }
        return res;
    }

}
