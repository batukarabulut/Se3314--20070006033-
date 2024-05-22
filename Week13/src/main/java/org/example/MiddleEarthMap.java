package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MiddleEarthMap {
    // Encapsulation: Make 'locations' private to restrict direct access from outside the class.
    private ArrayList<String> locations;

    public MiddleEarthMap() {
        try {
            // Exception Handling: Attempt to load locations, handling file not found exception.
            loadLocations("map.txt");
        } catch (FileNotFoundException e) {
            // Error Handling: Notify the user if the file cannot be found.
            System.err.println("Error: File not found. Please check the filename and try again.");
            // Additional error handling could include logging the error or re-throwing a custom exception.
        }
    }

    // Method for Data Access: Provides controlled access to the locations data.
    public ArrayList<String> getLocations() {
        // Encapsulation: Return a copy of the locations list to prevent external modifications.
        return new ArrayList<>(locations);
    }

    // Improved Modularity: Separate file loading into its own method with clear responsibility.
    private void loadLocations(String fileName) throws FileNotFoundException {
        locations = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            locations.add(scanner.nextLine());
        }
        scanner.close(); // Proper Resource Management: Close the scanner to release system resources.
    }
}