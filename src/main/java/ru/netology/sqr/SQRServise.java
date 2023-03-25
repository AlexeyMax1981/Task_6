package ru.netology.sqr;
public class SQRServise {
    public int calcSQR(int firstBorder, int secondBorder) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if ((firstBorder < square) & (square < secondBorder)) {
                count ++;
            }
        }
    return count;
    }
}
