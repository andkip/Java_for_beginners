import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String equation;
        int result;
        System.out.println("Введите уравнение, пример \"x-5=7\":");
        equation = scan.nextLine();
        if (!equation.matches("([x][+-][0-9]=[0-9])|([0-9][+-][x]=[0-9])|([0-9][+-][0-9]=[x])")) {
            System.out.println("Уравнение введено некорректно");
        } else {
            if (equation.charAt(4) == 'x') {
                result = equation.charAt(1) == '+' ? Character.getNumericValue(equation.charAt(0)) + Character.getNumericValue(equation.charAt(2)) :
                        Character.getNumericValue(equation.charAt(0)) - Character.getNumericValue(equation.charAt(2));
            } else if (equation.charAt(0) == 'x') {
                result = equation.charAt(1) == '+' ? Character.getNumericValue(equation.charAt(4)) - Character.getNumericValue(equation.charAt(2)) :
                        Character.getNumericValue(equation.charAt(4)) + Character.getNumericValue(equation.charAt(2));
            } else {
                result = equation.charAt(1) == '+' ? Character.getNumericValue(equation.charAt(4)) - Character.getNumericValue(equation.charAt(0)) :
                        Character.getNumericValue(equation.charAt(0)) - Character.getNumericValue(equation.charAt(4));
            }
            System.out.println("Значение x равно: " + result);
        }
    }
}
