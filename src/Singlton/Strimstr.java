package Singlton;

import java.util.Arrays;

public class Strimstr {
    public static void main(String[] args) {
        System.out.println((Arrays.asList("acs", "sde", "cdk", "ams", "q", "cdk"))
        .stream()
        .map(s -> s.split(", "))

        .sorted());
    }


}

//Arrays.asList(«acs», «sde», «cdk», «ams», «q», «cdk»
//
//        1. Відсортувати колекцію строк по алфавіту в протилежному порядку і прибрати всі дублікати.
//
//        2. Знайти чи існує хоч один елемент «ams» в колекції починаючи з середини колекції
//
//        3. Прибрати перший символ кожного елемента в колекції і повернути результат у відсортованому вигляді