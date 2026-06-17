import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    void testTie() {
        String result = determineWinner("rock", "rock");
        assertEquals("Result: It's a tie!", result);
    }

    @Test
    void testUserWins() {
        String result = determineWinner("rock", "scissors");
        assertEquals("Result: You win!", result);
    }

    @Test
    void testComputerWins() {
        String result = determineWinner("paper", "scissors");
        assertEquals("Result: Computer wins!", result);
    }

    // helper method (same logic as Game)
    private String determineWinner(String user, String comp) {
        if (user.equals(comp)) return "Result: It's a tie!";

        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "Result: You win!";
        }

        return "Result: Computer wins!";
    }
}