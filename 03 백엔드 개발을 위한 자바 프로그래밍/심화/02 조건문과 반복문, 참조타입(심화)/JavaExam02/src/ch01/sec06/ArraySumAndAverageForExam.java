package ch01.sec06;

public class ArraySumAndAverageForExam {
    public static void main(String[] args) {
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,88}
        };
        int sum = 0;
        int average = 0;
        int length = 0;
        for(int i = 0; i < array.length; i++) {
                length += array[i].length;
            for(int j = 0 ; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        average = sum / length;
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
