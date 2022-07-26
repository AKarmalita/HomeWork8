import java.util.*;

public class Collections {

    public static void text (String str)   {
        Set<String> list = new HashSet<>(Arrays.asList(str.split(", ")));
        for (String l:list){
            String a=l.substring(0,1).toUpperCase();
            String b=l.substring(1);
            String word=a+b;
            System.out.println(word);
        }

    }


}
