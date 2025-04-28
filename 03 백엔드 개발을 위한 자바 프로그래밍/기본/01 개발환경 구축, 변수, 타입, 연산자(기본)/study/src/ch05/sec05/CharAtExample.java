package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char gender = ssn.charAt(6);
//        System.out.println(gender);
        if (gender == '1') {
            System.out.println("남자입니다");
        }
        else if (gender == '2') {
            System.out.println("여자입니다");
        }
        if (ssn.length() == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다");
        }
        else {
            System.out.println("유효한 주민등록번호가 아닙니다");
        }
    }
}
