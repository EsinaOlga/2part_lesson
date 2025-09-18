import java.util.HashSet;
import java.util.List;
import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        List<String> set1 = List.of("1", "2", "3");
        List<String> set2 = List.of("0", "1", "2", "4");

        Set<String> set11_int = new HashSet<>(set1);

        set11_int.retainAll(set2);
        // return set11;
        for (String key : set11_int) {
       //     System.out.println("Пересечение двух массивов - "+ key);
        }
        // Вывод всех объединений в одну строку
        System.out.println("Пересечение двух массивов: " + String.join(", ", set11_int));
        Set<String> set12_add = new HashSet<>(set1);
        set12_add.addAll(set2);
        for (String key : set12_add) {
       //     System.out.println("Объединение двух массивов - "+key);
        }
        // Вывод всех объединений в одну строку
        System.out.println("Все объединения: " + String.join(", ", set12_add));        Set<String> set13_rem = new HashSet<>(set1);
        set2.forEach(set13_rem::remove);
        for (String key : set13_rem) {
        //    System.out.println("Элементы первого набора без тех которые есть во втором- "+key);
        }
        // Вывод всех объединений в одну строку
        System.out.println("Элементы первого набора без тех которые есть во втором: " + String.join(", ", set13_rem));
    }
}





