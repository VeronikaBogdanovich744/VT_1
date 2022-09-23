public class Task2 {
    public static void main(String[] args) {
        var result = isInRectangle(0,0);
        System.out.println("The point (0,0) belongs to the area: " + result);
        result = isInRectangle(-4,5);
        System.out.println("The point (-4,5) belongs to the area: " + result);
        result = isInRectangle(6,-3);
        System.out.println("The point (6,-3) belongs to the area: " + result);
        result = isInRectangle(9,0);
        System.out.println("The point (9,0) belongs to the area: " + result);
    }

    private static boolean isInUpperRectangle(double x, double y){
        final double X_MIN = -4.0;
        final double X_MAX = 4.0;
        final double Y_MAX = 5.0;
        final double Y_MIN = 0.0;

        return x>=X_MIN && x<=X_MAX && y>=Y_MIN && y<=Y_MAX;
    }

    private static boolean isInLowerRectangle(double x, double y){
        final double X_MIN = -6.0;
        final double X_MAX = 6.0;
        final double Y_MAX = 0.0;
        final double Y_MIN = -3.0;

        return x>=X_MIN && x<=X_MAX && y>=Y_MIN && y<=Y_MAX;
    }

    private static boolean isInRectangle(double x, double y){
        return isInUpperRectangle(x,y) || isInLowerRectangle(x,y);
    }
}
