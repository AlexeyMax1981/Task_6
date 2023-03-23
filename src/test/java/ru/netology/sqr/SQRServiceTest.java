package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import ru.netology.sqr.SQRServise;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    public void avQuadro() {
        SQRServise service = new SQRServise();
        int expected = 3;
        int actual = service.calcQuadro(200, 300);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    public void outQuadro() {
        SQRServise service = new SQRServise();
        int expected = 0;
        int actual = service.calcQuadro(2, 99);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void underQuadro() {
        SQRServise service = new SQRServise();
        int expected = 0;
        int actual = service.calcQuadro(10_000, 20_000);
        assertEquals(expected, actual);
    }

}


