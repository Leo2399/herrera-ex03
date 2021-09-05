/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution03 {
    /*
    print "What is the quote?"
    'quote' = string input from user

    print "Who said it?"
    'name' = string input from user

    print "'name' says 'quote'"
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String name = input.nextLine();

        System.out.println(name + " says, " + "\"" + quote + "\"");
    }
}
