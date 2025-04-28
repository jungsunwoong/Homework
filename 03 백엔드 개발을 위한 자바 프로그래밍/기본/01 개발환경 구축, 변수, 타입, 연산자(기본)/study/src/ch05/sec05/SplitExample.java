package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
//        String board = "번호 : 1,제목 : 자바 학습,내용 : 참조타입 String 을 학습합니다.,성명 : 홍길동";
//        System.out.println(board.split(",").length);
//        for (int i = 0; i < board.split(",").length; i++) {
//            System.out.println(board.split(",")[i]);
//        }
        // 개선된 버전
        String board = "번호 : 1,제목 : 자바 학습,내용 : 참조타입 String 을 학습합니다.,성명 : 홍길동";
        String[] splitBoards = board.split(",");
        System.out.println(splitBoards[0]);
        System.out.println(splitBoards[1]);
        System.out.println(splitBoards[2]);
        System.out.println(splitBoards[3]);
        System.out.println();
        for ( int i = 0; i < splitBoards.length; i++ ) {
            System.out.println(splitBoards[i]); // 전체 출력
        }
        System.out.println();
        // foreach 문을 이용한 전체 호출
        for ( String sb : splitBoards ) {
            System.out.println(sb);
        }
    }

}
