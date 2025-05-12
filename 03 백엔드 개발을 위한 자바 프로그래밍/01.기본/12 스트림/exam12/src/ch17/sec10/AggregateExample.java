package ch17.sec10;
import java.util.*;
import java.util.stream.Collectors;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        //2의 배수 카운팅
        List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int result = (int)intList.stream()
                .filter(x->x % 2 ==0)
                .count();
        System.out.println(result);

        //2의 배수 총합
        int sum1 = intList.stream()
                .filter(x-> x % 2 ==0 )
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);

        //2의 배수 평균
        double sum2 = intList.stream()
                .filter(x-> x % 2 ==0 )
                .mapToInt(Integer::intValue)
                .average()
                        .orElse(0.0);
        System.out.println(sum2);

        //2의 배수 중 최대값
        OptionalInt max = intList.stream()
                .filter(x->x%2==0)
                .mapToInt(Integer::intValue)
                        .max();
        System.out.println(max);

        //2의 배수 중 최소값
        OptionalInt min = intList.stream()
                .filter(x->x%2==0)
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(min);

        //첫 번째 3의 배수
        OptionalInt a = intList.stream()
                .filter(x->x%3==0)
                .mapToInt(Integer::intValue)
                .findFirst();
        System.out.println(a);
    }
}