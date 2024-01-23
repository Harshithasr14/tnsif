package Airlines;
import java.util.Scanner;


class NumberSwapper2 {
    private int first;
    private int second;

    public void getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        second = scanner.nextInt();
    }

    public void swapNumbers() {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
    }

    public void displaySwappedNumbers() {
        System.out.println("Swapped numbers: ");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}

 class Main {
    public static void main(String[] args) {
        NumberSwapper2 numberSwapper = new NumberSwapper2();

        // Get numbers from the user
        numberSwapper.getNumbersFromUser();

        // Swap numbers using bitwise operator
        numberSwapper.swapNumbers();

        // Display swapped numbers
        numberSwapper.displaySwappedNumbers();
    }
}

