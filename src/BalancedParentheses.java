import java.util.ArrayList;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string and I will tell you whether the parentheses are balanced or not");
        String input = scanner.nextLine();
        ArrayList<Character> brackets = new ArrayList<>();


        for(int i =0; i<input.length();i++){
            char currentChar = input.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '[' || currentChar == '<' ){
                brackets.add(currentChar);
            }
            else if(currentChar == ')'){
                if(brackets.get(brackets.size()-1) == '(')
                    brackets.remove(brackets.size()-1);
                else{System.out.println("Invalid");System.exit(0);}

            } else if(currentChar == '}') {
                if(brackets.get(brackets.size()-1) == '{')
                    brackets.remove(brackets.size()-1);
                else{System.out.println("Invalid");System.exit(0);}

            } else if(currentChar == ']') {
                if(brackets.get(brackets.size()-1) == '[')
                    brackets.remove(brackets.size()-1);
                else{System.out.println("Invalid");System.exit(0);}

            } else if(currentChar == '>') {
                if(brackets.get(brackets.size()-1) == '<')
                    brackets.remove(brackets.size()-1);
                else{System.out.println("Invalid");System.exit(0);}
            }
        }
        System.out.println("Valid");
    }
}
