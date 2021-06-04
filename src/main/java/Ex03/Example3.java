package Ex03;
import java.util.Scanner;
/* Quotation marks are often used to denote the start and end of a string.
 But sometimes we need to print out the quotation marks themselves by using escape characters.
 Create a program that prompts for a quote and an author.
 Display the quotation and author as shown in the example output.
 */

/* UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Richard Pekarski
 */


public class Example3 {
    public static void main(String[] args)
    {
        System.out.print("What is the quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input.nextLine();
        System.out.print(author + " says, \"" + quote + "\"");
    }
}
