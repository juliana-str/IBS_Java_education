package day_13;

import static day_13.MessageDatabase.showDialog;

/**
 * Нам необходимо создать свою небольшую социальную сеть на Java.
 * Для этого мы должны реализовать следующие классы:
 * User - сущность “Пользователь”
 * Message - сущность “Сообщение”
 * MessageDatabase - класс, который будет заниматься хранением сообщений
 * Test - класс, где в методе main() мы будем тестировать нашу соц. сеть
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User("Петров Антон");
        User user2 = new User("Романов Андрей");
        User user3 = new User("Куликов Илья");
        user1.sendMessage(user2, "Привет, Как дела?");
        user1.sendMessage(user2, "Как провел выходные?");
        user2.sendMessage(user1, "Привет, Все хорошо");
        user2.sendMessage(user1, "Выходные прошли активно!");

        user3.sendMessage(user2, "Привет, что нового?");
        user2.sendMessage(user3, "Привет, изучаю Java, как сам?");
        user3.sendMessage(user2, "Все ок, удачи в обучении!");
        user2.sendMessage(user3, "Спасибо!");

        user1.sendMessage(user3, "Привет, Как прошел концерт?");
        user3.sendMessage(user1, "Привет, Все хорошо, съиграли отлично");
        user1.sendMessage(user3, "Класс, теперь можно отдохнуть, расслабиться.");
        user3.sendMessage(user1, "Это точно!");

        showDialog(user1, user3);
    }
}
