import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку 'I like Java!!!':");
        String str = scan.nextLine();
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
        }
        System.out.println(str.replace("a", "o").substring(7, 11));
    }
}
