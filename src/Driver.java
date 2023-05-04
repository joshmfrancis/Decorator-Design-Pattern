/**
 * File: Driver.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/23/2023
 * Java class description: This class is the Driver class of this program. It
 * uses the combination of an interface, abstract class, concrete children
 * classes, and a class to hold the default behavior to create objects to print
 * to the console in this driver class.
 */

/**
 * Main class - see Main method for more information
 *
 * @author josh
 */
public class Driver 
{

    /**
     * Main method that handles setting the default text, creating the objects,
     * and printing to the console for the individual objects.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Base Text
        Text text = new BaseText("This is a sample text"); // Creates the sample text
        System.out.println("Base text: " + text.getText()); // Printing

        // Bold Text
        Text boldText = new BoldText(text); // Creates a new Text object of Type BoldText
        System.out.println("Bold text: " + boldText.getText()); // Printing

        // Italic Text
        Text italicText = new ItalicText(text); // Creates a new Text object of Type ItalicText
        System.out.println("Italic text: " + italicText.getText()); // Printing

        // Bold Italic Text
        Text boldItalicText = new ItalicText(new BoldText(text));  // Creates a new Text object of Type ItalicText
        System.out.println("Bold italic text: " + boldItalicText.getText()); // Printing

        //Bold Italic StrikedThrough Text
        Text boldItalicStrikedThroughText = new StrikedThroughText(boldItalicText); // Creates a new Text object of Type StrikedThroughText
        System.out.println("Bold italic text that has a line through it: " + boldItalicStrikedThroughText.getText()); // Printing
    }

}
