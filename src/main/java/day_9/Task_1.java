package day_9;

/**
 * Создайте в методе main() класса Task1 объект класса Студент и объект класса
 * Преподаватель. Выведите в консоль название учебной группы у объекта-студента и
 * название предмета у объекта-преподавателя. Затем, вызовите printInfo() на
 * объектах и посмотрите на результат.
 */
public class Task_1 {
    public static void main(String[] args) {
        Student student = new Student("Иванов Андрей", "2123");
        Teacher teacher = new Teacher("Балашов Сергей Петрович", "Информатика");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
