import java.util.HashMap;

/**
 * Write a description of class PhoneBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneBook
{
    private HashMap<String, Person> numbers;

    public PhoneBook() {
        numbers = new HashMap<String, Person>();
    }

    public void saveNumber(String name,Person p) {
        // numbers.put(name, number);
        numbers.put(name.toLowerCase(), p);
    }

    public Person lookupNumber(String name) {
        //return numbers.get(name);
        return numbers.get(name.toLowerCase());
    }
}

