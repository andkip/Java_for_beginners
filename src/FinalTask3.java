import java.util.Scanner;

/**
 * Задание: Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
 * Среди данных строк найти строку с максимальным количеством различных символов.
 * Если таких строк будет много, то вывести первую.
 */

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linesNum;
        int maxSize = 0;
        int index = 0;
        System.out.println("Введите количество строк: ");
        linesNum = scan.nextInt();
        String[] stringsArray = new String[linesNum];
        int[] numberCharInString = new int[linesNum];
        for (int i = 0; i < stringsArray.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            stringsArray[i] = scan.next();
            numberCharInString[i] = (int) stringsArray[i].chars().distinct().count();
            if (numberCharInString[i] > maxSize) {
                maxSize = numberCharInString[i];
                index = i;
            }
        }
        System.out.println("Ответ:" + stringsArray[index]);
    }
}

