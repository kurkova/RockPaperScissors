import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Introduction.introduction();
        RpsGame game = new RpsGame();
        game.startGame();
    }
}

