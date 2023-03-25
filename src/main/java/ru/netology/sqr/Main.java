package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRServise service = new SQRServise();
//        int firstBorder = 200;
//        int secondBorder = 300;
        int numberSQR = service.calcSQR(100, 300);
        System.out.println(numberSQR);

    }
}
