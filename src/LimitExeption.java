public class LimitExeption extends Exception {
    String message;
    double remainingAmount;

    public LimitExeption(String message, double amount) {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public void getRemainingAmount(){

}
}
