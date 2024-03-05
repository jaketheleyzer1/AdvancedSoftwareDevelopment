import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> numtoRoman = new HashMap<Integer, String>();

        numtoRoman.put(0, "");
        numtoRoman.put(1, "I");
        numtoRoman.put(2, "II");
        numtoRoman.put(3, "III");
        numtoRoman.put(4, "IV");
        numtoRoman.put(5, "V");
        numtoRoman.put(6, "VI");
        numtoRoman.put(7, "VII");
        numtoRoman.put(8, "VIII");
        numtoRoman.put(9, "IX");

        numtoRoman.put(10, "X");
        numtoRoman.put(20, "XX");
        numtoRoman.put(30, "XXX");
        numtoRoman.put(40, "XL");
        numtoRoman.put(50, "L");
        numtoRoman.put(60, "LX");
        numtoRoman.put(70, "LXX");
        numtoRoman.put(80, "LXXX");
        numtoRoman.put(90, "XC");


        numtoRoman.put(100, "C");
        numtoRoman.put(200, "CC");
        numtoRoman.put(300, "CCC");
        numtoRoman.put(400, "CD");
        numtoRoman.put(500, "D");
        numtoRoman.put(600, "DC");
        numtoRoman.put(700, "DCC");
        numtoRoman.put(800, "DCCC");
        numtoRoman.put(900, "CM");

        numtoRoman.put(1000, "M");
        numtoRoman.put(2000, "MM");
        numtoRoman.put(3000, "MMM");

        System.out.println("Would you like to convert from \n1) integer to roman numeral or \n2) from roman numeral to number\n");
        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Enter number to convert (must be under 4000)");
            int num = scanner.nextInt();
            if (num >= 4000){
                System.out.println("Please enter a number under 4000. Try code again.");
                System.exit(0);
            }

            int thousands = num/1000;
            int hundreds = (num/100)%10;
            int tens = (num/10)%10;
            int ones = num%10;

            System.out.print("Roman Numeral: " +
                    numtoRoman.get(thousands*1000) +numtoRoman.get(hundreds*100)+numtoRoman.get(tens*10)+ numtoRoman.get(ones));
        }

        if (choice == 2){


        }
    }
}