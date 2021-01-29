public class NumberRepo {
    double[] numbers;

    NumberRepo(int size){
        numbers = new double[size];
    }
    void displayAll(){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    void generateValues() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }

    }
}
