
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scan.nextLine();
        int latinWordCounter = 0;
        for (String word:str.split(" ")) {
            if (word.matches("[A-Za-z]+")) {
                System.out.println(word);
                latinWordCounter++;
            }
        }
        System.out.println("Количество слов на латинице: " + latinWordCounter);
    }
}