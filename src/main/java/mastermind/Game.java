package mastermind;

import java.util.ArrayList;
import java.util.List;

public class Game {
    char[] secretKey;
    int playersAttempt = 0;
    boolean isGameOver =false;
    List<Character> secretList;

    public Game(char[] secretKey) {
        this.secretKey = secretKey;
        secretList = new ArrayList<>();

        for (int i = 0; i < secretKey.length; i++) {
            secretList.add(secretKey[i]);
        }
    }

    public String evaluate(char[] playerResponse) {

        if(gameOver()) {
            return "Game Over";
        }

        playersAttempt++;
        if(isGameOver) {
            return "Game Over";
        }
        int red =0;
        int[] matches = new int[4];
        for (int i = 0; i < secretKey.length; i++) {
            if(secretKey[i] == playerResponse[i]) {
                red++;
                matches[i] =1;
            }
        }

        int white = 0;
        for (int i = 0; i < secretKey.length; i++) {
            if (secretList.contains(playerResponse[i]) && matches[i] != 1){
                white++;
            }
        }
        String result = String.format("%dR%dW", red, white);
        if(playersAttempt > 10 || red == 4) {
            isGameOver = true;
        }
        return result;
    }

    private boolean gameOver() {
        throw new UnsupportedOperationException("figure this out ;-)");
    }
}
