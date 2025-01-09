package day_12;

import java.util.ArrayList;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 * из списка. Распечатать список.
 */
public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.add("Ferrary");
        newArray.add("Mercedes");
        newArray.add("BMV");
        newArray.add("Toyota");
        newArray.add("Subaru");
        System.out.println(newArray);
        newArray.add(3, "Kia");
        newArray.remove(0);
        System.out.println(newArray);
    }
}
