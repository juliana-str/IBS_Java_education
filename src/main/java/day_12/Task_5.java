package day_12;

import static day_12.Music_Band.transferMembers;

/**
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника
 * музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
 * участником понимается не строка, а объект класса MusicArtist. Необходимо
 * реализовать класс MusicArtist и доработать класс MusicBand (создать копию
 * класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
 * этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
 * проверить состав групп после слияния. Методы для слияния и для вывода участников
 * в консоль необходимо тоже переработать, чтобы они работали с объектами класса
 * MusicArtist.
 */
public class Task_5 {
    public static void main(String[] args) {
        Music_Band band1 = new Music_Band("Руки Вверх", 1993);
        Music_Band band2 = new Music_Band("Рефлекс", 1999);
        Music_Band band3 = new Music_Band("Крем Soda", 2012);

        band1.setMembers(new MusicArtist("Сергей Жуков", 40));
        band1.setMembers(new MusicArtist("Алексей Потехин", 41));

        band2.setMembers(new MusicArtist("Ирина Нельсон", 35));
        MusicArtist artist1 = new MusicArtist("Алёна Торганова", 40);
        band2.setMembers(artist1);
        MusicArtist artist2 = new MusicArtist("Григорий Розов", 42);
        band2.setMembers(artist2);

        band3.setMembers(new MusicArtist("Илья Гадаев", 42));
        band3.setMembers(new MusicArtist("Дмитрий Свиргунов", 42));

        band2.removeMembers(artist2);
        band2.printMembers();
        transferMembers(band2, band3);
        band3.printMembers();
    }
}
