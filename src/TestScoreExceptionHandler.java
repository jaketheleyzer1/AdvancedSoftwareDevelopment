import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScoreExceptionHandler {
    public static void  main(String[] args) throws TestScoreException {

        Scanner scanner = new Scanner(System.in);



            try {
                System.out.println("Enter a numerical grade to be converted into a letter grade:  ");
                double numericalGrade = scanner.nextDouble();
                if (numericalGrade < 0 || numericalGrade > 100) {
                    throw new TestScoreException("Please enter a value between 0 and 100");
                }


                if(numericalGrade<60){System.out.println("You got an F!");}
                else if(numericalGrade<70){System.out.println("You got a D!");}
                else if(numericalGrade<80){System.out.println("You got a C!");}
                else if(numericalGrade<90){System.out.println("You got a B!");}
                else {System.out.println("You got an A!");}


            } catch (InputMismatchException e) {
                throw new TestScoreException("You did not enter a number.");
            } finally {
                scanner.close();

            }

        }
    }

