import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first parameter: ");
        int param1 = scanner.nextInt();
        System.out.println("Enter the second parameter: ");
        int param2 = scanner.nextInt();
        scanner.close();

        try {
            count(param1, param2);
        } catch (Exception e) {
            System.out.println("Second parameter must be greater than the first parameter.");
        }
    }

    static void count(int param1, int param2) throws InvalidParamsException {
        if (param1 > param2) {
            throw new InvalidParamsException();
        } else {
            for (int i = 1; i <= (param2 - param1); i++) {
                System.out.println("Printing the number: " + i);
            }
        }
    }
}
