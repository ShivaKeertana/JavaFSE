
public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;     // ₹10,000 initial investment
        double growthRate = 0.08;        // 8% annual growth
        int years = 5;                   // Forecast for 5 years

        double futureValue = FinancialForecast.predictFutureValue(presentValue, growthRate, years);
        System.out.printf("📈 Future Value after %d years: ₹%.2f%n", years, futureValue);
    }
}
