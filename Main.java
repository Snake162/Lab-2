package edu.cscc;

import java.util.Scanner;
import java.lang.Math;

// Michael Heironimus, 1.23.20, The purpose of this program is to use the Saffir-Simpson scale to categorize a storm based on given wind speeds in mph
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double speed;
        // changed to double so fractions are allowed because the user will likely try and use them and rather than crashing the program with an error it will accept them but tell the user to use whole numbers only
        String classification;
        System.out.println("Please enter the current wind speed(in mph):");
        speed = input.nextDouble();
        while (speed < 0 || speed-Math.floor(speed)!=0) {
            // the "speed-Math.floor(speed) !=0 was added so that rather than simply crashing with no explanation if a decimal is used the program will prompt the user to try again stating that whole numbers are all that is accepted.
            // this is completely unnecessary, but I thought had better user interface to loop and tell the user what they did wrong rather than simply crashing.
            System.out.println("Please enter the current wind speed (in mph and positive whole numbers only): ");
            speed = input.nextDouble();
        }
        //changed the output for this part to a while loop instead of simply outputing "invalid input" has the same effect but instead the user doesn't need to restart program
        if (speed<=38){
            classification = "Not in Scale, enjoy the nice weather!";
            //made the message slightly customized if no storm is present.
        } else if (speed < 74) {
            classification = "Tropical Storm";
        } else if (speed < 96) {
            classification = "Category One Hurricane";
        } else if (speed < 111) {
            classification = "Category Two Hurricane";
        } else if (speed < 130) {
            classification = "Category Three Hurricane. Major hurricane, seek shelter immediately or evacuate if necessary!";
            //added warning for what is considered a major hurricane (category 3 and up)
        } else if (speed < 157) {
            classification = "Category Four Hurricane. Major hurricane, seek shelter immediately or evacuate if necessary!";
        } else {
            classification = "Category Five Hurricane. Major hurricane, seek shelter immediately or evacuate if necessary!";
        }
        System.out.println("Classification: " +classification);
    }
}
