package basics.basicProgrammingModel;

public class Transposition {
    public static void main(String[] args) {
        System.out.println("Hello World! Let's Go!");
        int[][] ar ={{1},{2},{3}};

        System.out.println("转置前----------------->");
        TwoDimensionBooleanArray_1_1_11.printArray(ar);

        transposition(ar);
        System.out.println("转置后----------------->");
        TwoDimensionBooleanArray_1_1_11.printArray(ar);
    }

    public static int[][] transposition(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length] ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[j][i] = array[i][j];
            }
        }
        return newArray;
    }
}
