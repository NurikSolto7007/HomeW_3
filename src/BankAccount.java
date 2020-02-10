public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public   void deposit (double sum){
        amount= amount + sum;
        System.out.println("Сумма депозита состовляет - "+ amount);
    }
    public  void withDraw ( double sum) throws LimitExeption {
        amount = amount - sum;
        System.out.println("сумма для снятия состовляет - "+ sum);
        if (sum>amount ){
            throw new LimitExeption("Запрашиваемая сумма > Больше чем на балансе - ", amount);

        }
        amount = amount - sum;
        System.out.println(" сумма для снятия состовляет - " + sum);
        }

    public double amount() {
        return amount;
    }
}

