public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment1 = service.calculate(1_000_000, 9.99F, 1);
        System.out.println((int) payment1);

        double payment2 = service.calculate(1_000_000, 9.99F, 2);
        System.out.println((int) payment2);

        double payment3 = service.calculate(1_000_000, 9.99F, 3);
        System.out.println((int) payment3);

    }
}