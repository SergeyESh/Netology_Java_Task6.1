package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) { //Сумма всех продаж
        int sum = 0;
        for (long sale : sales) sum = (int) (sum + sale);
        return sum;
    }

    public int averageSales(long[] sales) { //Средняя сумма продаж в месяц
        int average = 0;
        for (long sale : sales) average = sumSales(sales) / sales.length;
        return average;
    }

    public int maxSales(long[] sales) { //Номер месяца, в котором был пик продаж
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { //Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего
        int average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSales(long[] sales) { //Кол-во месяцев, в которых продажи были выше среднего
        int average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
