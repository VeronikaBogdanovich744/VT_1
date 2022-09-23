import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        printResults(getValuesOnInterval(5,2,1));
        printResults(getValuesOnInterval(2,5,1));
    }

    private static ArrayList<Pair> getValuesOnInterval(double a, double b, double step){
        if (a>b){
            double temp = a;
            a= b;
            b = temp;
        }

        ArrayList<Pair> list = new ArrayList<Pair>();
        for(double i = a; i <=b; i=i+step){
            list.add(new Pair(i,Math.tan(i)));
        }
        return list;
    }

    private static void printResults(ArrayList<Pair> list){
        System.out.println("Calculation table:");
        System.out.println("==========================");
        System.out.printf("|%10s|%10s|\n", "X =    ", "    F(X) =   ");
        System.out.println("==========================");
        for (Pair obj : list){
            System.out.printf("|%10.2f|%13.2f|\n", obj.x, obj.result);
        }
        System.out.println("==========================");
    }
}

class Pair{
    Pair(double X, double   Result){
        result = Result;
        x = X;
    }
    double result;
    double x;
}
