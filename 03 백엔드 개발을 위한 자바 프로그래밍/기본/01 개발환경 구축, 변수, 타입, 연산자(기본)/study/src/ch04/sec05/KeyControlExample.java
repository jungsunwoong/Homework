package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = 0;
        int num = 0;

        while (num != 3) {
            System.out.println("----------------------");
            System.out.println(""" 
                1.증속 | 2.감속 | 3.중지""");
            System.out.println("----------------------");
            System.out.println("선택 :");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    speed = speed + 1;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case 2:
                    speed = speed - 1;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case 3:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    break;
            }
        }
    }
}
