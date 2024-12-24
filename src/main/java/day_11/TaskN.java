package day_11;

/**
 * Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему,
 * вызовите у каждого методы doWork() и bonus(), столько раз, чтобы каждый из
 * сотрудников получил бонус. Выведите в консоль баланс и количество выполненных
 * заказов на складе и ЗП каждого из сотрудников.
 * Создать второй склад, также принять по 1 сотруднику с однократным вызовом
 * doWork() у каждого. Проконтролировать,
 */
public class TaskN {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);
        while (warehouse.getCountOrder() < 1500) {
            picker.doWork();
        }
        picker.bonus();
        while (warehouse.getBalance() < 1000000) {
            courier.doWork();
        }
        courier.bonus();
        System.out.println(warehouse);
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        courier1.doWork();
        picker1.doWork();
        System.out.println(warehouse1);
        System.out.println(warehouse);

    }
}
