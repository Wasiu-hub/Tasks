import java.util.Scanner;

public class InputReader0 {

    private Scanner reader;
    private String inputLine;

    public InputReader0(){
        reader = new Scanner(System.in);
        inputLine = reader.nextLine();
    }

    public Scanner getReader() {
        return reader;
    }

    public String getInputLine() {
        System.out.println("========> ");
        return inputLine;
    }

    //    public String getInput() {
//        System.out.println("> ");
//        String inputLine = reader.nextLine();
//        return inputLine;
//    }


}
