/* Problem Set 1 - 24 Exception code
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 09/15/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This program asks the user to enter an integer. The the input is taken as an String.
 * It will then parse the string to check if it is an integer
 * If not, the program catches the exception and asks the user to try again.
 */
/**
 * @author Patricia N. Antlitz
 * @version 2.0
 */

import java.util.Scanner;

public class Exception_Example_PatriciaAntlitz {

    public void throwException()
    {
        Scanner scnr = new Scanner(System.in);

        String userInt;
        System.out.println("Please enter an integer: ");
        // .next is used because the while loop would be looking into the next line if .nextLine was used
        userInt = scnr.next();

        while(scnr.hasNextLine()){
            try
            {
                Integer.parseInt(String.valueOf(userInt));
                System.out.println("You entered: " + userInt);
                System.out.println("Thank you!");
                System.exit(0);
            }
            catch(NumberFormatException ex) //NumberFormatException: When the program fails to find an int
            {
                System.out.println("You entered: " + userInt);
                System.out.println("That is not an integer. Please enter an integer: ");
                userInt = scnr.next();
            }
        }
    }

    public static void main(String[] args) {

        Exception_Example_PatriciaAntlitz myException = new Exception_Example_PatriciaAntlitz();
        myException.throwException();
    }
}
