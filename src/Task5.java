import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        int[] array = {5,10,6,12,3,24,7,8};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println(getLongestIncreasingSequence(array));

        int[] array2 = {1,2,3,4,5,6,7,8};
        System.out.println("Array: " + Arrays.toString(array2));
        System.out.println(getLongestIncreasingSequence(array2));

        int[] array3 = {8,7,6,5,4,3,2,1};
        System.out.println("Array: " + Arrays.toString(array3));
        System.out.println(getLongestIncreasingSequence(array3));
    }
    private static int getLongestIncreasingSequence(int numbers[]){
        if (numbers.length == 1) {
            return 1;
        }

        int lengthOfSubsequence[] = new int[numbers.length];
        Arrays.fill(lengthOfSubsequence, 1);

        for (int j = 1; j < numbers.length; j++) {
            for (int k = 0; k < j; k++) {
                if (numbers[j] > numbers[k]) {
                    if (lengthOfSubsequence[j] <= lengthOfSubsequence[k]) {
                        lengthOfSubsequence[j] = lengthOfSubsequence[k] + 1;
                    }
                }
            }
        }

        int maximum = 0;

        for (int length: lengthOfSubsequence) {
            if (maximum<length){
                maximum = length;
            }
        }
        return numbers.length - maximum;
    }
}
