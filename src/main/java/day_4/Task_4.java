package day_4;


import static day_4.Task_1.arraylist;
import static day_4.Task_1.createNumArray;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 * максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 */
public class Task_4 {
    static final int ARRAY_LENGHT = 100;
    static final int LIMIT = 10000;
    static int SUM_3_ELEMENTS = 0;
    static int INDEX = 0;

    public static void maxSum3Elements() {
        for (int i = 1; i < ARRAY_LENGHT - 1; i++) {
            int sum = arraylist.get(i - 1) + arraylist.get(i) + arraylist.get(i + 1);
            if (SUM_3_ELEMENTS < sum) {
                SUM_3_ELEMENTS = sum;
                INDEX = i - 1;
            }
        }
    }

    public static void main(String[] args) {
        createNumArray(ARRAY_LENGHT, LIMIT);
        maxSum3Elements();
        System.out.println(arraylist);
        System.out.println(SUM_3_ELEMENTS);
        System.out.println(INDEX);
    }
}
