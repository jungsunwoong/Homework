package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";

        System.out.printf("""
                %s
                %s
                나는 "자바"를 배웁니다.
                번호      이름      직업
                나는
                자바를
                배웁니다.
                """,name,job);
    }
}
