package study02;

public class Computer extends Calculator {
    @Override
    double areaCircle(double r) {
        return Math.PI * r * r;
    }
}
