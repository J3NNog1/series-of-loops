
import java.util.Scanner;
public class SeriesOfLoops {
    public static void main(String[] args) {
        // in class we are learned about for loops
        // i will have the instructions commented out and any other questions i may have...
        //->

        //1. below display a loop that displayed a string 99 times
        for (int i = 0; i < 99; i++) {
            System.out.println(" This is string number: " + (i + 1));
        }

        //2. a loop that will display every odd number from 1 to 99
        for (int i = 1; i <= 99; i += 2) {
            System.out.println("The odd number displayed in this loop is: " + i);
        }

        //3. a loop that will display every even number 0 to 99
        for (int i = 0; i <= 99; i += 2) {
            System.out.println("The even number displayed in this loop is: " + i );
        }

        //4. a loop that will display ever even number from 0 to 99 a different way
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.println(" The even number displayed in the second version of the even number loop is: " + i );
            }
        }

        //5. a loop that will sum up the odd numbers from 0 to 99 and print it at the end of the loop
        int sumOdd = 1;
        for (int i = 1; i <= 99; i += 2) {
            sumOdd += i;
        }
        System.out.println("The sum of odd numbers from numbers 0 to 99 is..." + sumOdd);

        //6. a loop that will sum up the odd numbers from 0 to 99 and print it at the end of the loop
        int sumEven = 0;
        for (int i = 1; i <= 99; i += 2) {
            sumEven += i;
        }
        System.out.println("The sum of the even numbers from 0 to 99 is..." + sumEven);

        //7. a loop that finds a sum of the numbers between two numbers that were given by the user, inclusive
        Scanner scanner = new Scanner(System.in);
        //get user input for the two numbers
        System.out.println("Enter the starting number: ");
        int startNum = scanner.nextInt();
        System.out.println("Enter the ending number: ");
        int endNum = scanner.nextInt();
        //initialize variable to store the sum
        int sumOfNumbers = 0;
        //create for loop to iterate through the numbers and calculate the sum
        for (int num = startNum; num <= endNum; num++) {
            sumOfNumbers += num;
        }
        System.out.println("The sum of the numbers between " + startNum + " and " + endNum + " is... " + sumOfNumbers);
        //always close scanner to prevent resource leak
        scanner.close();






    }



}
