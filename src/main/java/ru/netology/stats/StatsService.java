package ru.netology.stats;
public class StatsService {

    public int sumOfAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSumOfSalesPerMonth(int[] sales) {
        int sumOfSales = 0;
        int average;
        for (int i = 0; i < sales.length; i++) {
            sumOfSales = sumOfSales + sales[i];
        }
        average = sumOfSales / 12;
        return average;
    }

    public int monthWithMaxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales;
    }

    public int monthWithMinSales(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }

    public int numberOfMonthsWithSalesLessThanAverage(int[] sales) {
        int averageSales = averageSumOfSalesPerMonth(sales);
        int count = 0; // счетчик месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                count++;
            }
        }
        return count;

    }

    public int numberOfMonthsWithSalesMoreThanAverage(int[] sales) {
        int averageSales = averageSumOfSalesPerMonth(sales);
        int count = 0; // счетчик месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                count++;
            }
        }
        return count;
    }
}
