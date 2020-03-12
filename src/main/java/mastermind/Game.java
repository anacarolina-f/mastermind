package mastermind;

import java.util.ArrayList;
import java.util.List;

public class Game {
    char[] secretKey;
    List<Character> secretList;

    public Game(char[] secretKey) {
        this.secretKey = secretKey;
        secretList = new ArrayList<>();

        for (int i = 0; i < secretKey.length; i++) {
            secretList.add(secretKey[i]);
        }
    }

    public String evaluate(char[] playerResponse) {
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
        return String.format("%dR%dW", red, white);
    }
}
