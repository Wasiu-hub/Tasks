
class GameController {

    private InputReader input;
    private Responder responder;

    public GameController() {
        input = new InputReader();
        responder = new Responder();
    }

    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.start();
        //gameController.getInput();
    }

//    public void getInput() {
//        int guess = inputReader.getNumber("Enter a value");
//        System.out.println("Entered number is: " + guess);
//    }

    public void start() {
        printInstruction();
        responder.setSecretNumber();
        boolean playing = true;
        while (playing) {
            int guess;
            guess = input.getNumber("Please enter number between 1 and 10");
            String response;
            response = responder.respondToGuess(guess);
            System.out.println(response);

            if (response.equals("done")){
                response = input.getText("Do you want to play again? yes or no");
                if (response.equals("no")){
                    playing = false;
                } else {
                    responder.setSecretNumber();
                }
            }
        }
        printGoodByeMessage();
    }

    private void printInstruction() {
        System.out.println("Welcome to our guessing game");
        System.out.println("You need to guess our secret number");
        System.out.println("Good luck");
    }

    private void printGoodByeMessage() {
        System.out.println("Thank you for playing");
    }
}


