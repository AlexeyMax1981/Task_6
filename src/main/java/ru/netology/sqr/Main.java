package ru.netology.sqr;
public class Main {
    public static void main(String[] args) {
        SQRServise service = new SQRServise();
//        int a = 200;
//        int b = 300;
        int s = service.calcSQR(100,300);
        System.out.println(s);

    }
}
