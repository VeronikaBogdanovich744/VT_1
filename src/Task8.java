import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        double[] a = new double[]{2,5,8,10,14,15};
        System.out.println("Array a: " + Arrays.toString(a));
        double[] b = new double[]{3,5,6,11,17,18,19,20};
        System.out.println("Array b: " + Arrays.toString(b));

        int[] positions = getPositions(a,b);
        System.out.println("Positions of array b in array a: " + Arrays.toString(positions));
    }

    private static int[] getPositions(double[] a, double[] b){
        int[] positions = new int[b.length];
        int j=0;
        for(int i=0;i<b.length;i++){
            while(j<a.length && a[j]<b[i]){
                j++;
            }
            positions[i]=j+i;
        }

        return positions;
    }

}
