package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {

    @Test
    public void shouldFindSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 180;
        long actual = service.sumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSumOfSalesPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 15;
        long actual = service.averageSumOfSalesPerMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 8;
        long actual = service.monthWithMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 9;
        long actual = service.monthWithMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberOfMonthsWithSalesLessThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 5;
        long actual = service.numberOfMonthsWithSalesLessThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberOfMonthsWithSalesMoreThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 5;
        long actual = service.numberOfMonthsWithSalesMoreThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
