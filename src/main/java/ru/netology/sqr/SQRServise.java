package ru.netology.sqr;
public class SQRServise {
    public int calcQuadro(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int squer = i * i;
            if ((a < squer) && (squer < b)) {
                count ++;
            }
        }
    return count;
    }
}
