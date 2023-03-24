//package ru.netology.sqr;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
////import org.junit.jupiter.api.Test;
////import ru.netology.sqr.SQRServise;
//
//public class SQRServiseTest {
//    @Test
//    public void avSQR() {
//        SQRServise service = new SQRServise();
//        int expected = 3;
//        int actual = service.calcSQR(200, 300);
//        Assertions.assertEquals(expected,actual);
//    }
//
//
//    @Test
//    public void outSQR() {
//        SQRServise service = new SQRServise();
//        int expected = 0;
//        int actual = service.calcSQR(2, 99);
//        Assertions.assertEquals(expected,actual);
//
//    }
//
//    @Test
//    public void underSQR() {
//        SQRServise service = new SQRServise();
//        int expected = 0;
//        int actual = service.calcSQR(10_000, 20_000);
//        Assertions.assertEquals(expected,actual);
//    }
//
//}

package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiseTest {
    @ParameterizedTest
//    @CsvSource({"3,200,300",
//    "0,2,99",
//    "0,10000,20000"})
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void avSQR(int expected, int a,int b) {
        SQRServise service = new SQRServise();
//        int expected = 3;
        int actual = service.calcSQR(a,b);
        Assertions.assertEquals(expected,actual);
    }

}
