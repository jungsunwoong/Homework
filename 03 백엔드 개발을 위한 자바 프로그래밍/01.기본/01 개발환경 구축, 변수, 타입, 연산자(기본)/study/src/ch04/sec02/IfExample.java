package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
//        int score = 85;
            int score = 75;
        if (score >= 90 && score <= 100) {
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A입니다.");
        }
//        if(score < 90)
//            System.out.println("점수가 90보다 작습니다");
//        System.out.println("등급은 B입니다."); // {} 없기 때문에 if문과는 상관없는 실행문
//
        else if (score < 90 && score >= 80) {
            System.out.println("점수가 90보다 작습니다");
            System.out.println("등급은 B입니다");

        }
        else if (score < 80 && score >= 70) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다");
        }

    }
}

