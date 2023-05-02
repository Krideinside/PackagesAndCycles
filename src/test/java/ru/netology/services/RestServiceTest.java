package ru.netology.services;

import org.junit.jupiter.api.Test;


public class RestServiceTest {

    int threshold = 150_000;
    int income = 100_000;
    int expenses = 60_000;

    @Test
    void cauntRest() {
        RestService service = new RestService(income, expenses, threshold);
        int count = service.countRest(income, expenses, threshold);
        System.out.println("Кол-во месяцев для отдыха: " + count);
    }
}
