import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        double[] array = new double[]{1,2,3,4,5,6,7,8};
        var matrix = createMatrix(array);
        printMatrix(matrix);
    }

    private static double[][] createMatrix(double[] array){
        double[][] resultArray = new double[array.length][array.length];
        for(int i=0; i<array.length;i++){
            int j = i;
           for( int k=0;k< array.length;k++) {
               resultArray[i][k] = array[j];
               j = (j+1) % array.length;
           }
        }
        return resultArray;

    }

    private static void printMatrix(double[][] array){
        for(int i=0; i< array.length;i++){
            System.out.println( Arrays.toString(array[i]));
        }
    }
}
