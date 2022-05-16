package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumSales = 0; // сумма всех продаж
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long averageSales = 0; // средняя сумма продаж в месяц
        long x = 0;
        for (long sale : sales) {
            x += sale;
            averageSales = x / 12;
        }
        return averageSales;
    }

    public int maxi(long[] sales) {
        int maxi = 0; // Номер месяца, в котором был пик продаж
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi + 1;
    }

    public int mini(int[] sales) {
        int mini = 0; // Номер месяца, в котором был минимум продаж
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[mini]) {
                mini = i;
            }
        }
        return mini + 1;
    }

    public int amountMonthMin(int[] sales) {
        int amountMonthMin = 0; // Кол-во месяцев, в которых продажи были ниже среднего
        int averageSales = 0; // средняя сумма продаж в месяц
        int sum = 0; // сумма всех продаж

        for (int sale : sales) {
            sum += sale;
            averageSales = sum / 12;
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                amountMonthMin++;
            }
        }
        return amountMonthMin;
    }

    public int amountMonthMax(int[] sales) {
        int amountMonthMax = 0; // Кол-во месяцев, в которых продажи были выше среднего
        int averageSales = 0; // средняя сумма продаж в месяц
        int sum = 0; // сумма всех продаж

        for (int sale : sales) {
            sum += sale;
            averageSales = sum / 12;
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                amountMonthMax++;
            }
        }
        return amountMonthMax;
    }

}

