package Singlton;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static List<Integer> maxThree(int[] values) {
        return Arrays.stream(values)
                .filter(value -> (value % 5 == 0) & (value < 300))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int [] arr = {23,56,6457,455,45,35,90,78,555,55,80,87,235};
        System.out.println(maxThree(arr));
    }
}
