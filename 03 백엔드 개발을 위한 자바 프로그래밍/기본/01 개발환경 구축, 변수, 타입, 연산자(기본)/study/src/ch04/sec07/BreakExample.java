package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) throws Exception {

        int i = 0;
        boolean flag = true;
        while (flag) {
            i = (int) (Math.random() * 6 + 1);
            switch (i) {
                case 1:
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println(i);
                    break;
                case 3:
                    System.out.println(i);
                    break;
                case 4:
                    System.out.println(i);
                    break;
                case 5:
                    System.out.println(i);
                    break;
                case 6:
                    System.out.println(i);
                    flag = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }

    }
}
