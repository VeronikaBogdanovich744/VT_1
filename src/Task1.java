public class Task1 {

    private static double getNumerator(double x,double y){
        double sum = x+y;
        double result = Math.sin(sum) * Math.sin(sum);
        result += 1;
        return result;
    }

    private static double getDenumerator(double x,double y){
        double numerator = 2 * x;
        double denominator = 1 + Math.pow(x,2) * Math.pow(y,2);
        double toAbs = x - numerator / denominator;
        return 2 + Math.abs(toAbs);
    }

    private static double Function(double x, double y){
        double numerator = getNumerator(x, y);
        double denominator = getDenumerator(x, y);
        return numerator / denominator + x;
    }

    public static void main(String[] args) {
        System.out.println("f(3.4,2.1) = " + Function(3.4, 2.1));
        System.out.println("f(0,1) = " + Function(0, 1));
        System.out.println("f(1,0) = " + Function(1, 0));
    }
}