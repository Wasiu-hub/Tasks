import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader(){
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner(){
        return scanner;
    }

    public int getNumber(String prompt){
        System.out.println(prompt);
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }

    public String getText(String prompt){
        System.out.println(prompt);
        String value = scanner.nextLine();
        return value;
    }
}
