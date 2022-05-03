import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();

        System.out.println("Enter an integer: ");
        int wholeNumber = scanner.nextInt(); 

        System.out.println("Enter a double: ");
        double twice = scanner.nextDouble();

        System.out.println("Enter a boolean value: ");
        boolean  tOrF = scanner.nextBoolean();

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + wholeNumber);
        System.out.println("Your double is " + twice);
        System.out.println("Your boolean is " + tOrF);
    }
}
