import java.util.HashMap;

/**
 * Write a description of class PhoneBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneBook
{
    private HashMap<String, String> numbers;

    public PhoneBook() {
        numbers = new HashMap<String, String>();
    }

    public void saveNumber(String name,String number) {
        // numbers.put(name, number);
        numbers.put(name.toLowerCase(), number);
    }

    public String lookupNumber(String name) {
        //return numbers.get(name);
        return numbers.get(name.toLowerCase());
    }
}

