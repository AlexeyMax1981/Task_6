package ru.netology.sqr;
public class SQRServise {
    public int calcSQR(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if ((a < square) & (square < b)) {
                count ++;
            }
        }
    return count;
    }
}
