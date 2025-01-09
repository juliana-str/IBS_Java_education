package day_12;

import java.util.ArrayList;

/**
 * Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
 * Вывести список.
 */
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i = 0; i<= 30; i+=2) {
            newArray.add(i);
        }
        for(int i = 300; i<= 350; i+=2) {
            newArray.add(i);
        }
        System.out.println(newArray);
    }
}
