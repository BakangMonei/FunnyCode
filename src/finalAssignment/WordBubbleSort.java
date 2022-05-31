package finalAssignment;

public class WordBubbleSort {

    public static void main(String[] args) {


        long startTime; // Starting time of program, in milliseconds.
        long endTime; // Time when computations are done, in milliseconds.
        double time; // Time difference, in seconds.
        startTime = System.currentTimeMillis();


        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        System.out.print("\nRun time in seconds was: ");
        System.out.println(time);
    }
}