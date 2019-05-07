import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("Hel[.l]o world[^!]?");
        Matcher matcher = p.matcher("Hel.o world%");

        // 123 456 890 => \d{3,3} \d{3,3} \d{3,3}
        // 1234567890

        // abc

        boolean matches = matcher.matches();
        System.out.println(matches);

        String input = "qwe";

        boolean matches1 = input.matches("\\w*");
        System.out.println(matches1);


        List<String> strings = Arrays.asList("1", "2", "3");

        Pattern p1 = Pattern.compile("\\w*");
        for (String s : strings) {
            boolean m = p1.matcher(s).matches();
            System.out.println(m);
        }



    }
}
