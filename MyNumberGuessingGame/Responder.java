import java.util.Random;

public class Responder {
    private Random randomNumberGenerator;
    private int secretNumber;

    public Responder(){
        randomNumberGenerator = new Random();
    }

    public Random getRandomNumberGenerator() {
        return randomNumberGenerator;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber() {
        this.secretNumber = randomNumberGenerator.nextInt(10) + 1;
    }

    public String respondToGuess(int guess){
        if (guess == secretNumber) {
            return "done";
        } else {
            if (guess < secretNumber) {
                return "higher";
            } else {
                return "lower";
            }
        }
    }

}
