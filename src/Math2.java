import java.util.Scanner;

public class Math2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Wprowadź liczbę minimalną: ");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wprowadź liczbę maksymalną: ");
        int max = scanner.nextInt();
        scanner.nextLine();
        do {
            if (max < min){
                System.out.println("Liczna maksymalna nie może być mniejsza od liczby minimalnej!");
                System.out.println();
                System.out.println("Wprowadź liczbę maksymalną: ");
                max = scanner.nextInt();
                scanner.nextLine();
            } else if (max == min){
                System.out.println("Liczna maksymalna nie może być równa liczbie minimalnej!");
                System.out.println();
                System.out.println("Wprowadź liczbę maksymalną: ");
                max = scanner.nextInt();
                scanner.nextLine();
            } else {
                break;
            }
        } while (max <= min);

        System.out.println("Min: "+min);
        System.out.println();
        System.out.println("Max: "+max);
        System.out.println();

        double a = Math.random() * ((max - min + 1) + min);
        double b = Math.random() * ((max - min + 1) + min);

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        double logAB = Math.log(a)*Math.log(b);
        System.out.println("Log_ab: "+logAB);
        double cosA = Math.cos(a);
        System.out.println("Cosinus a: "+cosA);
        double tanB = Math.tan(b);
        System.out.println("Tangens b: "+tanB);
    }
}