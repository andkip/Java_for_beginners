import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1, y = 2, z = 3;
        System.out.println("Введите размер массива:");
        int lengthArray = scan.nextInt();
        int[] array = new int[lengthArray];
        System.out.println("Введите значения массива");
        for (int i = 0; i < lengthArray; i++) {
            array[i] = scan.nextInt();
        }
            for (int value : array) {
                if (value == x || value == y || value == z) {
                    System.out.println("Данное значение имеется в константах");
                    break;
            }
        }
    }
}