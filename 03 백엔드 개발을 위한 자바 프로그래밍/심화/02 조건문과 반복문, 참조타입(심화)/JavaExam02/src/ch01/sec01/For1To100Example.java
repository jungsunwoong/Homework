package ch01.sec01;

public class For1To100Example {
    public static void main(String[] args) {
            int sum = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 3 ==0)
            {
                sum = sum + i;
                System.out.printf("%d : %d\n", i, sum);
            }

        }
        System.out.println(sum);
    }
}
