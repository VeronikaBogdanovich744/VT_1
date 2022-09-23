import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println("Array: " + Arrays.toString(array));
        var idList = checkArrayForPrimes(array);
        printPrimeNumberIndexes(idList);


        int[] array2 = {-1,-2,-3,-4,5,6,7,8};
        System.out.println("Array: " + Arrays.toString(array2));
        var idList2 = checkArrayForPrimes(array2);
        printPrimeNumberIndexes(idList2);

    }

    private static boolean isPrime(int x){
        if (x == 1) return false;
        if (x == 2) return true;
        if (x<0) return false;

        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private static ArrayList<Integer> checkArrayForPrimes(int[] array){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i =0 ; i< array.length;i++) {
            if(isPrime(array[i])){
                list.add(i);
            }
        }
        return list;
    }

    private static void printPrimeNumberIndexes(ArrayList<Integer> array){
        System.out.println("Indexes of prime numbers:");
        for (Integer i:array) {
            System.out.print(" "+ i);
        }
        System.out.println();
    }


}
