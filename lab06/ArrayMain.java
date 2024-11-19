import java.io.*;
import java.util.*;

public class ArrayMain {

    /**
     * Our main method.
     *  - Prompt user for a # of elements.
     *  - Create array of that size, using random values in the range
     *    -1000 to 1000, inclusive.
     *  - Compute and print various things about the array's contents.
     * @param args
     */
    public static void main(String[] args) {
        int numElements = getNumElements();
        if (numElements <= 0) {
            System.out.println("We need a positive number.");
            return;
        }

        // declare and initialize our array
        int[] numberArray = createNumberArray(numElements);

        /////////////////////////////////////////////////////////////////
        //   At this point, the array has been created and initialized.
        /////////////////////////////////////////////////////////////////

        /**
        * For checkpoint 1, Hint: Use two for loops to complete this checkpoint
        * Importance: 
        * The reason for using two separate `for` loops is to clearly differentiate between printing the numbers
        * and printing the dashed line. This makes the code more readable and modular, ensuring that 
        * each loop focuses on a single task. 
        *
        * Context:
        * Students might struggle with writing readable code because they often prioritize functionality 
        * over clarity, especially when learning to solve problems programmatically. Students might try 
        * to merge tasks into a single loop, resulting in cluttered logic that is harder 
        * to debug and maintain. By separating the tasks into two loops, this code demonstrates a practice 
        * of breaking down complex tasks into manageable steps.
        *
        * Justification:
        * This hint might help students better develope strong coding habits and skills as they learn
        * to improve usability and readability of a program output. Adding this comment would 
        * hopefully guide students to print the numbers in a clear and user friendly way 
        * that help distinguish between sections of data. Furthermore, the hint helps highlight 
        * the common use of creating two loops to simplify the logic so that students are not 
        * misunderstanding and over complicating the checkpoint.
        */
   
        // ***** CHECKPOINT 1 *****
        // Print the numbers, followed by a line of dashes
        // Hint: Use two for loops to complete this checkpoint
        for (int i = 0; i < numElements; i++) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < 20; j++) {
            System.out.print("-");
        }
        System.out.println();

        // ***** CHECKPOINT 2 *****
        // Compute/print the average of the numbers
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < numElements; i++) {
            sum = sum + numberArray[i];
        }
        avg = sum / numElements;
        System.out.println("The average of the numbers is " + avg);

        //System.out.println("The average of the numbers is "+???);

        
        // ***** CHECKPOINT 3 *****
        // Set a breakpoint somewhere above and show the contents of the array
        

        // ***** CHECKPOINT 4 *****
        // Find/print the smallest number in the array
        int minimum = numberArray[0];
        for (int i = 0; i < numElements; i++) {
            if (numberArray[i] < minimum) {
                minimum = numberArray[i];
            }
        }
        System.out.println("The minimum element is " + minimum);

        //System.out.println("The minimum element is "+???);


        // ***** CHECKPOINT 5 *****
        // Find/print the percentage of numbers that is even
        double numEven = 0;
        for (int i = 0; i < numElements; i++) {
            if (numberArray[i] % 2 == 0) {
                numEven++;
            }
        }
        double percentage = (numEven / numElements) * 100;
        System.out.println("The percentage of even numbers is " + percentage);

        //System.out.println("The percentage of even numbers is "+???);


        // ***** CHECKPOINT 6 *****
        // Compute/print the percentage of numbers in the range -300 to 300
        double numRange = 0;
        for (int i = 0; i < numElements; i++) {
            if (numberArray[i] >= -300 && numberArray[i] <= 300) {
                numRange++;
            }
        }
        double percentage1 = (numRange / numElements) * 100;
        System.out.println("The percentage of numbers in the range -300..300 is " + percentage1);

        //System.out.println(
        //  "The percentage of numbers in the range -300..300 is "+???);


        // ***** CHECKPOINT 7 *****
        // Sort the numbers and print them out
                for (int i = 0; i < numElements; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[j] > numberArray[i]) {
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        
        // ***** CHECKPOINT 8 *****
        // Print the sorted numbers up to 10 per line
        for (int i = 0; i < numElements; i++) {
            System.out.print(numberArray[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
    
    private static int getNumElements() {
        Scanner keyboard = new Scanner(System.in); // set up for keyboard input

        // prompt user for file name; read file name
        System.out.print("Number of elements: ");
        System.out.flush();
        
        return keyboard.nextInt();
    }

    private static int[] createNumberArray(int numElements) {
        Random rand = new Random();
        return rand.ints(numElements, -1000, 1001).toArray();
    }
}
