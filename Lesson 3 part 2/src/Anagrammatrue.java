import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagrammatrue {

    public static boolean IstrueAnagrama (List<String> s, List<String> t) {

         String s_IstrueAnagrama =String.join("", s).toLowerCase().replaceAll("\\s+", "");// Arrays.toString(s.toArray());
        String t_IstrueAnagrama=String.join("", t).toLowerCase().replaceAll("\\s+", ""); //Arrays.toString(t.toArray());

        if (s_IstrueAnagrama.length()!=t_IstrueAnagrama.length()) {
            return false;}

        char[] sChar =s_IstrueAnagrama.toCharArray();
        char[] tChar =t_IstrueAnagrama.toCharArray();

        Arrays.sort(sChar) ;
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);

    }
}
