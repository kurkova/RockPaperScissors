import java.util.Scanner;

public class Introduction {
    public static void introduction(){
        System.out.println("Welcome to game: Rock&Paper&Scissor!");
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name");
        String userName = name.nextLine();
        System.out.println("Hello " + userName + ",time to play Rock&&Paper&&Scissors game!");
    }
}
