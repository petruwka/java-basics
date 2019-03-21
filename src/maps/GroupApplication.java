package maps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupApplication {

    static String text = "Bach enriched established German styles through his mastery of counterpoint, harmonic and motivic organisation, and his adaptation of rhythms, forms, and textures from abroad, particularly from Italy and France. Bach's compositions include hundreds of cantatas, both sacred and secular.[4] He composed Latin church music, Passions, oratorios, and motets. He often adopted Lutheran hymns, not only in his larger vocal works, but for instance also in his four-part chorales and his sacred songs. He wrote extensively for organ and for other keyboard instruments. He composed concertos, for instance for violin and for harpsichord, and suites, as chamber music as well as for orchestra. Many of his works employ the genres of canon and fugue.";

    public static void main(String[] args) {
        // letter -> count;

        // Stream API

        Map<Character, Integer> letters = new HashMap<>();
        String[] words = text.split(" ");

        Map<Character, Long> groupedWords = Arrays.stream(words).collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        Map.Entry<Character, Long> max1 = groupedWords.entrySet().stream().max(Comparator.comparing(e -> e.getValue())).get();

        System.out.println(groupedWords);
        System.out.println(max1);

        for (String s : words) {
            if (s.length() == 0) {
                continue;
            }
            char key = s.charAt(0);
            int count = letters.getOrDefault(key, 0);
            count++;
            letters.put(key, count);
        }

        Set<Map.Entry<Character, Integer>> entries = letters.entrySet();

        Map.Entry<Character, Integer> max = null;
        for (Map.Entry<Character, Integer> e : entries) {
            int value = e.getValue();
            if (max == null || value > max.getValue()) {
                max = e;
            }
        }

        System.out.println(letters);
        System.out.println("the most popular first letter with score " + max.getValue() + " is: " + max.getKey());

    }

}
