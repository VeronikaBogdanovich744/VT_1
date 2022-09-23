import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        double[] array = new double[]{1,2,3,5,6,4,7,9,8};
        System.out.println("Array: " + Arrays.toString(array));
        sortShella(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        double[] array2 = new double[]{9,8,7,6,5,4,3,2,1};
        System.out.println("Array: " + Arrays.toString(array2));
        sortShella(array2);
        System.out.println("Sorted array: " + Arrays.toString(array2));

    }
    private static void sortShella(double[] array){
        for (int i = 1; i < array.length; i++){
            double temp = array[i];
            int currId = i;

            while (currId >= 1 && array[currId - 1] >= temp){
                //array[currId] = array[currId - 1];
                //currId--;

                swap(currId,currId-1,array);
                currId--;
            }
           // array[currId] = temp;
        }
    }
    private static void swap(int a, int b, double[] array){
        double temp = array[a];
        array[a]=array[b];
        array[b]=temp;
    }

}
