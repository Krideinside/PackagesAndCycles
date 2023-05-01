package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {

    @ParameterizedTest
   @CsvSource({
         "10000, 3000",
        //    "10000, 3000",
      //      "10000, 3000"
   })
    public void calculateWithParameters1(int income, int expenses) {
        RestService service = new RestService();
        // подготавливаем данные:
       //int threshold = 20_000;
      // int income = 10_000;
      // int expenses = 3_000;
       int count = service.calculate(income, expenses);
        System.out.println(income);
        System.out.println(expenses);
       System.out.println(count);
    }
}