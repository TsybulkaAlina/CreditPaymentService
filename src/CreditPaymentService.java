public class CreditPaymentService {
    public double calculate(double loanAmount, double interestRate, int loanTerm) {
        double monthlyInterestRate = interestRate / 100 / 12; // Месячняа процентная ставка
        int numberOfPayments = loanTerm * 12; // Общее количество платежей

        double monthlyPayment = loanAmount * monthlyInterestRate
                * Math.pow(1 + monthlyInterestRate, numberOfPayments)
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);  // Формула для расчета аннуитетного платежа

        return (int) (monthlyPayment); // Округляем значение платежа до целого числа
    }
}
