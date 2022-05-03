import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");

        String feeling = scanner.nextLine();

        System.out.println("Wow - Interesting! Tell me more!");

        String moreInfo = scanner.nextLine();

        System.out.println("That's fascinating! Talk to you later!");
    }
}
