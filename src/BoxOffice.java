import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BoxOffice extends Queues {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("\n\n\n\n  ___________");
        System.out.println(" /           \\ ");
        System.out.println("|   TICKETS   |");
        System.out.println("|     $$      |");
        System.out.println(" \\___________/ ");
        System.out.println("     ||||");
        System.out.println("     ||||\n\nWelcome to the Box Office!\n\n");

        setLines();
        printLineSizes();
        int simNumber = 0;
        //TimeUnit.SECONDS.sleep((5));


        while (simNumber < 10) {
            TimeUnit.SECONDS.sleep((long) (Math.random() * 5));

            //50% that someone will walk into the line
            if (Math.random()*2 > 1) {
                String newPerson = randomName();
                System.out.println("\n\n\n" + newPerson + " WALKS INTO THE BOX OFFICE AND GOES TO THE SHORTEST LINE: line " + findShortestLine());
                lineEntry(newPerson, lineNumbers.get(findShortestLine()));
                printLineSizes();
                simNumber++;
            }
            //Someone leaves the line
            else{
                ArrayList<String> lineOfExit = lineNumbers.get((int)(Math.random()*4)+1);
                String newPerson = lineOfExit.get(0);
                System.out.println("\n\n\n" + newPerson + " GOT THEIR TICKET AND LEFT THE BOX OFFICE.");
                lineExit(lineOfExit);
                printLineSizes();
                simNumber++;
            }
        }

    }
}
