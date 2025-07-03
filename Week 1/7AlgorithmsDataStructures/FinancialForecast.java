public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastValue(double presentValue, double rate, int years) {
        // Base case
        if (years == 0) {
            return presentValue;
        }
        // Recursive step
        return (1 + rate) * forecastValue(presentValue, rate, years - 1);
    }
}
