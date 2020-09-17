package study10;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", new Integer(10));
        treeMap.put("banana", new Integer(5));
        treeMap.put("grape", new Integer(12));
        treeMap.put("peach", new Integer(14));

        NavigableMap<String,Integer> rangeMap = treeMap.subMap("a", true, "f", true);
        for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
