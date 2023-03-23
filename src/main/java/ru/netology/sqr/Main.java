package ru.netology.sqr;
public class Main {
    public static void main(String[] args) {
        SQRServise servise = new SQRServise();
        int a = 200;
        int b = 300;
        int s = servise.calcQuadro(a,b);
        System.out.println(s);

    }
}
