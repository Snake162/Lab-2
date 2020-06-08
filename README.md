CSCI-2467 Lab 2 – Hurricane Wind Scale
Background
The intensity of a hurricane is classified according to the Saffir-Simpson hurricane wind scale. The scale together with wind classifications of lower intensities is shown below:
Hurricane Wind Scale Classification	Wind Speed Range (MPH)
Not in scale	0 – 38 mph
Tropical storm	39 – 73 mph
Category One Hurricane	74 – 95 mph
Category Two Hurricane	96 – 110 mph
Category Three Hurricane	111 – 129 mph
Category Four Hurricane	130 – 156 mph
Category Five Hurricane	157 mph or more

Assignment
Write a Java program that asks the user to enter the wind speed. Use a series of nested if statements to determine the intensity of the storm using the above table. Output your result.
Validate your input to check for (invalid) negative wind speeds. For invalid wind speeds – output the classification: Invalid input.
Be sure to include a comment with your name, date, and a short description of the program.
Begin your program as follows:
package edu.cscc;

import java.util.Scanner;

// TODO - add name, date, and purpose of program here
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       long speed;
       String classification;
        // TODO - write your program here
    }
}

Example Output
Enter wind speed (mph): 129
Classification: Category Three Hurricane 

Additional Information
Do not include unnecessary if statements or unnecessary logical AND/OR clauses in your code.
