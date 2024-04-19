import java.util.Scanner;
public class DoublesSumThatCanCatchException {

    public static void main(String[] args){

        double sum=0;

        int badTries = 0;

        while(true) {
            try {
                if(badTries >2){
                    break;
                }
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter double to be added to the sum");
                double d = scanner.nextDouble();

                sum+=d;

            } catch (Exception e) {
                System.out.println("\nThe input is not a double. Please try again.");
                badTries++;
            }

        }

        System.out.println("\nStill not a double. The sum of the rest of the numbers is " + sum);



    }
}
