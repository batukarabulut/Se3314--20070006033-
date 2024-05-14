package org.example;

public class ExampleUsage {

    /**
     * _effects_: Filters and counts even numbers in an array of integers from 1 to 20.
     * @return the number of even numbers.
     */
    public static int filterAndCountEvenNumbers() {
        int[] arr = new int[20];
        int count = 0;

        for (int i = 1; i <= 20; i++) {
            arr[i-1] = i;
        }

        for (int integer: arr) {
            if(integer % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * _requires_: A 3x3 matrix with integer elements.
     * _effects_: Calculates the sum of diagonal elements.
     * @param matrix the 3x3 matrix to calculate the diagonal sum of
     * @return the calculated sum
     */
    public static int matrixDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    /**
     * _effects_: Display the even numbers from 1 to 10.
     */
    // Method to demonstrate using loops to filter data
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Display even numbers only
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }

    /**
     * _effects_: Sums an array of integers and prints the sum.
     * @return the sum of the array elements
     */
    // Method to sum an array of integers demonstrating the use of loops and variable scope
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0; // Correct usage of variable scope
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    /**
     * _effects_: Processes and prints each element of a 3x3 matrix.
     */
    // Example of using nested loops to process multidimensional data
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Iterate over each row and column of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }
}
