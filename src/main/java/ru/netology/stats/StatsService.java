package ru.netology.stats;
public class StatsService {

    public long sumOfAllSales(long[] sales) {
        long sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    public long averageSumOfSalesPerMonth(long[] sales) {
        long sumOfSales = 0;
        long average;
        for (long i : sales) {
            sumOfSales += i;
        }
        average = sumOfSales / 12;
        return average;
    }

    public int monthWithMaxSales(long[] sales) {
        int maxSales = 0; // номер месяца с максимальной продажей
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxSales] <= sales[i]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    public int monthWithMinSales(long[] sales) {
        int minSales = 0; // номер месяца с минимальной продажей
        for (int i = 0; i < sales.length; i++) {
            if (sales[minSales] > sales[i]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int numberOfMonthsWithSalesLessThanAverage(long[] sales) {
        long averageSales = averageSumOfSalesPerMonth(sales);
        int count = 0; // счетчик месяцев
        for (long i : sales) {
            if (i < averageSales) {
                count++;
            }
        }
        return count;

    }

    public int numberOfMonthsWithSalesMoreThanAverage(long[] sales) {
        long averageSales = averageSumOfSalesPerMonth(sales);
        int count = 0; // счетчик месяцев
        for (long i : sales) {
            if (i > averageSales) {
                count++;
            }
        }
        return count;
    }
}
