package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello, my name is Bob.\nI was created in 2021. ");
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String name = user_input.next();
        System.out.printf("What a great name you have %s", name);
        System.out.println("Let me guess your age\nEnter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = user_input.nextInt();
        int remainder5 = user_input.nextInt();
        int remainder7 = user_input.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d  that's a good time to start programming! ", age);
    }
}
