package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {

    @Test
    public void shouldFindSumOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 180;
        int actual = service.sumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSumOfSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 15;
        int actual = service.averageSumOfSalesPerMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 5;
        int actual = service.monthWithMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 8;
        int actual = service.monthWithMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberOfMonthsWithSalesLessThanAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 5;
        int actual = service.numberOfMonthsWithSalesLessThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNumberOfMonthsWithSalesMoreThanAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 5;
        int actual = service.numberOfMonthsWithSalesMoreThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
