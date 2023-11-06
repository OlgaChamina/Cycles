package ru.netology.services.CyclesDZ.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HolidaysServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/Data.csv")
    public void calcIflitleMoney(int income, int expenses, int threshold) {

        HolidaysService service = new HolidaysService();
        int count = service.calculate(income, expenses, threshold);
        System.out.println(count);

    }



}
