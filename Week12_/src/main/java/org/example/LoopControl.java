package org.example;

import java.util.Random;

public class LoopControl {

    /**
     * _effects_: Calculates the sum of the squares of the first 10 positive integers.
     * @return the calculated sum.
     */
    public static int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i*i;
        }
        return sum;
    }

    /**
     * _effects_: Outputs a right-angled triangle made of asterisks (*), where the triangle’s height is 5 lines.
     */
    public static void printTriangle() {
        String asterisk = "*";
        for (int i = 0; i < 5; i++) {
            System.out.println(asterisk.repeat(i+1));
        }
    }

    /**
     * _effects_: Modifies the loop control variable incorrectly, demonstrating a violation of the ModifiedControlVariable rule.
     */
    public static void modifyIndexIncorrectly() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i == 6) {
                i = 10;
            }
        }
    }

    /**
     * _effects_: Demonstrates incorrect usage of a loop variable by declaring and initializing it far apart.
     */
    public void incorrectVariableUsage() {
        int index;
        // Some other code
        System.out.println("Preparing to loop...");
        // Loop starts much later after declaration
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    /**
     * _effects_: Demonstrates correct usage of a loop variable by declaring and initializing it within the loop construct.
     */
    public void correctVariableUsage() {
        System.out.println("Preparing to loop...");
        for (int index = 0; index < 5; index++) {
            System.out.println(index);
        }
    }

    /**
     * _effects_: Demonstrates an empty else block in a loop, showing a potential code smell.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            }
            //Removed the empty else
        }
    }

    /**
     * _effects_: Incorrectly modifies the loop control variable within the loop body, which can lead to unexpected behavior.
     */
    //This method is corrected at the correctlyModifiedControlVariable method.
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Incorrect - modifying control variable inside the loop
                System.out.println("to " + m);
            }
        }
    }

    /**
     * _effects_: Demonstrates correctly modifying the loop control variable in a while loop based on an external condition.
     */
    public void correctlyModifiedControlVariable() {
        int i = 0;
        while (i < 10) {
            System.out.println("Current index: " + i);
            if (new Random().nextBoolean()) { // Random condition for demonstration
                System.out.println("Randomly skipping two steps from index: " + i);
                i += 2; // Correctly modifying control variable as per some external condition
            } else {
                i++;
            }
        }
    }
}
