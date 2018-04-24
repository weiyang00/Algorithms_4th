package ex_1_basics.ex_1_BasicProgrammingModel;

public class Ex_11_TwoDimensionBooleanArray {

    public static void main(String[] args) {
        //step 1:定义一个二维数组
        boolean[][] array = {{true, false, true}, {false, true, true}, {false, false}, {false}};

        System.out.println("the array.toString() is === "+array);
        System.out.println("the array.length is === " + array.length);

       printArray(array);

       int[][] iArray = {{1,2},{1},{1,2,3}};
        printArray(iArray);

    }

    //打印二维boolean数组
    public static void printArray(boolean[][] bArray) {

        //遍历查找二维数组中的最大列
        int m = 0;
        for (int i = 0; i < bArray.length; i++) {
            if(bArray[i].length > m)
                m = bArray[i].length;
        }

        System.out.print("  ");
        for (int i = 0; i< m; i++)
        System.out.print(i+1 + " ");
        System.out.print("\n");

        for (int i = 0; i < bArray.length; i++) {
            System.out.print(i+1+ " ");
            for ( int j = 0; j< bArray[i].length; j++) {
                if(bArray[i][j] == true)
                    System.out.print("* ");
                else
                    System.out.print("# ");
            }
            System.out.print("\n");
        }
    }

    //打印二维int数组
    public static void printArray(int[][] bArray) {
        //遍历查找二维数组中的最大列
        int m = 0;
        for (int i = 0; i < bArray.length; i++) {
            if(bArray[i].length > m)
                m = bArray[i].length;
        }

        System.out.print("  ");
        for (int i = 0; i< m; i++)
            System.out.print(i+1 + " ");
        System.out.print("\n");

        for (int i = 0; i < bArray.length; i++) {
            System.out.print(i+1+ " ");
            for ( int j = 0; j< bArray[i].length; j++) {
                System.out.print(bArray[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }


}
