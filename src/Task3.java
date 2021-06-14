public class Task3 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int lastNum = array[0];
        array[0] =  array[array.length-1];
        array[array.length-1] = lastNum;
        System.out.println("Результат суммы первого и среднего элемента: " + (array[0] + array[(array.length-1)/2]));
    }
}
