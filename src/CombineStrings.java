import java.util.Scanner;

public class CombineStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstInput;
        String secondInput;

        System.out.println("Input: ");
        firstInput = input.nextLine();

        System.out.println("Input: ");
        secondInput = input.nextLine();

        System.out.println(firstInput + " " + secondInput);
    }
}
