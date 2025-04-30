package ch01.sec03;

public class FunctionSolutionExample {
    public static void main(String[] args) {
        //중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작
        //성하세요. 단, x와 y는 10이하의 자연수 입니다.
        for(int x = 3 ; x <11 ; x++) {
            int y = (60 - 4*x) / 5 ;
            if ((60-4*x) % 20 == 0){
                System.out.printf("(%d , %d)\n",x,y);
            }

        }
    }
}
