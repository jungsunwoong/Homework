package ch06.sec08.exam01;

public class Calculator {
    public void powerOn() {
        System.out.println("powerOn : 계산기 전원이 켜졌습니다");
    }
    public void powerOff() {
        System.out.println("powerOff : 계산기 전원이 꺼졌습니다");
    }

    public int plus(int a, int b) {
        return a + b;
    }
    public double divide(double a, double b) {
        return (double) (a / b);
    }
}
