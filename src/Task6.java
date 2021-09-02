import java.util.Scanner;

public class Task6 {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int type, size;
            double value;
            System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
            type = scan.nextInt();
            switch (type){
                case 1:
                    System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - пуд, 4 - унция");
                    size = scan.nextInt();
                    System.out.println("Введите число");
                    value = scan.nextDouble();
                    massConvert(size, value);
                    break;
                case 2:
                    System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                    size = scan.nextInt();
                    System.out.println("Введите число");
                    value = scan.nextDouble();
                    distanceConvert(size, value);
                    break;
                default:
                    System.out.println("Выбрана некорректная величина");
            }
        }

        public static void distanceConvert(int size, double value){
           double METR_MILE_COFF = 0.000621371;
           double METR_YARD_COFF = 1.09361;
           double METR_FOOT_COFF = 3.28084;
            switch (size){
                case 1:
                    System.out.println("Метры: " + value);
                    System.out.println("Мили: " + value * METR_MILE_COFF);
                    System.out.println("Ярды: " + value * METR_YARD_COFF);
                    System.out.println("Футы: " + value * METR_FOOT_COFF);
                    break;
                case 2:
                    System.out.println("Метры: " + value / METR_MILE_COFF);
                    System.out.println("Мили: " + value);
                    System.out.println("Ярды: " + value / METR_MILE_COFF * METR_YARD_COFF);
                    System.out.println("Футы: " + value / METR_MILE_COFF * METR_FOOT_COFF);
                    break;
                case 3:
                    System.out.println("Метры: " + value / METR_YARD_COFF);
                    System.out.println("Мили: " + value / METR_YARD_COFF * METR_MILE_COFF);
                    System.out.println("Ярды: " + value);
                    System.out.println("Футы: " + value / METR_YARD_COFF * METR_FOOT_COFF);
                    break;
                case 4:
                    System.out.println("Метры: " + value / METR_FOOT_COFF);
                    System.out.println("Мили: " + value / METR_FOOT_COFF * METR_MILE_COFF);
                    System.out.println("Ярды: " + value / METR_FOOT_COFF * METR_YARD_COFF);
                    System.out.println("Футы: " + value);
                    break;
                default:
                    System.out.println("Выбрана некорректная единица измерения");
            }
        }
        public static void massConvert(int size, double value){
            double KILO_POUND_COFF = 2.20462;
            double KILO_POOD_COFF = 0.0610475;
            double KILO_OUNCE_COFF = 35.274;
            switch (size){
                case 1:
                    System.out.println("Килограммы: " + value);
                    System.out.println("Фунты: " + value * KILO_POUND_COFF);
                    System.out.println("Пуды: " + value * KILO_POOD_COFF);
                    System.out.println("Унции: " + value * KILO_OUNCE_COFF);
                    break;
                case 2:
                    System.out.println("Килограммы: " + value / KILO_POUND_COFF);
                    System.out.println("Фунты: " + value);
                    System.out.println("Пуды: " + value / KILO_POUND_COFF * KILO_POOD_COFF);
                    System.out.println("Унции: " + value / KILO_POUND_COFF * KILO_OUNCE_COFF);
                    break;
                case 3:
                    System.out.println("Килограммы: " + value / KILO_POOD_COFF);
                    System.out.println("Фунты: " + value / KILO_POOD_COFF * KILO_POUND_COFF);
                    System.out.println("Пуды: " + value);
                    System.out.println("Унции: " + value / KILO_POOD_COFF * KILO_OUNCE_COFF);
                    break;
                case 4:
                    System.out.println("Килограммы: " + value / KILO_OUNCE_COFF);
                    System.out.println("Фунты: " + value / KILO_OUNCE_COFF * KILO_POUND_COFF);
                    System.out.println("Пуды: " + value / KILO_OUNCE_COFF * KILO_POOD_COFF);
                    System.out.println("Унции: " + value);
                    break;
                default:
                    System.out.println("Выбрана некорректная единица измерения");
            }
        }
    }
