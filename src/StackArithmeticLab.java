import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;
public class StackArithmeticLab {
    public static void main(String[] args) {

        Stack numbers = new Stack();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter postfix Expression: \n\n");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {

            ArrayList<Integer> currNumber = new ArrayList<Integer>();
                int x = 0;
                while(true){
                    if(i+x < input.length() && (input.charAt(i+x) == '1' || input.charAt(i+x) == '2' || input.charAt(i+x) == '3' || input.charAt(i+x) == '4' || input.charAt(i+x) == '5' || input.charAt(i+x) == '6' || input.charAt(i+x) == '7' || input.charAt(i+x) == '8' || input.charAt(i+x) == '9' || input.charAt(i+x) == '0')) {
                        currNumber.add(Integer.parseInt(String.valueOf(input.charAt(i+x))));
                    } else{break;}
                    x++;
                }
                i=i+x;

                if(currNumber.size()>0) {
                    int tempNumber = 0;
                    int power = 0;
                    for (int j = currNumber.size() - 1; j >= 0; j--) {
                        tempNumber += (int) (currNumber.get(j) * Math.pow(10, power));
                        power++;
                    }
                    numbers.add(tempNumber);
                }


                if(input.charAt(i) == '+' ){
                    int expression = (int)numbers.pop() + (int) numbers.pop();
                    numbers.add(expression);
                } if(input.charAt(i) == '-' ) {
                    int temp = (int)numbers.pop();
                    int expression = (int)numbers.pop() - temp;
                numbers.add(expression);
                } if(input.charAt(i) == '*' ){
                   int expression = (int )numbers.pop() * (int) numbers.pop();
                numbers.add(expression);
                }if(input.charAt(i) == '/' ){
                    int temp = (int)numbers.pop();
                    int expression = (int)numbers.pop() / temp;
                numbers.add(expression);
                }

        }


        for(Object n: numbers){
            System.out.println("\nThis expression evaluates to "+ n);
        }

    }
}