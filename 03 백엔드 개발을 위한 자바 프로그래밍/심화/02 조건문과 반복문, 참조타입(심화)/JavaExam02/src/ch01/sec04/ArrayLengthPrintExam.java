package ch01.sec04;

public class ArrayLengthPrintExam {
    public static void main(String[] args) {
    int[][] array = {
            {95,86},
            {83,92,96},
            {78,83,93,87,88}
    };
        System.out.println(array.length); // 3 2차원 배열에서 세로 줄을 의미한다 객체 배열의 갯수를 출력
        System.out.println(array[2].length); // 5 2차원 배열에서 가로 줄을 의미한다 객체의 배열 개수를 출력
    }
}
