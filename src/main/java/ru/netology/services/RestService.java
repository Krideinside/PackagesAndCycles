package ru.netology.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        threshold = 20_000;
        int count = 0;
        int money = 0;
        income = 10_000;
        expenses = 3_000;
        for (int month = 1; month <= 12; month++) {

            if (money >= threshold) { // можем отдыхать
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
            // System.out.println("Месяц " + month);
            //System.out.println("Доход: " + income);
            // System.out.println("Расход: " + expenses);
            // System.out.println("Баланс: " + money);
            //System.out.println("Кол-во месяцев для отдыха: " + count);
        }
        return count;
    }
}

