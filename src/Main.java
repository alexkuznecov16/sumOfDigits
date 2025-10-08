import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 3. Test the program
        System.out.println("Sum for 1000 is " + getSumOfDigits(1000)); // 1
        System.out.println("Sum for 14 is " + getSumOfDigits(14)); // 5
        System.out.println("Sum for 0 is " + getSumOfDigits(0)); // 0
        System.out.println("Sum for 12345 is " + getSumOfDigits(12345)); // 15

        // With user input
        Scanner scanner = new Scanner(System.in);

        int number = getNumber(scanner);
        int sum = getSumOfDigits(number);

        System.out.println("Sum for " + number + " is " + sum);
        scanner.close();
    }

    // returns integer
    public static int getNumber(Scanner scanner) {
        int number;

        // loop works while input value is incorrect
        while (true) {
            System.out.print("Enter number to get sum of digits: ");
            try {
                number = scanner.nextInt(); // if throws an exception - the catch block is executed
                break;
            } catch (Exception e) {
                System.out.println("Error: please enter only integers.");
                scanner.nextLine();
            }
        }

        return number;
    }

    // return sum of digits
    public static int getSumOfDigits(int number) {
        int sum = 0;
        int i = 0;
        String strNumber = String.valueOf(Math.abs(number)); // make String value for iterations

        while (i < strNumber.length()) {
            sum += Integer.parseInt(String.valueOf(strNumber.charAt(i)));
            i++;
        }

        return sum;
    }
}