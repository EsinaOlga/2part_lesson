import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Locale.filter;

class Task2_Anagramma {
   public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
//String s = scanner.nextLine().trim();
//String t = scanner.nextLine().trim();
//System.out.println();
      List<String> s =new ArrayList<>();
      s.add("Бейсбол");
      s.add("Героин");
      s.add("Клоака");

      List<String> t =new ArrayList<>();
      t.add("Бобслей");
      t.add("Регион");
      t.add("Околка");
      System.out.println(s);
      System.out.println(t);
      // boolean Anagrammatrue1 = new Anagrammatrue.IstrueAnagrama(s, t);
       String ss = String.join(", ", s);
       String tt = String.join(", ", t);
       System.out.println(ss);
       System.out.println(tt);
//Stream<String> stream;
      // stream = t.stream();
      // List<Locale> filter = filter(Character::isLetterOrDigit);
      // 
       //filter(Character::isLetterOrDigit);

       for (int i = 0; i<s.size(); i++)
       //for (String i:s) {
       {boolean result = Anagrammatrue.IstrueAnagrama(Collections.singletonList(ss), Collections.singletonList(tt));
            //boolean result = Anagrammatrue.IstrueAnagrama(Collections.singletonList(ss.getChars(i)), Collections.singletonList(tt.getChars(i)));

           System.out.println("\"" + s.get(i) + "\" и \"" + t.get(i) + "\" - анаграммы" + result);
       }

      // System.out.println(Anagrammatrue1);
}
}
