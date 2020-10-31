public class BankAccount {
    protected double money;

    public boolean withdrawMoney(double count) {
        if (money >= count) {
            money -= count;
            return true;
        } else {
            System.out.println("Недостаточно средств для выполнения данной операции!");
            return false;
        }
    }

    public void depositMoney(double count) {
        this.money += count;
    }

    public double getMoney() {
        return money;
    }

    boolean send(BankAccount account, double amount) {
        if (withdrawMoney(amount)) {
            account.money += amount;
            this.money -= amount;
            return true;
        }
        return false;
    }
}
