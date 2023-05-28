package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 2, 7, 1, 9);

        Stream<Integer> data = nums.stream();

        // long count = data.count();
        // System.out.println(count);

        // Stream<Integer> sortedData = data.sorted();
        // sortedData.forEach(n -> System.out.println(n));
        nums.stream()
        .filter(n -> n%2 == 1)
        .sorted()
        .map(n -> n*2)
         .forEach(n -> System.out.println(n));
    }
}
