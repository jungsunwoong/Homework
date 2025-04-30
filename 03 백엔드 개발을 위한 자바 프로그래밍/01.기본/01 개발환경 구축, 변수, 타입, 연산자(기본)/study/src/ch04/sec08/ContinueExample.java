package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        /**
         * 1~10 까지의 숫자 출력
         * for , if 문과 continue 문을 사용
         * 짝수만 출력
         */
         for (int i = 1; i < 11; i++) {
             if (i % 2 == 0) {
                 System.out.printf("%d ", i);
                 continue;
             }
             else if (i % 2 != 0) {
                 continue;
             }
         }

    }
}
