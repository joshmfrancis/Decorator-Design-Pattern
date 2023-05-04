/**
 * File: Text.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/23/2023
 * Java class description: Interface that is implemented in TextDecorator, since
 * it is implementing in an abstract class, it is passed on to it's children who
 * are concrete classes
 */

/**
 * Interface that holds the getText method to be used in the classes it is
 * implemented in, for use in changing the default printing
 *
 * @author josh
 */
public interface Text
{

    /**
     * Method to implement
     *
     * @return String
     */
    public String getText();
}
