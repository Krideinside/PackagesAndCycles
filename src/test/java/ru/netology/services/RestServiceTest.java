package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RestServiceTest {

    // int threshold = 150_000;
    // int income = 100_000;
    //  int expenses = 60_000;

    //  @Test
    //  void cauntRest() {
    //     RestService service = new RestService(income, expenses, threshold);
    //      int count = service.countRest(income, expenses, threshold);
    //     System.out.println("Кол-во месяцев для отдыха: " + count);

    @ParameterizedTest
    // @CsvSource({
    //         "10000, 3000, 20000",
    //         "100000, 60000, 150000"
//})
    @CsvFileSource(files = "src/test/resources/data.csv")
    void cauntRest(int income, int expenses, int threshold) {
        RestService service = new RestService(income, expenses, threshold);
        int count = service.countRest(income, expenses, threshold);
        System.out.println("Кол-во месяцев для отдыха: " + count);
    }
}
