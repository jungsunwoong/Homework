package ch17.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        // 중복 요소 제거
        List<String> result = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
        // 신으로 시작하는 요소만 필터링
        List<String> result1 = list.stream()
                .filter(w->w.contains("신"))
                .collect(Collectors.toList());
        System.out.println(result1);
        // 중복 요소를 제거하고, 신으로 시작하는 요소만 필터링
        result = result.stream()
                .filter(w->w.contains("신"))
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
