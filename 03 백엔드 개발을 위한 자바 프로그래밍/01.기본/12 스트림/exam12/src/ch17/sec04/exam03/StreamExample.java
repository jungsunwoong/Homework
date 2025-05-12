package ch17.sec04.exam03;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i=0; i<arr.length;i++){
            arr[i] = i+1;
        }
        Arrays.stream(arr).forEach(a->sum+=a);
        System.out.println("총합 : " + sum);
    }
}
