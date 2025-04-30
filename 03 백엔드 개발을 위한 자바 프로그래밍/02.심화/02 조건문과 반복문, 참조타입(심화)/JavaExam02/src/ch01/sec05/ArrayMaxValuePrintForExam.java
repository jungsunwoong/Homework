package ch01.sec05;

public class ArrayMaxValuePrintForExam {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = 0;
        for (int i =0 ; i< array.length-1; i++) {
            max = (array[i] > array[i+1]) ? array[i] : array[i+1];

        }
        System.out.println(max);
    }
}
