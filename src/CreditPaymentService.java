public class CreditPaymentService {
    public double calculate(int amount, float rate, int period) {

        float percent = rate / 12;
        double degree = Math.pow((1 + percent / 100), (period * 12));

        return ((percent / 100 * (amount * degree))) / (degree - 1);
    }
}