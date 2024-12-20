package day_4;

import java.util.Collections;

import static day_4.Task_1.arraylist;
import static day_4.Task_1.createNumArray;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 */
public class Task_2 {
    static final int ARRAY_LENGHT = 100;
    static final int LIMIT = 10000;
    static int COUNT_ELEMENT_ENDS_0 = 0;
    static int SUM_ELEMENT_ENDS_0 = 0;

    public static void countElementsEnd0() {
        for (int num : arraylist) {
            if (num % 10 == 0) {
                COUNT_ELEMENT_ENDS_0++;
                SUM_ELEMENT_ENDS_0 += num;
            }
        }
    }

    public static void main(String[] args) {
        createNumArray(ARRAY_LENGHT, LIMIT);
        countElementsEnd0();
        System.out.println(Collections.max(arraylist));
        System.out.println(Collections.min(arraylist));
        System.out.println(COUNT_ELEMENT_ENDS_0);
        System.out.println(SUM_ELEMENT_ENDS_0);
    }
}
