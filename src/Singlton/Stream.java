package Singlton;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Stream {

    public static void main(String[] args) {

//        System.out.println(Arrays.asList("1, 2, 3, 4, 5", "6, 7, 8", "90, 34")
//
//                .stream()
//
//                .flatMapToInt(s -> Arrays.asList(s.split(", "))
//                        .stream()
//                        .mapToInt(Integer::parseInt))
//
//                .sum());

//       List list = Arrays.asList(10,2,3);
//       list
//        .stream()
//.limit(2)
//               .sorted()
//        .forEach(System.out::println);

//        IntStream.of(324,42,4234,421,76,999,401)
//                .filter(x->x>400)
//                .map(x->x*2)
//                .sorted()
//                .forEach(System.out::println);

//        Arrays.asList("acs", "sde", "cdk", "ams", "q", "cdk")
//                .stream()
//                .sorted(Collections.reverseOrder())
//                .distinct()
//                .map(x->x.substring(1))
//                .forEach(System.out::println);

//        Arrays.asList("acs", "sde", "cdk", "ams", "q", "cdk")
//                .stream()
//                .filter("ams"::equals)
//                .forEach(System.out::println);

//        System.out.println(Arrays.asList(6, 2, 3, 7, 2, 5)
//                .stream()
//                .filter(x -> x % 2 != 0)
//                .mapToInt(value -> value)
//                .sum());

//        System.out.println(   Arrays.asList(6, 2, 3, 7, 2, 5)
//                .stream()
//                .map(i -> i-1)
//                .mapToDouble(value -> value)
//                .average());

//        int x = (int) b;
//        int m =c;
//        System.out.println(x);

//        Integer i1 = 100;
//        int i2 = 100;
//        Integer i3 = 10;
//        Integer i4 = 10;
//        int i42 = 10;
//        Integer i5 = 200;
//        Integer i6 = 200;
//        Integer i7 = null;
//        System.out.println(i2 == i1);
//        System.out.println(i3 == i4);
//        System.out.println(i3 == i42);
//        System.out.println(i5 == i6);
//        System.out.println(i6 == i7);
//        System.out.println(i2 == i7);


//        Object [] objects = new Object[5];
//        String [] strings = (String[]) objects;

        int year = 3331;
        String temp = Integer.toString(year);

        int[] ints = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            ints[i] = temp.charAt(i) - '0';
        }

   while (check(ints)) {
       year++;
change(year);

        };

//        for (int j = 0; j < temp.length() - 1; j++) {
//            for (int k = 1; k < temp.length(); k++) {
//                if (ints[j] == ints[k]) {
//                    year++;
//                }
//            }
//        }
        System.out.println(year);
    }
public static int [] change (int year){
    String temp = Integer.toString(year);

    int[] ints = new int[temp.length()];
    for (int i = 0; i < temp.length(); i++) {
        ints[i] = temp.charAt(i) - '0';
    }
    return ints;
}

    public static boolean check(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int k = 1; k < array.length; k++) {
                if (array[j] == array[k]) {
                    return true;
                }
            }
        }
        return false;
    }


//
//        char[] charToArray = m.toCharArray();
//        char[] sortedChar = new char[charToArray.length];
//        for (int i = 0; i < charToArray.length; i++) {
//            sortedChar[0] = charToArray[0];
//            if (charToArray[i] > sortedChar[i]) {
//                sortedChar[i] = charToArray[i];
//            }
//            else {
//
//            }
//
//
//            //  System.out.println(sortedChar[i]);
//
//        }


}


//Arrays.asList(«acs», «sde», «cdk», «ams», «q», «cdk»
//
//        1. Відсортувати колекцію строк по алфавіту в протилежному порядку і прибрати всі дублікати.
//
//        2. Знайти чи існує хоч один елемент «ams» в колекції починаючи з середини колекції
//
//        3. Прибрати перший символ кожного елемента в колекції і повернути результат у відсортованому вигляді
//
//        4. Перетворити в map, згрупувавши по першому символу
//        Arrays.asList(6, 2, 3, 7, 2, 5)
//
//        1. Повернути суму непарних числел або 0, якщо таких не існує
//
//        2. Відняти від кожного елемента що стоїть на непарній позиції 1 і отримати середнє арифметичне всіх непарних чисел.
//
//        3. Поділити числа на парні і непарні, вивести результат