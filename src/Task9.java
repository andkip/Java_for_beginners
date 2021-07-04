import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int lengthArray = scan.nextInt();
        double[] myArray = new double[lengthArray];
        System.out.println("Введите значения массива");
        for (int i = 0; i < lengthArray; i++) {
            myArray[i] = scan.nextDouble();
        }
        double average = 0;
        for (double value : myArray) {
            average += value;
        }
        average /= lengthArray;
        for (double value : myArray) {
            System.out.print(value * average + " ");
        }
    }
}