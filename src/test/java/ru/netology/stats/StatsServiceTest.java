package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StatsServiceTest {
    long sales[] = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    @Test
    public void  testSum () {
        StatsService service = new StatsService();
        long expected = 180;
        int actuale = service.sumSales(sales);
        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long expected = 15;
        int actuale = service.averageSales(sales);
        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void testMaxMounth() {
        StatsService service = new StatsService();
        long expected = 8;
        int actuale = service.maxSales(sales);
        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void testMinMounth() {
        StatsService service = new StatsService();
        long expected = 9;
        int actuale = service.minSales(sales);
        Assertions.assertEquals(expected, actuale);

    }

    @Test
    public void testBelowAverageMounth() {
        StatsService service = new StatsService();
        long expected = 5;
        int actuale = service.belowAverageSales(sales);
        Assertions.assertEquals(expected, actuale);

    }

    @Test
    public void testAboveAverageMounth() {
        StatsService service = new StatsService();
        long expected = 5;
        int actuale = service.aboveAverageSales(sales);
        Assertions.assertEquals(expected, actuale);

    }
}
