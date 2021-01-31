import java.util.Scanner;

public class MathExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        NumberRepo numberRepo = new NumberRepo(size);

        // losowanie i wyświetlenie

        numberRepo.generateValues();
        numberRepo.displayAll();
        double min = numberRepo.findMin();
        System.out.println("Min: "+min);
        double max = numberRepo.findMax();
        System.out.println("Max: "+max);

        double[] logNumbers = numberRepo.logNumbers();
        System.out.println("Log numbers: ");
        for (double number : logNumbers) {
            System.out.println(number);
        }
    }
}
