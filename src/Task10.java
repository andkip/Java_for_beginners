import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размерность матрицы m на n");
        System.out.println("Введите количество строк матрицы");
        int m = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int n = in.nextInt();
        double[][] myArray = new double[m][n];

        for (int i = 0; i < m; i++) {
            System.out.println("Введите значения " + (i + 1) + "-ой строки");
            for (int j = 0; j < n; j++) {
                myArray[i][j] = in.nextDouble();
            }
        }
        System.out.println("Первая строка матрицы, где каждый элемент умножен на 3: ");
        for (int j = 0; j < n; j++) {
            System.out.print((myArray[0][j] * 3) + " ");
        }
    }
}