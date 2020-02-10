public class Main {

    public static void main(String[] args) {
        BankAccount optima = new BankAccount();
        optima.deposit(10000);
        while (true) {
            try {
                optima.withDraw(3000);
            } catch (LimitExeption e) {
                System.out.println("Остаток счета  -"+optima.getAmount());
                try {
                    optima.withDraw(optima.getAmount());
                } catch (LimitExeption limitExeption) {
                    limitExeption.printStackTrace();
                }
            break;
            }
        }
    }
}
