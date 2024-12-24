package day_11;

public class Warehouse {
    public int countOrder;
    public double balance;

    public Warehouse() {
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Warehouse {" +
                "countOrder = " + countOrder +
                ", balance = " + balance +
                '}';
    }
}
