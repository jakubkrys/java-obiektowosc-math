import java.util.Scanner;

public class MathExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        double[] numbers = new double[size];

        /* wyświetlenie
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/

        // losowanie i wyświetlenie
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
            System.out.println(numbers[i]);
        }
    }
}
