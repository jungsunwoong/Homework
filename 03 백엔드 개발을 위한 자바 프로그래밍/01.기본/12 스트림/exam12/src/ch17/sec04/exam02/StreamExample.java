package ch17.sec04.exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동","신용권","김미나"};
      Stream<String> stream = Arrays.stream(strArray);
        stream.forEach(a->System.out.print(a+" "));
        System.out.println();

        int[] intArray = {1,2,3,4,5};
        Arrays.stream(intArray)
                .forEach(a->System.out.print(a+" "));

    }
}
