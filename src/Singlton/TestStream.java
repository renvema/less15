package Singlton;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestStream {

    public static List<Integer> maxThree(int[] values) {
        //Дано масив чисел. Потрібно знайти три найбільші числа, які не перевищують значення 300 і націло діляться на 5.
        return Arrays.stream(values)
                .filter(ints -> (ints % 5 == 0) & (ints < 300))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
    }
    public static List<Integer> evenNumber() {
        return  IntStream.rangeClosed(0,15)
                .filter(value -> value%2==0)
                .map(operand -> operand*2)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
    public static List<Integer> evenOddNumber() {
        return  IntStream.rangeClosed(0,15)
                .filter(value -> value%2==0)
                .map(operand -> operand*2)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        int[] values = {345, 34, 85, 90, 234, 655, 35, 7445, 56, 45, 25};
        System.out.println(maxThree(values));
        System.out.println(evenNumber());
    }
}

//Серед чисел від 0 до 15 включно, вибрати парні і збільшити їх значення у двічі. Результати виввести за спаданням. rangeClosed()



