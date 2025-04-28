package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

       for (int i = 0; i < season.length; i++) {
           System.out.printf("season[%d] = %s\n",i,season[i]);
       }





        int[] scores = {83,90,87};
        int sum = scores[0] + scores[1] + scores[2];
        float average = sum / 3f;
        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+average);
    }
}
