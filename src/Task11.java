import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите первое число:");
    String firstNum = scan.next();
    System.out.println("Введите второе число:");
    int secondNum = scan.nextInt();
    int a = Integer.parseInt(firstNum);
    System.out.println("Большее число: " + Math.max(a,secondNum));
    double minNum = Math.min(a,secondNum);
    System.out.println("Меньшее число: " + minNum);
    }
}