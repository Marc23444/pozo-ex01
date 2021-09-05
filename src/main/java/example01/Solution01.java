/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */

/*
    PSEUDOCODE
    -Create a way for the user to pass through their name, will probably use a scanner
    -Prompt the user for that input
    -Store the input as a string and display the final message
    -Make sure to put the name in the final message
 */
package example01;

import java.util.Scanner;
public class Solution01 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scan.nextLine();
        System.out.println("Hello, "+name+", nice to meet you!");
    }
}

