package basics.basicProgrammingModel;

public class Transposition_1_1_13 {
    public static void main(String[] args) {
        System.out.println("Hello World! Let's Go!");
        int[][] ar ={{1},{2},{3}};

        System.out.println("转置前----------------->");
        TwoDimensionBooleanArray_1_1_11.printArray(ar);


        System.out.println("转置后----------------->");
        TwoDimensionBooleanArray_1_1_11.printArray( transposition2D(ar));
    }

    public static int[][] transposition2D(int[][] array) {

        int n = array.length;
        int m = 0;
        //遍历查找二维数组中的最大列
        for (int i = 0; i < array.length; i++) {
            if(array[i].length > m)
                m = array[i].length;
        }

        /*****构造结果新二维数组用于存放转置结果*******/
        //初始化新的二维数组
        int[][] newArray = new int[m][n] ;

        //转置
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               newArray[j][i] = array[i][j];
            }
        }
        return newArray;
    }
}
