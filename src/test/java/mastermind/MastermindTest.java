package mastermind;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MastermindTest {
    @Test
    public void exactMatch() {
        char [] secretKey = {'R', 'B', 'G', 'Y'};
        char [] playerResponse = {'R', 'B', 'G', 'Y'};
        String expectedTip = "4R0W";

        Game game = new Game(secretKey);
        String actualTip = game.evaluate(playerResponse);

        assertEquals(expectedTip, actualTip);
    }

    @Test
    public void noMatch() {
        char [] secretKey = {'R', 'B', 'G', 'Y'};
        char [] playerResponse = {'W', 'M', 'C', 'O'};
        String expectedTip = "0R0W";

        Game game = new Game(secretKey);
        String actualTip = game.evaluate(playerResponse);

        assertEquals(expectedTip, actualTip);
    }

    @Test
    public void oneMatchSameColorAndSamePosition() {
        char [] secretKey = {'R', 'B', 'G', 'Y'};
        char [] playerResponse = {'R', 'M', 'C', 'O'};
        String expectedTip = "1R0W";

        Game game = new Game(secretKey);
        String actualTip = game.evaluate(playerResponse);

        assertEquals(expectedTip, actualTip);
    }

    @Test
    public void oneMatchSameColorAndDifferentPosition() {
        char [] secretKey = {'R', 'B', 'G', 'Y'};
        char [] playerResponse = {'W', 'M', 'R', 'O'};
        String expectedTip = "0R1W";

        Game game = new Game(secretKey);
        String actualTip = game.evaluate(playerResponse);

        assertEquals(expectedTip, actualTip);
    }

    @Test
    public void getsOneWhiteOneRed() {
        char [] secretKey = {'R', 'B', 'G', 'Y'};
        char [] playerResponse = {'W', 'B', 'R', 'O'};
        String expectedTip = "1R1W";

        Game game = new Game(secretKey);
        String actualTip = game.evaluate(playerResponse);

        assertEquals(expectedTip, actualTip);
    }
}
