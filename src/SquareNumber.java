import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum;

        System.out.println("Input:");
        firstNum = input.nextInt();

        int product = firstNum * firstNum;
        System.out.println("Output: " + product);
    }
}
