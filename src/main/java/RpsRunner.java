import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name");
        String userName = name.nextLine();
        System.out.println("Hello " + userName + ",time to play Rock&&Paper&&Scissors game!");
        RpsGame game = new RpsGame();
        game.startGame();
    }
}

