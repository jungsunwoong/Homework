package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        System.out.println(strVar2 == strVar1); //false
        System.out.println(strVar1.equals(strVar2)); //true
        // == 으로 두 변수 비교
        // 내용으로 두 변수 비교
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
        System.out.println(strVar3 == strVar4); // false
        System.out.println(strVar3.equals(strVar4)); // true
        // == 으로 두 변수 비교
        // 내용으로 두 변수 비교
    }
}
