package ch01.sec07;

import java.util.Scanner;

public class AccontExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deposit = 0, withdraw = 0, balance = 0;
        boolean flag = true;
        while(flag) {
            System.out.println("---------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.println("선택 > ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("예금액 : ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.printf("%d 원이 예금 되었습니다.\n", deposit);
                    break;
                case 2:
                    System.out.println("출금액 : ");
                    withdraw = sc.nextInt();
                    balance = balance - withdraw;
                    System.out.printf("%d 원이 출금 되었습니다.\n", withdraw);
                    break;
                case 3:
                    System.out.println("잔고 : " + balance);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    flag = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
                    break;
            }
        }
        sc.close();
    }
}
