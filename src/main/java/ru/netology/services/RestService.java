package ru.netology.services;

public class RestService {
    public int calculate(int income, int expenses) {
        // int threshold = 20_000;
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int threshold = 20_000; // достаточное для отдыха кол-во денег
        for (int month = 0; month < 12; month++) {
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
