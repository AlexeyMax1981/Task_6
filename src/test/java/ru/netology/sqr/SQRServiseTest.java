
package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiseTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void avSQR(int expected, int firstBorder, int secondBorder) {
        SQRServise service = new SQRServise();
        int actual = service.calcSQR(firstBorder, secondBorder);
        Assertions.assertEquals(expected, actual);
    }

}
