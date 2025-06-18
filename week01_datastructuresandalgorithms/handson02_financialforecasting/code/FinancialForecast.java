package week01_datastructuresandalgorithms.handson02_financialforecasting.code;

public class FinancialForecast {

    public static double calculateFutureValue(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return calculateFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000; // Starting value
        double annualGrowthRate = 0.08;   // 8% annual growth
        int forecastYears = 5;            // Forecast for 5 years

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Future value after %d years: ₹%.2f%n", forecastYears, futureValue);
    }
}
