import java.util.ArrayList;
import java.util.HashMap;
public class Queues {
    static ArrayList<String> line1 = new ArrayList<>();
    static ArrayList<String> line2 = new ArrayList<>();
    static ArrayList<String> line3 = new ArrayList<>();
    static ArrayList<String> line4 = new ArrayList<>();
    static ArrayList<String> randomNames = new ArrayList<>();
    static HashMap<Integer, ArrayList<String>> lineNumbers = new HashMap<>();



    public static void setLines() {

        line1.add("Hector");line1.add("Josue");line1.add("Emanuel");line1.add("Adrian");line1.add("Johan");
        line2.add("Eden");line2.add("Brooks");line2.add("Dean");line2.add("Evan");line2.add("Franco");line2.add("Mauricio");
        line3.add("Myles");line3.add("Grant");line3.add("Sheldon");
        line4.add("Jaydan");
        randomNames.add("Emma");randomNames.add("Noah");randomNames.add("Olivia");randomNames.add("Liam");randomNames.add("Ava");randomNames.add("Ethan");randomNames.add("Mason");randomNames.add("Sophia");randomNames.add("Isabella");randomNames.add("Logan");randomNames.add("Mia");randomNames.add("Lucas");randomNames.add("Elijah");randomNames.add("Amelia");randomNames.add("Harper");randomNames.add("Aiden");randomNames.add("Evelyn");randomNames.add("Charlotte");randomNames.add("James");randomNames.add("Abigail");randomNames.add("Benjamin");randomNames.add("Emily");randomNames.add("Alexander");randomNames.add("Madison");randomNames.add("Henry");randomNames.add("Scarlett");randomNames.add("Zoe");randomNames.add("Jack");randomNames.add("Lily");randomNames.add("William");

        lineNumbers.put(1, line1);
        lineNumbers.put(2, line2);
        lineNumbers.put(3, line3);
        lineNumbers.put(4, line4);
}

    public static void printLineSizes() {
        System.out.print("\nLine 1: ");
        for(int i = 0; i < line1.size(); i++) {
            System.out.print(line1.get(i));
            if(i<line1.size()-1)
                System.out.print(", ");
        }
        System.out.print("\n\nLine 2: ");
        for(int i = 0; i < line2.size(); i++) {
            System.out.print(line2.get(i));
            if(i<line2.size()-1)
                System.out.print(", ");
        }
        System.out.print("\n\nLine 3: ");
        for(int i = 0; i < line3.size(); i++) {
            System.out.print(line3.get(i) );
            if(i<line3.size()-1)
                System.out.print(", ");
        }
        System.out.print("\n\nLine 4: ");
        for(int i = 0; i < line4.size(); i++) {
            System.out.print(line4.get(i));
            if (i < line4.size() - 1)
                System.out.print(", ");
        }
    }

    public static String randomName(){
        int rand = (int)Math.random()*30;
        String name = randomNames.get((rand));
        randomNames.remove(rand);
        return name;
    }

    public static int findShortestLine(){
        ArrayList<String> shortest = line1;
        int l =1;
        if(line2.size() < shortest.size()){
            shortest = line2;
            l = 2;
        } if(line3.size() < shortest.size()){
            shortest = line3;
            l = 3;
        } if(line4.size() < shortest.size()){
            shortest = line4;
            l = 4;
        }
        return l;
    }

    //adds a person to the line
    public static void lineEntry(String person, ArrayList line){
        line.add(person);
    }

    //person leaves line
    public static void lineExit(ArrayList line){
        line.remove(0);
    }


}