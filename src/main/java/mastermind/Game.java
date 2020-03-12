package mastermind;

public class Game {
    char[] secretKey;

    public Game(char[] secretKey) {
        this.secretKey = secretKey;
    }

    public String evaluate(char[] playerResponse) {
        if (playerResponse.equals(secretKey)) {
            return "4R";
        }
        return "";
    }
}
