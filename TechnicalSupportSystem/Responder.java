import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class Responder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Responder
{
    private Random randomGenerator; // 1
    private ArrayList<String> responses;// 2

    /**
     * Constructor a Responder- nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random(); // 3
        responses = new ArrayList<String>(); // 4
        fillResponses(); // 5
    }

    /**
     * Generate a response.
     * @return A string that should be displayed as the response
     */
    public String generateResponse(String input){ // note what happens in 
        // SupportSystem class on line 42 (String input = reader.getInput()), and
        // line 48 (String response = responder.generateResponse(input)) when the
        // input parameyter is not provided here.

        // do some thinking
        // respond
        //return "That sound interesting. Tell me more...";

        // pick a random number for the index in the default response list. The 
        // number will be between 0(inclusive) and the size of the list(exclusive).
        int index = randomGenerator.nextInt(responses.size()); // 6
        return responses.get(index); // 7
    }

    private void fillResponses(){
        responses.add("That sounds odd. Could you describe that problem");
        responses.add("No other customer has ever complained about that. " +
        "What is your system configuration?");
        responses.add("That sounds interesting. Tell me more ...");
        responses.add("I need a bit more information on that.");
        responses.add("Have you chwckwd you do not have a dll configuration " +
        "problem");
        responses.add("That is explained in the manual, have you read it?");
        responses.add("Your description is a bit wishy-washy. Have you someone "
        + "with you there who could describe this problem better?");
        responses.add("That is not a bug, it is a feature");
        responses.add("Could you elaborate on that?");
        responses.add("Have you tried turning it off and on?");

    }
}