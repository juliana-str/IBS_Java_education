package day_3;

import java.util.Scanner;

public class Task_1 {

    /**
     * Реализовать программу, которая в консоль выводит название страны, принимая на
     * вход название города. Программа должна работать до тех пор, пока не будет введено
     * слово “Stop”.
     * Реализовать, используя следующие данные:
     * Москва, Владивосток, Ростов - Россия
     * Рим, Милан, Турин - Италия
     * Ливерпуль, Манчестер, Лондон - Англия
     * Берлин, Мюнхен, Кёльн - Германия
     * При вводе любого другого города, вывести сообщение “Неизвестная страна”.
     */
    public static void getCountry() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String town = scanner.nextLine();
            if (town.equals("Stop")) {
                break;
            }
            switch (town) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }

    public static void main(String[] args) {
        getCountry();
    }
}
