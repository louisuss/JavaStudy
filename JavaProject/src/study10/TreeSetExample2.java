package study10;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(90));
        scores.add(new Integer(77));
        scores.add(new Integer(57));
        scores.add(new Integer(97));

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (Integer score : descendingSet) {
            System.out.println(score);
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();

        for (Integer score : ascendingSet) {
            System.out.println(score);
        }
    }
}
