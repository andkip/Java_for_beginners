import java.util.Scanner;

/**
 * Задание: Напишите программу-загадку:
 * “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
 * Ответ: “Заархивированный вирус”.
 */

public class FinalTask4 {
    public static void main(String[] args) {
        int attempts = 0;
        System.out.println("Загадка:\nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        while (attempts < 3){
            String answer = new Scanner(System.in).nextLine();
            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }  else if (attempts == 0 && answer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Объект поиска лаборатории Касперского");
                attempts = 2;
            } else if (answer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
            } else if (attempts == 2){
                System.out.println("Обидно, приходи в другой раз");
                break;
            } else {
                System.out.println("Подумай еще!");
                attempts++;
            }
        }
    }
}
