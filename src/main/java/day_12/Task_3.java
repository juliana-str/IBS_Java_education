package day_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 * (название музыкальной группы и год основания). Создать 10 или более экземпляров
 * класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 * которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 * список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand>
 * bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 * состоящий из групп, основанных после 2000 года. Вызвать метод
 * groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 * из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 * после 2000 года).
 */
public class Task_3 {

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }

    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Руки Вверх", 1993));
        bands.add(new MusicBand("Рефлекс", 1999));
        bands.add(new MusicBand("Крем Soda", 2012));
        bands.add(new MusicBand("Пикник", 1978));
        bands.add(new MusicBand("HammAli & Navai", 2016));
        bands.add(new MusicBand("Градусы", 2008));
        bands.add(new MusicBand("Город 312", 2003));
        bands.add(new MusicBand("Обе Две", 2006));
        bands.add(new MusicBand("АлоэВера", 2010));
        bands.add(new MusicBand("Звери", 2001));
        Collections.shuffle(bands);
        bands.forEach(value -> System.out.print(value.getName() + ", "));
        System.out.println();
        groupsAfter2000(bands).forEach(value -> System.out.print(value.getName() + ", "));
    }
}
