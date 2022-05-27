import java.util.Scanner;
/**
 * Write a description of class InputReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a set of words. These will be mathced aganst the keywords 
     * in our HashMap instance.
     *
     * @return  A set of Strings, where each String is one of the 
     *          words typed by the user
     */
    
    public String getInput(){ 
        System.out.println("> "); // print input
        String inputLine = reader.nextLine();
        return inputLine;
    }
}
