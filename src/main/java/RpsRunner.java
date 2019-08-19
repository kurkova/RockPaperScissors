import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name");
        String userName = myObj.nextLine();
        System.out.println("Hello " + userName + ",time to play Rock&&Paper&&Scissors game!");
        System.out.println("How many rounds do you want to play?");
        int numberOfRounds = myObj.nextInt();
        RpsGame  game = new RpsGame();

            game.startGame();
        }

    }

