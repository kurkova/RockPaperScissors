import java.util.Scanner;

public class RpsGame {
    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;

    public RpsGame() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public void startGame() {
        System.out.println("ROCK, PAPER, SCISSORS!");

        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\nYou played " + userMove + ".");
        System.out.println("Computer played " + computerMove + ".\n");

        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                System.out.println("Tie");
                break;
            case 1:
                System.out.println(userMove + " " + "beats" + " " + computerMove + " " + "You won");
                userScore++;
                break;
            case -1:
                System.out.println(computerMove + " " + "beats" + " " + userMove + " " + "You lost");
                computerScore++;
                break;
        }
        numberOfGames++;

        if(user.playAgain()){
            System.out.println();
            startGame();
//        } else {
//            printGameStats();
        }
    }

//    private void printGameStats(){
//        int wins = userScore;
//        int losses = computerScore;
//        int ties = numberOfGames - userScore - computerScore;
//        double percentageWon = (wins+((double)ties)/2)/numberOfGames;
//    }

}
