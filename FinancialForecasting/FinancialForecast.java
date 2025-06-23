public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double pv, double rate, int years) {
        if (years == 0) return pv; // Base case
        return predictFutureValue(pv, rate, years - 1) * (1 + rate);
    }
}
