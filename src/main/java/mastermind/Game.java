package mastermind;

public class Game {
    char[] secretKey;

    public Game(char[] secretKey) {
        this.secretKey = secretKey;
    }

    public String evaluate(char[] playerResponse) {
        int fullMatch =0;
        for (int i = 0; i < secretKey.length; i++) {
            if(secretKey[i] == playerResponse[i]) {
                fullMatch++;
            }
        }
        if(fullMatch >0) return String.format("%dR",fullMatch);

        return "";
    }
}
