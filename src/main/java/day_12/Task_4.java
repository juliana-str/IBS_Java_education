package day_12;

import java.util.ArrayList;
import java.util.List;

import static day_12.MusicBand.transferMembers;

/**
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
 * группу можно было добавлять и удалять участников. Под участником понимается
 * строка (String) с именем и фамилией. Реализовать статический метод слияния групп
 * (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
 * метода: transferMembers. Этот метод принимает в качестве аргументов два
 * экземпляра класса MusicBand. Реализовать метод printMembers (в классе
 * MusicBand), выводящий список участников в консоль. Проверить состав групп после
 * слияния.
 */
public class Task_4 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        MusicBand band1 = new MusicBand("Руки Вверх", 1993);
        bands.add(band1);
        MusicBand band2 = new MusicBand("Рефлекс", 1999);
        bands.add(band2);
        MusicBand band3 = new MusicBand("Крем Soda", 2012);
        bands.add(band3);
        ArrayList<String> members1 = new ArrayList<>();
        members1.add("Жуков");
        members1.add("Потехин");
        band1.setMembers(members1);
        ArrayList<String> members2 = new ArrayList<>();
        members2.add("Ирина Нельсон");
        members2.add("Алёна Торганова");
        members2.add("Григорий Розов");
        band2.setMembers(members2);
        ArrayList<String> members3 = new ArrayList<>();
        members3.add("Илья Гадаев");
        members3.add("Дмитрий Свиргунов");
        band3.setMembers(members3);
        band2.removeMembers("Григорий Розов");
        band2.printMembers();
        transferMembers(band2, band3);
        band3.printMembers();
    }
}
