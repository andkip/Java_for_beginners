import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }
        Arrays.sort(array);
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Минимальное число: " + array[0]);
        System.out.println("Максимальное число: " + array[array.length - 1]);
        System.out.println("Наибольшее значение по модулю: " + Math.max(Math.abs(array[0]), Math.abs(array[array.length - 1])));
    }
}



