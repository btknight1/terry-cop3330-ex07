/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        System.out.printf("You entered dimensions of %d feet by %d feet.%n", length, width);

        int area = width * length;

        // Use a constant to hold the conversion factor.
        final double CONVERSION_FACTOR = 0.09290304;

        double convert = area * CONVERSION_FACTOR;

        System.out.printf("The area is%n%d square feet%n%.3f square meters", area, convert);
    }
}