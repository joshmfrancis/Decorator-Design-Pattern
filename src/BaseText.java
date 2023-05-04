/**
 * File: BaseText.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/23/2023
 * Java class description: Class to hold the default behavior of the sample
 * text. It implements the Text class to get it's getText method.
 */

/**
 * Class that implements the Text interface
 *
 * @author josh
 */
public class BaseText implements Text
{

    // global variable to hold the default text passed in
    private final String text;

    /**
     * grabs the passed in variable from the user for use in setting the default
     * text
     *
     * @param text
     */
    public BaseText(String text)
    {
        this.text = text;
    }

    @Override
    /**
     * The default behavior of getText() to be modified in other concrete
     * classes
     */
    public String getText()
    {
        return text;
    }
}
