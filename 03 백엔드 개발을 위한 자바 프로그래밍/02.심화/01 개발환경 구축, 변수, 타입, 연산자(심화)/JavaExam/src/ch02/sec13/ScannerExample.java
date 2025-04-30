package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
    //스캐너 메소드 불러오기
    Scanner sc = new Scanner(System.in);

    //x,y 값 입력 받기
    System.out.printf("x값 입력 : ");
    int x = sc.nextInt();
    System.out.println();
    System.out.printf("y값 입력 : ");
    int y = sc.nextInt();

    //결과 출력
    int result = x+y;
    System.out.println();
    System.out.println("x + y = "+result);


    boolean flag = true;
    while (flag) {
        //입력 문자 받기
        System.out.println("문자를 입력하세요. q를 입력하면 프로그램을 종료합니다.");

        System.out.printf("입력 문자열 : ");
        String str1 = sc.next();

        if(str1.equals("q")) {
            System.out.printf("출력 문자열 : ");
            System.out.println(str1);
            System.out.println("종료");
            flag = false;
        }
        else {
            System.out.printf("출력 문자열 : ");
            System.out.println(str1);
            flag = true;
        }

    }


    }
}