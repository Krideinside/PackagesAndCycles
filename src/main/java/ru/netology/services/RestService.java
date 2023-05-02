package ru.netology.services;

public class RestService {
    public RestService(int income, int expenses, int threshold) {
    }

    public int countRest(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++) {

            if (money >= threshold) { // можем отдыхать
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

