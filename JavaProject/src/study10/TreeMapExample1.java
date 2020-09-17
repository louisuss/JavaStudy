package study10;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(new Integer(87), "kim");
        scores.put(new Integer(90), "lee");
        scores.put(new Integer(67), "park");
        scores.put(new Integer(45), "kang");
        scores.put(new Integer(32), "jo");
        scores.put(new Integer(90), "yu");

        Map.Entry<Integer, String> entry = null;

        entry = scores.lastEntry();
        System.out.println(entry.getKey() + " " + entry.getValue());

        entry = scores.firstEntry();
        System.out.println(entry.getKey() + " " + entry.getValue());

        entry = scores.lowerEntry(new Integer(95));
        System.out.println(entry.getKey() + " " + entry.getValue());

        entry = scores.higherEntry(new Integer(80));
        System.out.println(entry.getKey() + " " + entry.getValue());

        while (!scores.isEmpty()) {
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + " " + entry.getValue() + " " + scores.size());
        }
    }
}
