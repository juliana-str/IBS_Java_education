package day_11;

public class Picker implements Worker {
    private static int salary;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.countOrder == 1500) {
            salary *= 3;
        }
    }
}
