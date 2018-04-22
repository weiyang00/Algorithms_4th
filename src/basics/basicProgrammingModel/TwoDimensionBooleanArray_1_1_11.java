package basics.basicProgrammingModel;

public class TwoDimensionBooleanArray_1_1_11 {

    public static void main(String[] args) {
        //step 1:定义一个二维数组
        boolean[][] array = {{true, false, true,false}, {false, true, true}, {false, false}};

        System.out.println("the array.toString() is === "+array);
        System.out.println("the array.length is === " + array.length);

       printArray(array);

       int[][] iArray = {{1,2},{1},{1,2,3}};
        printArray(iArray);

    }

    //打印二维boolean数组
    public static void printArray(boolean[][] bArray) {
        System.out.println("  0 1 2 3 ");
        for (int i = 0; i < bArray.length; i++) {
            System.out.print(i+ " ");
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
        System.out.println("  0 1 2 3 ");
        for (int i = 0; i < bArray.length; i++) {
            System.out.print(i+ " ");
            for ( int j = 0; j< bArray[i].length; j++) {
                System.out.print(bArray[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }



}
