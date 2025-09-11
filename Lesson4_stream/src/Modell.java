import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Modell {
    public static void main(String[] args) {
        List<String> modell = List.of("мерседес", "волга", "лексус", "тойота", "бмв");
        modell.stream()
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

