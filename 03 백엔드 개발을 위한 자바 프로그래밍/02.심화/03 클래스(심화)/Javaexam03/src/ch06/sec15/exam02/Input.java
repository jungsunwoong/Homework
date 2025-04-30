package ch06.sec15.exam02;

import java.util.Scanner;

public class Input {
    //멤버 변수 스캐너 정적 초기화
    public static Scanner sc = new Scanner(System.in);

    // 문자열 입력 메소드 오버로딩 1
    public static String read(String title) {
        System.out.printf("%s : ", title);
        return sc.nextLine();
    }

    // 문자열 입력 메소드 오버로딩 2
    public static String read(String title, String defaultValue) {
        System.out.printf("%s : ", title);

        // 입력값이 비어있을 경우 디폴트 값 리턴
        if(sc.nextLine() == null){
            return defaultValue;
        }
        else{
            return sc.nextLine();
        }
    }
    public static int readInt(String title){
        System.out.printf("%s : ", title);
        return sc.nextInt();
    }
    public static boolean confirm(String title, boolean defaultValue) {
        System.out.printf("%s (Y/N) : ",title);
        sc.nextBoolean();
        if(defaultValue == true){
            System.out.println("(Y/n)");
        }
        else if(defaultValue == false){
            System.out.println("(y/N)");
        }
        else {
            return defaultValue;
        }
        return sc.nextBoolean();
    };
    public static boolean confirm(String title) {
        confirm(title, false);
        return sc.nextBoolean();
    }
}
