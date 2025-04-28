package ch02.sec13;

public class TrueOrFalse {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println((x>7) && (y<=5));
        // x는 7보다 크고 y는 5와 같다 -> true

        System.out.println((x%3 ==2 ) || (y%2 !=1));
        // x를 3으로 나누었을 때 나머지는 1이고 ,
        // y는 2로 나눴을 때 나머지가 1이 아니다? 1이다. 모두 거짓 -> false
    }
}
