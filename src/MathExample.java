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
    }
}
