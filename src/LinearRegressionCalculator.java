import java.util.ArrayList;
import java.util.Scanner;

public class LinearRegressionCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many data plots?  ");
        int numDataPoints = scanner.nextInt();
        ArrayList<Integer> xdataPoints = new ArrayList<>();
        ArrayList<Integer> ydataPoints = new ArrayList<>();

        for(int i=1; i<=numDataPoints; i++){
            System.out.print("x" + i +": ");
            xdataPoints.add(scanner.nextInt());

            System.out.print("y" + i +": ");
            ydataPoints.add(scanner.nextInt());
        }

        for(int i: xdataPoints){
            System.out.println("("+xdataPoints.get(i-1) + ","+ydataPoints.get(i-1)+")");
        }
    }

    public void costFunction(ArrayList<Integer> xPoints, ArrayList<Integer> yPoints){
        //double m;
        //double b;
        double sum = 0;
        for(int i: xPoints){
            //m* xPoints.get(i-1)
        }
    }
}
