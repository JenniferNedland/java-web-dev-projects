package org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Area {
    public static void main(String[] args) {

        double r = getRadius();

        double areaOfCircle = Circle.getArea(r);

        DecimalFormat format = new DecimalFormat("0.#####");
        System.out.printf("The area of a circle with a radius of %s is %s.%n", format.format(r),
                format.format(areaOfCircle));

    }

    private static double getRadius() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            while (true) {
                try {
                    double r = input.nextDouble();

                    if (r <= 0.0) {
                        System.out.print("Please enter a number over 0: ");
                    } else {
                        return r;
                    }
                } catch (InputMismatchException e) {
                    String line = input.nextLine();
                    System.out.print(line + " is not a number. \nPlease enter a number: ");
                }
            }
        }
    }
}