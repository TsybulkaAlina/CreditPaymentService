public class Main {

    public static void main(String[] args) {
        CreditPaymentService calculator = new CreditPaymentService();

        double loanAmount = 1_000_000; // Сумма кредита
        double interestRate = 9.99; // Годовая процентная ставка

        int[] loanTerms = {1, 2, 3}; // Сроки кредита в годах

        for (int term : loanTerms) {
            double monthlyPayment = calculator.calculate(loanAmount, interestRate, term);
            System.out.println("Ежемесячный платеж при сроке на " + term + " год(а): " + monthlyPayment + "  рублей");
             // Ежемесячный платеж при сроке на 1 год(а): 87911.0  рублей
             // Ежемесячный платеж при сроке на 2 год(а): 46140.0  рублей
             // Ежемесячный платеж при сроке на 3 год(а): 32262.0  рублей
        }
    }
}