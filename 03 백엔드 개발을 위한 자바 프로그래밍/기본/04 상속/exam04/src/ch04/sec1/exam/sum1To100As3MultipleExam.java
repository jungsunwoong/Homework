package ch04.sec1.exam;

public class sum1To100As3MultipleExam {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0 ; i<101; i++){
            if(i%3==0){
                sum += i;
            }
            else if(i%3!=0){
                sum = sum;
            }
        }
        System.out.println(sum);
    }
}
/**
 * for
 *
 *
 *
 * */