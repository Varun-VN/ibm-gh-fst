package fst;

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

class Player {
    protected String move;

    public String getMove() {
        return move;
    }
}

class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    public void chooseMove() {
        while (true) {
            try {
                System.out.print("Enter rock, paper, or scissors: ");
                String input = scanner.nextLine().toLowerCase();

                if (input == null || input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Empty input!");
                }

                if (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")) {
                    throw new IllegalArgumentException("Invalid Move!");
                }

                move = input;
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Move! Try again.");
            } catch (Exception e) {
                System.out.println("Unexpected error. Try again.");
            }
        }
    }
}

class ComputerPlayer extends Player {
    private Random random = new Random();
    private static final String[] MOVES = {"rock", "paper", "scissors"};

    public void chooseMove() {
        move = MOVES[random.nextInt(MOVES.length)];
    }
}

class ResultWriter {
    private static final String FILE_NAME = "game_results.txt";

    public static void writeResult(String result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(result);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}

// Game class
class Game {
    private ComputerPlayer computer;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
        human = new HumanPlayer(scanner);
        computer = new ComputerPlayer();
    }

    private HumanPlayer human;

	public void play() {
        System.out.println("---- Rock Paper Scissors ----");

        while (true) {
            try {
                human.chooseMove();
                computer.chooseMove();

                String userMove = human.getMove();
                String compMove = computer.getMove();

                System.out.println("You chose: " + userMove);
                System.out.println("Computer chose: " + compMove);

                String result = determineWinner(userMove, compMove);
                System.out.println(result);

                saveResult(userMove, compMove, result);

                System.out.print("Play again? (yes/no): ");
                String again = scanner.nextLine();

                if (!again.equalsIgnoreCase("yes")) {
                    System.out.println("Thanks for playing!");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error occurred. Restarting round...");
            }
        }
    }

    private String determineWinner(String user, String comp) {
        if (user.equals(comp)) {
            return "Result: It's a tie!";
        }

        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "Result: You win!";
        }

        return "Result: Computer wins!";
    }

    private void saveResult(String user, String comp, String result) {
        String log = LocalDateTime.now() + " | You: " + user + " | Computer: " + comp + " | " + result;

        ResultWriter.writeResult(log);
    }
}


public class RockPaperScissors {
    public static void main(String[] args) {
        try {
            Game game = new Game();
            game.play();
        } catch (Exception e) {
            System.out.println("Error in starting the game.");
        }
    }
}