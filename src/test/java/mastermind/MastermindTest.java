package mastermind;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MastermindTest {
    @Test
    public void exactMatch() {
        char [] secretKey = {'R', 'B', 'G', 'Y'};
        char [] playerResponse = {'R', 'B', 'G', 'Y'};
        String expectedTip = "4R";

        Game game = new Game(secretKey);
        String actualTip = game.evaluate(playerResponse);

        assertEquals(expectedTip, actualTip);
    }

    @Test
    public void noMatch() {
        char [] secretKey = {'R', 'B', 'G', 'Y'};
        char [] playerResponse = {'W', 'M', 'C', 'O'};
        String expectedTip = "";

        Game game = new Game(secretKey);
        String actualTip = game.evaluate(playerResponse);

        assertEquals(expectedTip, actualTip);
    }

}
