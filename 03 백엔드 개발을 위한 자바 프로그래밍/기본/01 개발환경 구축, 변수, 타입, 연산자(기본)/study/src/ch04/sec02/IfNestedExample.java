package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = 90;
        System.out.println("점수 : " + score);
        String grade;
        if (score >=95 && score <=100) {
            grade = "A+";

        }
        else if (score >=90 && score <=94) {
            grade = "A";

        }
        else if (score >=85 && score <=89) {
            grade = "B+";

        }
        else if (score >=81 && score <=84) {
            grade = "B";

        }
    }
}
