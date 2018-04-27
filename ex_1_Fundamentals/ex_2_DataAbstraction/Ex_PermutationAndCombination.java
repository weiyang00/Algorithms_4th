package ex_1_Fundamentals.ex_2_DataAbstraction;


import ex_1_Fundamentals.ex_1_BasicProgrammingModel.Ex_11_TwoDimensionBooleanArray;

//排列组合算法
public class Ex_PermutationAndCombination {

    public static void main(String[] args) {

//        int[] a = {0,1,1,0,0,1,1};
////        arrRank(a,6);
//        for (int i: a){
//            System.out.print(i + ", ");
//        }

        System.out.println();
        System.out.println();
        System.out.println();


        Ex_11_TwoDimensionBooleanArray.printArray(combination(5,1));

//        System.out.print("转换以后");
//        for (int i:  change10To01(a)){
//            System.out.print(i + ", ");
//        }



    }



    //全排列递归算法:
//    现以{1, 2, 3, 4, 5}为例说明如何编写全排列的递归算法。

//    1、首先看最后两个数4, 5。 它们的全排列为4 5和5 4, 即以4开头的5的全排列和以5开头的4的全排列。由于一个数的全排列就是其本身，从而得到以上结果。
//    2、再看后三个数3, 4, 5。它们的全排列为3 4 5、3 5 4、 4 3 5、 4 5 3、 5 3 4、 5 4 3 六组数。
//    即以3开头的和4,5的全排列的组合、以4开头的和3,5的全排列的组合和以5开头的和3,4的全排列的组合.
//    从而可以推断(类推法)，设一组数p = {r1, r2, r3, ... ,rn}, 全排列为perm(p)，pn = p - {rn}。
//    因此perm(p) = r1perm(p1), r2perm(p2), r3perm(p3), ... , rnperm(pn)。当n = 1时perm(p} = r1。
//    为了更容易理解，将整组数中的所有的数分别与第一个数交换，这样就总是在处理后n-1个数的全排列。
    public  static  void fullPermutationByRecursion() {

    }


//    组合算法(n 中取 m 个数)
//    本程序的思路是开一个数组，其下标表示1到n个数，数组元素的值为1表示其下标代表的数被选中，为0则没选中。
//    首先初始化，将数组前m个元素置1，表示第一个组合为前m个数。
//    然后从左到右扫描数组元素值的“10”组合，找到第一个“10”组合后将其变为“01”组合，同时将其左边的所有“1”全部移动到数组的最左端。
//    当第一个“1”移动到数组的n-m的位置，即m个“1”全部移动到最右端时，就得到了最后一个组合。
    public static int[][] combination(int n, int m) {
        if (n <= 1 || m > n)
            return null;

        int count =(int) ( (nFactorial(n))/(nFactorial(m)*nFactorial(n-m)) );

        int[][] newO = new int[count][n];

        //开一个数组，其下标表示1到n个数，
        int[] startArray = new int[n];
        //首先初始化，将数组前m个元素置1，表示第一个组合为前m个数。
        for (int i =0; i< m; i++){
            startArray[i] = 1;
        }
        for (int j = 0; j< startArray.length; j++)
            newO[0][j] = startArray[j];

        for (int i = 1; i< count; i++){
            startArray  = change10To01(startArray);
            for (int j = 0; j< startArray.length; j++)
                newO[i][j] = startArray[j];
        }
        return newO;

    }

    //求阶乘
    public static long nFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*nFactorial(n-1);
    }


    //使数组的 [0, n) 项的 “1” 全部移动到数组的最左端 ，数组必须由0和1组成
    public static int[] arrRank(int[] arr, int n){
        if (n<0)
            return arr;

        for (int i = 0;i< n-1; i++) {
            if(arr[i] == 0 && arr[i+1] == 1) {
                //交换i和i+1的元素
                arr[i] = arr[i] + arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i] - arr[i+1];
            }
        }
        return arrRank(arr, n-1);
    }

    //左到右扫描数组元素值的“10”组合，找到第一个“10”组合后将其变为“01”组合
    public static int[] change10To01(int[] arr ) {

        for (int i = 0; i< arr.length -1; i++){
            if(arr[i]==1 && arr[i+1]==0) {
                //交换i和i+1的元素
                arr[i] = arr[i] + arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i] - arr[i+1];
                arr = arrRank(arr, i);
                break;
            }
        }
        return arr;
    }



}
