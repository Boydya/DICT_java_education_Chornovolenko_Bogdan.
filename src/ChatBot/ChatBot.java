package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello, my name is Bob.\nI was created in 2021. ");
        Scanner user_output = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String name = user_output.next();
        System.out.printf("What a great name you have %s", name);
    }
}
