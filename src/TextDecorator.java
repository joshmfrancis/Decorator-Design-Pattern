/**
 * File: TextDecorator.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/23/2023
 * Java class description: Abstract class that serves to give access of baseText
 * methods to the concrete classes for adding on the text modifiers. See
 * BoldText, ItalicText, UnderlinedText, and StrikedThroughText for more
 * details.
 */

/**
 * Main abstract class
 * Holds a baseText object for using the dot operator on in the concrete classes
 * extended by this class.
 *
 * @author josh
 */
public abstract class TextDecorator implements Text
{

    // Variale to hold the baseText object
    Text baseText;

}
