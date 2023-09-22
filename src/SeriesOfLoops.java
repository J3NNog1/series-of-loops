public class SeriesOfLoops {
    public static void main(String[] args) {
        // in class we are learned about for loops
        // i will have the instructions commented out and any other questions i may have...
        //->

        //below display a loop that displayed a string 99 times
        for (int i = 0; i < 99; i++) {
            System.out.println(" This is string number: " + (i + 1));
        }

        //a loop that will display every odd number from 1 to 99
        for (int i = 1; i <= 99; i += 2) {
            System.out.println("The odd number displayed in this loop is: " + i);
        }

        //a loop that will display every even number 0 to 99
        for (int i = 0; i <= 99; i += 2) {
            System.out.println("The even number displayed in this loop is: " + i );
        }
    }
}
