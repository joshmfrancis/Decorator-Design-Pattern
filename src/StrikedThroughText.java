/**
 * File: StrikedThroughText.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/23/2023
 * Java class description: This class is on of the four concrete classes made
 * for extending the abstract class. It extends the abstract TextDecorator class
 * which implements the Text interface, so it has to use it's methods. It
 * overwrites the method based on wanting to write StrikedThrough Text.
 */

/**
 * Class to change the default behavior of baseText
 * @author josh
 */
public class StrikedThroughText extends TextDecorator
{

    // Constructor to pass in the baseText and set it to the global variable
    // held in the abstract class, TextDecorator.
    public StrikedThroughText(Text text)
    {
        this.baseText = text;
    }

    @Override
    /**
     * Overwrites the baseTexts default action by adding on the
     * StrikedThroughText markup modifiers
     */
    public String getText()
    {
        return "<s>" + baseText.getText() + "</s>";
    }

}
