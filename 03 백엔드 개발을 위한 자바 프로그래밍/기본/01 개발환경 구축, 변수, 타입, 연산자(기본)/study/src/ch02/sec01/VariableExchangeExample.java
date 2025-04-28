package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.printf("x:%d , y:%d ",x,y);
        System.out.println();
        int change = x;
        x = y;
        System.out.printf("x:%d , y:%d ",x,change);
    }
}
