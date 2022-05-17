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
        long sumSales = sumSales(sales);
        long averageSales = sumSales / 12; // средняя сумма продаж в месяц

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

    public long amountMonthMin(long[] sales) {
        long amountMonthMin = 0; // Кол-во месяцев, в которых продажи были ниже среднего

        long sumSales = sumSales(sales); // сумма всех продаж
        long averageSales = averageSales(sales); // средняя сумма продаж в месяц

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                amountMonthMin++;
            }
        }
        return amountMonthMin;
    }

    public long amountMonthMax(long[] sales) {
        long amountMonthMax = 0; // Кол-во месяцев, в которых продажи были выше среднего

        long sumSales = sumSales(sales); // сумма всех продаж
        long averageSales = averageSales(sales); // средняя сумма продаж в месяц

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                amountMonthMax++;
            }
        }
        return amountMonthMax;
    }

}

