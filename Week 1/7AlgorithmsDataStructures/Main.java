public class Main {
    public static void main(String[] args) {
        double pv = 10000;       // Initial investment
        double rate = 0.08;      // 8% annual growth
        int years = 5;           // Forecasting over 5 years

        double futureValue = FinancialForecast.forecastValue(pv, rate, years);
        System.out.printf("Future Value after %d years: ₹%.2f%n", years, futureValue);
    }
}
