package study10;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("ever");
        treeSet.add("forever");

        NavigableSet<String> rangeSet = treeSet.subSet("a", true, "f", true);
        for (String word : rangeSet) {
            System.out.println(word);
        }
    }
}
