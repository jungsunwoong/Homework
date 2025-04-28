package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        boolean q = true;
        while (q) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
        if (input.equals("q")) {
            q = false;
            System.out.println("프로그램 종료2");
            sc.close();
        }
        }

    }
}
