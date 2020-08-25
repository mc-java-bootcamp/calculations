import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum;
        int secondNum;

        System.out.println("Enter a number:");
        firstNum = input.nextInt();

        System.out.println("Enter another number:");
        secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        int product = firstNum * secondNum;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

    }
}
