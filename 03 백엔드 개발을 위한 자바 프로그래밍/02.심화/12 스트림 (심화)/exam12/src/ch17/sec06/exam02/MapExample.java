package ch17.sec06.exam02;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5};
        double[] doubles = Arrays.stream(intArray)
                        .mapToDouble(x->x*1.0)
                                .toArray();
        for(double a : doubles)
        {
            System.out.println(a);
        }
        System.out.println();
        Arrays.stream(intArray).forEach(System.out::println);
    }
}