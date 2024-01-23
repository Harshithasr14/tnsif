package Airlines;

import java.util.Scanner;

class NumberGame3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        NumberProcessor numberProcessor = new NumberProcessor();
        int smallestNumber = numberProcessor.findSmallest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallestNumber);
    }
}

class NumberProcessor {
    public int findSmallest(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
            return num1; // or num2 or num3, as they are all equal
        } else {
            int smallest = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
            return smallest;
        }
    }
}
