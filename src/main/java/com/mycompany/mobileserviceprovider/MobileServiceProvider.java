/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mobileserviceprovider;
import java.util.Scanner;

/**
 *
 * @author tatianaeng
 */
public class MobileServiceProvider
{

    public static void main(String[] args)
    {
        // variables
        String phonePlan;
        int minutesUsed;
        final double defaultCostA = 39.99;
        final double defaultCostB = 59.99;
        final double totalCostC = 69.99;
        double additionalCostA, additionalCostB;
        double totalCostA, totalCostB;
        
        // create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // ask user to enter the letter of which cell phone package they have
        System.out.println("Which cell phone plan do you have? Enter A, B, or C.");
        
        // read user input
        phonePlan = keyboard.nextLine();
        
        // ask user to enter how many minutes they used this month
        System.out.println("How many minutes did you use this month?");
        
        // read user input
        minutesUsed = keyboard.nextInt();
        
        // calculate and display total charges
        if (phonePlan.equalsIgnoreCase("C"))
            {
                System.out.printf("Your phone bill for the month is $%.2f", totalCostC);
            }
        
        else if (phonePlan.equalsIgnoreCase("B") && minutesUsed > 900)
            {
                additionalCostB = (minutesUsed - 900)*0.40;
                totalCostB = defaultCostB + additionalCostB;
                System.out.printf("Your phone bill for the month is $%.2f", totalCostB);
            }
            else if (phonePlan.equalsIgnoreCase("B") && minutesUsed < 900)
            {
                totalCostB = defaultCostB;
                System.out.printf("Your phone bill for the month is $%.2f", totalCostB);
            }
        
        else if (phonePlan.equalsIgnoreCase("A") && minutesUsed > 450)
            {
                additionalCostA = (minutesUsed - 450)*0.45;
                totalCostA = defaultCostA + additionalCostA;
                System.out.printf("Your phone bill for the month is $%.2f", totalCostA);
            }
            else if (phonePlan.equalsIgnoreCase("A") && minutesUsed < 450)
            {
                totalCostA = defaultCostA;
                System.out.printf("Your phone bill for the month is $%.2f", totalCostA);
            }
    }
}

/*

A mobile phone service provider offers 3 different phone plans:

Package A
$39.99 per month for 450 minutes
Each additional minute after that is $0.45

Package B
$59.99 per month for 900 minutes
Each additional minute after that is $0.40

Package C
$69.99 per month for unlimited minutes

Write a program that calculates a customer's monthly bill.
It should ask the user to enter the letter of the package/phone plan they have, as well as how many minutes were used.
Display the total charges.

*/