import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;

/**
 * Write a description of class Responder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Responder
{
    private Random randomGenerator; // 1
    private ArrayList<String> defaultResponses;// 2
    private HashMap<String, String> responseMap;

    /**
     * Constructor a Responder- nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random(); // 3
        defaultResponses = new ArrayList<String>(); // 4
        filldefaultResponses(); // 5
        responseMap = new HashMap<String, String>();
        fillResponseMap();
    }

    /**
     * Generate a response.
     * @return A string that should be displayed as the response
     */
    
    // Task 3
    public String generateResponse(HashSet<String> words){
        
        Iterator<String> it = words.iterator();
        while(it.hasNext()){
            String word = it.next();
            if(responseMap.containsKey(word)) {
                return responseMap.get(word);
            }
        }
        return pickDefaultResponse();
    }
    
    // public String generateResponse(String input){ // note what happens in 
        // // SupportSystem class on line 42 (String input = reader.getInput()), and
        // // line 48 (String response = responder.generateResponse(input)) when the
        // // input parameyter is not provided here.

        // // do some thinking
        // // respond
        // //return "That sound interesting. Tell me more...";

        // // pick a random number for the index in the default response list. The 
        // // number will be between 0(inclusive) and the size of the list(exclusive).
        // int index = randomGenerator.nextInt(defaultResponses.size()); // 6
        // return defaultResponses.get(index); // 7
    // }

    private void filldefaultResponses(){
        defaultResponses.add("That sounds odd. Could you describe that problem");
        defaultResponses.add("No other customer has ever complained about that. " +
        "What is your system configuration?");
        defaultResponses.add("That sounds interesting. Tell me more ...");
        defaultResponses.add("I need a bit more information on that.");
        defaultResponses.add("Have you chwckwd you do not have a dll configuration " +
        "problem");
        defaultResponses.add("That is explained in the manual, have you read it?");
        defaultResponses.add("Your description is a bit wishy-washy. Have you someone "
        + "with you there who could describe this problem better?");
        defaultResponses.add("That is not a bug, it is a feature");
        defaultResponses.add("Could you elaborate on that?");
        defaultResponses.add("Have you tried turning it off and on?");

    }
    
        private void fillResponseMap()
    {
        responseMap.put("crash", 
                        "Well, it never crashes on our system. It must have something\n" +
                        "to do with your system. Tell me more about your configuration.");
        responseMap.put("crashes", 
                        "Well, it never crashes on our system. It must have something\n" +
                        "to do with your system. Tell me more about your configuration.");
        responseMap.put("slow", 
                        "I think this has to do with your hardware. Upgrading your processor\n" +
                        "should solve all performance problems. Have you got a problem with\n" +
                        "our software?");
        responseMap.put("performance", 
                        "Performance was quite adequate in all our tests. Are you running\n" +
                        "any other processes in the background?");
        responseMap.put("bug", 
                        "Well, you know, all software has some bugs. But our software engineers\n" +
                        "are working very hard to fix them. Can you describe the problem a bit\n" +
                        "further?");
        responseMap.put("buggy", 
                        "Well, you know, all software has some bugs. But our software engineers\n" +
                        "are working very hard to fix them. Can you describe the problem a bit\n" +
                        "further?");
        responseMap.put("windows", 
                        "This is a known bug to do with the Windows operating system. Please\n" +
                        "report it to Microsoft. There is nothing we can do about this.");
        responseMap.put("macintosh", 
                        "This is a known bug to do with the Mac operating system. Please\n" +
                        "report it to Apple. There is nothing we can do about this.");
        responseMap.put("expensive", 
                        "The cost of our product is quite competitive. Have you looked around\n" +
                        "and really compared our features?");
        responseMap.put("installation", 
                        "The installation is really quite straight forward. We have tons of\n" +
                        "wizards that do all the work for you. Have you read the installation\n" +
                        "instructions?");
        responseMap.put("memory", 
                        "If you read the system requirements carefully, you will see that the\n" +
                        "specified memory requirements are 1.5 giga byte. You really should\n" +
                        "upgrade your memory. Anything else you want to know?");
        responseMap.put("linux", 
                        "We take Linux support very seriously. But there are some problems.\n" +
                        "Most have to do with incompatible glibc versions. Can you be a bit\n" +
                        "more precise?");
        responseMap.put("bluej", 
                        "Ahhh, BlueJ, yes. We tried to buy out those guys long ago, but\n" +
                        "they simply won't sell... Stubborn people they are. Nothing we can\n" +
                        "do about it, I'm afraid.");
    }
    
    // Task 4
    public String pickDefaultResponse(){
        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }
}