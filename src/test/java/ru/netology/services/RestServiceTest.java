package ru.netology.services;

import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
   void calcCount(int income, int expenses, int threshold) {
       income = 10_000;
       expenses = 3_000;
       threshold = 20_000;
    RestService service = new RestService();
        // подготавливаем данные:
       int count = service.calculate(income, expenses, threshold);
     // System.out.println("Месяц " + month);
      //System.out.println("Доход: " + income);
    // System.out.println("Расход: " + expenses);
     // System.out.println("Баланс: " + money);
      System.out.println("Кол-во месяцев для отдыха: " + count);
    }
}
