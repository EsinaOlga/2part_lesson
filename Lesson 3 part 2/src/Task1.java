import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task1 {
    public static void main(String[] args) {
        List<String> elementt = List.of("слон", "слон", "слон", "кот", "собака");
        elementt.stream()
                .distinct()//уникальные значения
                .forEach(System.out::println);

//2 вариант
        // Set<String> uniq= new HashSet<>(elementt);
        //for (String key:uniq) {
        //    System.out.println(key);}
//}

        // List<String> element = new ArrayList<>();
        //element.add("слон");
        //element.add("слон");
        //element.add("слон");
        //element.add("кошка");
        //System.out.println(element);

//}
    }
}

